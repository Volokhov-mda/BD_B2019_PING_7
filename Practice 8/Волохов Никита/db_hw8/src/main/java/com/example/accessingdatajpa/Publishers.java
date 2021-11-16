package com.example.accessingdatajpa;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name="publishers")
public class Publishers {

    @Id
    private String name;
    private String address;
    private Timestamp createdAt;
    private Timestamp updatedAt;

    protected Publishers() {}

    public Publishers(String name, String address, Timestamp createdAt, Timestamp updatedAt) {
        this.name = name;
        this.address = address;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }


    @Override
    public String toString() {
        return "Publishers[" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ']';
    }

    public String getName() {
        return name;
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