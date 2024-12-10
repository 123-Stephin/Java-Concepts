package com.java.constructors;

public class ConstructorSamples {

     public ConstructorSamples()
    {
        System.out.println("This is a zero agrument contructor");
    }
    public ConstructorSamples(int a, int b){
        System.out.println(a+b);
    }
    public ConstructorSamples(String name, int n)
    {
        System.out.println("My name is " + name + " and my age is "+ n);
    }

    public static void main(String[] args) {

        ConstructorSamples c = new ConstructorSamples();
        ConstructorSamples c1 = new ConstructorSamples(10,18);
        ConstructorSamples c2 = new ConstructorSamples("Stephin",25);
    }
}
