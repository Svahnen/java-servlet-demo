package com.example.demo1;

public class Person {
    private String name;
    private String nr;

    public Person(String name, String nr) {
        this.name = name;
        this.nr = nr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNr() {
        return nr;
    }

    public void setNr(String nr) {
        this.nr = nr;
    }
}
