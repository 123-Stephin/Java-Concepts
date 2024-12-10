package com.java.constructors.constructorchaining;

public class sampleConstructorChaining {
    public sampleConstructorChaining() {
        this(10,12);
        System.out.println("This is a zero argument constructor");
    }

    public sampleConstructorChaining(int a, int b, int c) {
        System.out.println("addition="+ (a+b+c));
    }

    public sampleConstructorChaining(int a, int b){
        this(13,12,34);
        System.out.println(a*b);
    }

    public static void main(String[] args) {
        sampleConstructorChaining s=  new sampleConstructorChaining();
    }
}
