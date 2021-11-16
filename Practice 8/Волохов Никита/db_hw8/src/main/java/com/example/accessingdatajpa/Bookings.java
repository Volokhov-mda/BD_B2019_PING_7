package com.example.accessingdatajpa;

import com.example.accessingdatajpa.CompositesIds.BookingsId;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@IdClass(BookingsId.class)
@Table(name="bookings")
public class Bookings {

    @Id
    private int readerNumber;
    @Id
    private String isbn;
    @Id
    private int copyNumber;
    private Timestamp returnDate;
    private Timestamp createdAt;
    private Timestamp updatedAt;

    protected Bookings() {}

    public Bookings(int readerNumber, String isbn, int copyNumber, Timestamp returnDate, Timestamp createdAt, Timestamp updatedAt) {
        this.readerNumber = readerNumber;
        this.isbn = isbn;
        this.copyNumber = copyNumber;
        this.returnDate = returnDate;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }


    @Override
    public String toString() {
        return "Bookings[" +
                "readerNumber=" + readerNumber +
                ", copyNumber=" + copyNumber +
                ", isbn='" + isbn + '\'' +
                ", returnDate=" + returnDate +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ']';
    }

    public int getReaderNumber() {
        return readerNumber;
    }

    public int getCopyNumber() {
        return copyNumber;
    }

    public String getIsbn() {
        return isbn;
    }

    public Timestamp getReturnDate() {
        return returnDate;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }
}