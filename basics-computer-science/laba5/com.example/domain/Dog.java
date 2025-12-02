package com.example.domain;

public class Dog extends Animal implements Pet {

    private String name;

    public Dog(String name) {
        super(4);
        this.name = name;
    }

    public Dog() {
        super(4);
        this.name = "Пёсик";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println(name + " приносит палку и веселится");
    }

    @Override
    public void eat() {
        System.out.println(name + " грызёт косточку");
    }
}
