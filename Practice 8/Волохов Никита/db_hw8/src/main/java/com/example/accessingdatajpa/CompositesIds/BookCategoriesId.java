package com.example.accessingdatajpa.CompositesIds;

import java.io.Serializable;
import java.util.Objects;

public class BookCategoriesId implements Serializable {

    private String isbn;
    private String categoryName;

    public BookCategoriesId() {}

    public BookCategoriesId(String isbn, String categoryName) {
        this.isbn = isbn;
        this.categoryName = categoryName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookCategoriesId that = (BookCategoriesId) o;
        return Objects.equals(isbn, that.isbn) && Objects.equals(categoryName, that.categoryName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn, categoryName);
    }
}