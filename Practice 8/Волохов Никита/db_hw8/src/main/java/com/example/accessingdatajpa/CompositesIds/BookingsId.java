package com.example.accessingdatajpa.CompositesIds;

import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class BookingsId implements Serializable {

    private int readerNumber;
    private String isbn;
    private int copyNumber;

    public BookingsId() {}

    public BookingsId(int readerNumber, String isbn, int copyNumber) {
        this.readerNumber = readerNumber;
        this.isbn = isbn;
        this.copyNumber = copyNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookingsId that = (BookingsId) o;
        return readerNumber == that.readerNumber && copyNumber == that.copyNumber && Objects.equals(isbn, that.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(readerNumber, isbn, copyNumber);
    }
}