package com.globant.academy.springdata.entities;

import javax.persistence.*;

import java.util.List;

import static javax.persistence.GenerationType.IDENTITY;

@Entity(name="book")
public class Book {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name="id",nullable = false, updatable = false)
    private int id;

    @Column(name="title",nullable = false)
    private String title;

    @Column(name="published_year",nullable = false)
    private int publishedYear;

    @ManyToMany(mappedBy = "books")
    private List<Author> authors;

    public long getId() {
        return id;
    }

    public long getResourceId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", publishedYear=" + publishedYear +
                '}';
    }
}
