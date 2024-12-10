package com.java;

public class ReverseNumber {
    int a=123;
    int i=0;

    public static void main(String[] args) {
//        System.out.println(123 % 10);
//        System.out.println(123 / 10);
//        System.out.println(12 / 10);
//        System.out.println(1 / 10);

        int a=123;
        while (a != 0){
            System.out.println(a%10);
            a= a/10;
        }
    }
}
