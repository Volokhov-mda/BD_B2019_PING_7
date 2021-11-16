package com.example.accessingdatajpa;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name="copies")
public class Copies {

    @Id
//    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long number;
    private String isbn;
    private String position;
    private Timestamp createdAt;
    private Timestamp updatedAt;

    protected Copies() {}

//    public Copies(String firstName, String lastName) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//    }

    @Override
    public String toString() {
        return "Copies[" +
                "number=" + number +
                ", isbn='" + isbn + '\'' +
                ", position='" + position + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ']';
    }

    public Long getNumber() {
        return number;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getPosition() {
        return position;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }
}