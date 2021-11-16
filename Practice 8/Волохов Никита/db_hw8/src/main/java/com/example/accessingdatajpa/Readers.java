package com.example.accessingdatajpa;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name="readers")
public class Readers {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long number;
    private String firstName;
    private String lastName;
    private Timestamp birthday;
    private String address;
    private Timestamp createdAt;
    private Timestamp updatedAt;

    protected Readers() {}

    public Readers(Long number, String firstName, String lastName, Timestamp birthday, String address, Timestamp createdAt, Timestamp updatedAt) {
        this.number = number;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.address = address;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }


    @Override
    public String toString() {
        return "Readers[" +
                "number=" + number +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthday=" + birthday +
                ", address='" + address + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ']';
    }

    public Long getNumber() {
        return number;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Timestamp getBirthday() {
        return birthday;
    }

    public String getAddress() {
        return address;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }
}