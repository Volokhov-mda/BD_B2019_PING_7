package com.example.accessingdatajpa;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name="categories")
public class Categories {

    @Id
    private String name;
    private String parentName;
    private Timestamp createdAt;
    private Timestamp updatedAt;

    protected Categories() {}

    public Categories(String name, String parentName, Timestamp createdAt, Timestamp updatedAt) {
        this.name = name;
        this.parentName = parentName;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }


    @Override
    public String toString() {
        return "Categories[" +
                "name='" + name + '\'' +
                ", parentName='" + parentName + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ']';
    }

    public String getName() {
        return name;
    }

    public String getParentName() {
        return parentName;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }
}