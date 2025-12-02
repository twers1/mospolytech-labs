package com.example.domain;

public class Cat extends Animal implements Pet {

    private String name;

    public Cat(String name) {
        super(4);
        this.name = name;
    }

    public Cat() {
        super(4);
        this.name = "Безымянный кот";
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
        System.out.println(name + " любит играть с верёвочкой");
    }

    @Override
    public void eat() {
        System.out.println(name + " ест кошачий корм");
    }
}
