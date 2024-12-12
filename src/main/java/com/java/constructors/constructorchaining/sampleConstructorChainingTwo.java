package com.java.constructors.constructorchaining;

public class sampleConstructorChainingTwo {

    public sampleConstructorChainingTwo()
    {
        this(21,28);
        System.out.println("sample2 example");
    }
    public sampleConstructorChainingTwo(int a, int b)
    {
        this(17,88.9);
        System.out.println(a+b);
    }
    public sampleConstructorChainingTwo(int a , double b)
    {
        this(11.412f,88.75,2);
        System.out.println(a*b);
    }
    public sampleConstructorChainingTwo(float a, double b, int c)
    {
        System.out.println(a+b/c);
    }

    public static void main(String[] args) {

        sampleConstructorChainingTwo s2= new sampleConstructorChainingTwo();
    }
}
