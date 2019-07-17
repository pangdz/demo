package com.example.demo.model;

import java.io.Serializable;

public class Book implements Serializable {
    private Long id;
    private String name;
    private String author;
    private String updateTime;

    public Book(String name, String author) {
        super();
        this.name = name;
        this.author = author;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return this.author;
    }

}
