package com.co.sofka.demo.model;


public class Person {

    private Long id;
    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
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
}
