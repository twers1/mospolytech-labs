package com.example.domain;

public class Fish extends Animal implements Pet {

    private String name;

    public Fish() {
        super(0);
        this.name = "Безымянная рыбка";
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
        System.out.println("Рыбка просто плавает");
    }

    @Override
    public void eat() {
        System.out.println("Рыбка ест корм для рыб");
    }
}
