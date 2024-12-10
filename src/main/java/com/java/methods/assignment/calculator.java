package com.java.methods.assignment;

public class calculator {

    public void calculator(int a, int b) {
        System.out.println(a+b);
    }
    public void calculator(int a, int b, int c) {
        int num=(a+b/c);
        System.out.println(num);
    }
    public void calculator(double a,int b){
        System.out.println(a*b);
    }
    public void calculator(int a,int b, int c,int d){
        int n= (a+b/(c*d));
        System.out.println(n);
    }

    public static void main(String[] args) {
        calculator c= new calculator();
        c.calculator(11,90);
        c.calculator(10,2,2);
        c.calculator(11.00,10);
        c.calculator(112,60,25,9);
    }
}
