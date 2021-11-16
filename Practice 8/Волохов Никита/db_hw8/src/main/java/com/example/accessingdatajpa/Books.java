package com.example.accessingdatajpa;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name="books")
public class Books {

    @Id
    private String isbn;
    private String title;
    private int year;
    private String author;
    private int pageCount;
    private int publisherName;
    private Timestamp createdAt;
    private Timestamp updatedAt;

    protected Books() {}

    public Books(String isbn, String title, int year, String author, int pageCount, int publisherName, Timestamp createdAt, Timestamp updatedAt) {
        this.isbn = isbn;
        this.title = title;
        this.year = year;
        this.author = author;
        this.pageCount = pageCount;
        this.publisherName = publisherName;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "Books[" +
                "isbn=" + isbn +
                ", title='" + title + '\'' +
                ", year=" + year +
                ", author='" + author + '\'' +
                ", page_count=" + pageCount +
                ", publisher_name=" + publisherName +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ']';
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public String getAuthor() {
        return author;
    }

    public int getPageCount() {
        return pageCount;
    }

    public int getPublisherName() {
        return publisherName;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }
}