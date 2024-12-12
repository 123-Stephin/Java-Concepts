package com.java.inheritance.singleinheritance.example1;

public class SingleMain {
    public static void main(String[] args) {

        //we cannot access the prop of child class using parent objects
        Father f = new Father();

        f.home();
        System.out.println(f.car);

        //but we can access the prop of both child class  and parent class  using child class  objects
        Son s = new Son();
        System.out.println(s.sonCar);
        s.land();

        s.home();
        System.out.println(s.car);
    }
}
