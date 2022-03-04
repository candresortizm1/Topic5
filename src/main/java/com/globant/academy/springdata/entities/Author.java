package com.globant.academy.springdata.entities;

import org.springframework.data.rest.core.annotation.RestResource;

import javax.persistence.*;

import java.util.List;

import static javax.persistence.GenerationType.IDENTITY;

@Entity(name="author")
public class Author {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name="id",updatable = false,columnDefinition = "SERIAL")
    private long id;

    @Column(name="full_name",nullable = false)
    private String fullName;

    @Column(name="country",nullable = false)
    private String country;

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "book_author", 
            joinColumns = @JoinColumn(name = "book_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "author_id",
                    referencedColumnName = "id"))
    private List<Book> books;

    public long getId() {
        return id;
    }

    public long getResourceId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", full_name='" + fullName + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
