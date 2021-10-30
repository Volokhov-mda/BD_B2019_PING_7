# Курс "Базы данных"

## Домашняя работа 6. Волохов Никита Алексеевич, БПИ197

**а) Для Олимпийских игр 2004 года сгенерируйте список (год рождения, количество игроков, количество золотых медалей), содержащий годы, в которые родились игроки, количество игроков, родившихся в каждый из этих лет, которые выиграли по крайней мере одну золотую медаль, и количество золотых медалей, завоеванных игроками, родившимися в этом году.**
```sql
SELECT EXTRACT(YEAR FROM p.birthdate) as date_of_birth,
       COUNT(DISTINCT p.player_id)    as num_of_gold_players,
       COUNT(r.medal)                 as num_of_gold_medals
    FROM players as p
        JOIN results r  on p.player_id = r.player_id
        JOIN events e   on r.event_id = e.event_id
        JOIN olympics o on e.olympic_id = o.olympic_id
WHERE r.medal = 'GOLD' AND o.year = 2004
GROUP BY EXTRACT(YEAR FROM p.birthdate)
```
**б) Перечислите все индивидуальные (не групповые) соревнования, в которых была ничья в счете, и два или более игрока выиграли золотую медаль.**
```sql
SELECT e.event_id
    FROM events as e
        JOIN results r on e.event_id = r.event_id
WHERE e.is_team_event = 0 AND r.medal = 'GOLD'
GROUP BY e.event_id HAVING count(r.medal) > 1
```
**в) Найдите всех игроков, которые выиграли хотя бы одну медаль (GOLD, SILVER и BRONZE) на одной Олимпиаде. (player-name, olympic-id).**
```sql
SELECT DISTINCT p.name, e.olympic_id
FROM players p
     JOIN results r ON p.player_id = r.player_id
     JOIN events e  ON e.event_id = r.event_id
```
**г) В какой стране был наибольший процент игроков (из перечисленных в наборе данных), чьи имена начинались с гласной?**
```sql
WITH names AS (
    SELECT p.country_id, COUNT(p) as num_of_players FROM players p
    WHERE LEFT(p.name, 1) IN ('A', 'a', 'E', 'e', 'I', 'i', 'O', 'o', 'U', 'u')
    GROUP BY p.country_id
),
players_by_country AS (
    SELECT p.country_id, COUNT(DISTINCT p) AS num_of_players
    FROM players p
    GROUP BY p.country_id
)

SELECT names.country_id
    FROM names
        JOIN players_by_country ON names.country_id = players_by_country.country_id
GROUP BY names.country_id, names.num_of_players, players_by_country.num_of_players
ORDER BY CAST(names.num_of_players AS decimal) / players_by_country.num_of_players DESC
LIMIT 1
```
**д) Для Олимпийских игр 2000 года найдите 5 стран с минимальным соотношением количества групповых медалей к численности населения.**
```sql
SELECT c.country_id
FROM olympics o
     JOIN events e    ON e.olympic_id = o.olympic_id
     JOIN results r   ON e.event_id = r.event_id
     JOIN players p   ON p.player_id = r.player_id
     JOIN countries c ON c.country_id = p.country_id
WHERE o.year = 2000 AND e.is_team_event = 1
GROUP BY c.country_id, c.population
ORDER BY CAST(COUNT(r.medal) AS decimal) / c.population
LIMIT 5
```
