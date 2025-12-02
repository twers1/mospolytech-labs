package com.example;

import com.example.domain.Animal;
import com.example.domain.Cat;
import com.example.domain.Fish;
import com.example.domain.Spider;

public class PetMain {

    public static void main(String[] args) {

        Animal a;

        Spider s = new Spider();
        s.walk();
        s.eat();

        Cat c = new Cat("Том");
        c.walk();
        c.eat();

        a = new Cat();
        a.walk();
        a.eat();

        Fish f = new Fish();
        f.setName("Гуппи");
        f.walk();
        f.eat();

        a = new Fish();
        a.walk();
        a.eat();
    }
}
