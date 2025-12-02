package com.example.domain;

public abstract class Animal {
    protected int legs;

    protected Animal(int legs) {
        this.legs = legs;
    }

    public void walk() {
        System.out.println("Животное идет на " + legs + " лапах");
    }

    public abstract void eat();
}
