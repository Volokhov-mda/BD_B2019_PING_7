package com.example.accessingdatajpa;

import com.example.accessingdatajpa.CompositesIds.BookCategoriesId;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@IdClass(BookCategoriesId.class)
@Table(name="book_categories")
public class BookCategories {

    @Id
    private String isbn;
    @Id
    private String categoryName;
    private Timestamp createdAt;
    private Timestamp updatedAt;

    protected BookCategories() {}

    public BookCategories(String isbn, String categoryName, Timestamp createdAt, Timestamp updatedAt) {
        this.isbn = isbn;
        this.categoryName = categoryName;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }


    @Override
    public String toString() {
        return "BookCategories[" +
                "isbn='" + isbn + '\'' +
                ", categoryName='" + categoryName + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ']';
    }

    public String getIsbn() {
        return isbn;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }
}