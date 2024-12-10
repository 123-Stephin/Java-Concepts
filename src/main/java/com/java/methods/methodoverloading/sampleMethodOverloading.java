package com.java.methods.methodoverloading;

public class sampleMethodOverloading {

    public static void sampleMethodOverloading(int a, int b) {
        System.out.println("Sum of two numbers is: "+ a+b);
    }

    public static void sampleMethodOverloading(long num , String name) {
        System.out.println("number is: "+ num + " and the name is: "+ name);
    }

    public void sampleMethodOverloading(String n2, int age ) {
        System.out.println("the num and age is: "+n2+" and "+age);
    }

    public void sampleMethodOverloading() {
        System.out.println("no argument method");
    }
}
