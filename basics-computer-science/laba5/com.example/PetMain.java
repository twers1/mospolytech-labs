package com.example;

import com.example.domain.*;

public class PetMain {

    public static void main(String[] args) {

        Animal a;

        Spider s = new Spider();
        s.eat();
        s.walk();

        Cat c = new Cat("Tom");
        c.eat();
        c.walk();
        c.play();

        a = new Cat();
        a.eat();
        a.walk();

        Pet p;
        p = new Cat();
        p.setName("Mr. Whiskers");
        p.play();

        Fish f = new Fish();
        f.setName("Guppy");
        f.eat();
        f.walk();
        f.play();

        a = new Fish();
        a.eat();
        a.walk();

        Dog d = new Dog("Buddy");
        d.play();

        playWithAnimal(s);
        playWithAnimal(c);
        playWithAnimal(f);
        playWithAnimal(d);
    }

    public static void playWithAnimal(Animal a) {
        if (a instanceof Pet) {
            Pet p = (Pet) a;
            p.play();
        } else {
            System.out.println("Опасно, дикое животное");
        }
    }
}
