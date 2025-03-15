package com.example.itemcatalogservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Item {
    
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    public Item() {
    }

    public Item(String name) {
        this.name = name;
    }

    // getters and setters
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
