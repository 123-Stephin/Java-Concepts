package com.java.inheritance.hierarchical;

public class AnimalMain {
    public static void main(String[] args) {
        //Dog, Cat and Lion is the child classes of Animal
        Dog d = new Dog();
        Cat c = new Cat();
        Lion l = new Lion();

        d.animal();
        d.bark();

        c.meow();
        c.animal();

        l.roar();
        l.animal();
    }
}
