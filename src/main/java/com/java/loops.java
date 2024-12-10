package com.java;

public class loops {
    public static void main(String[] args) {
        int table = 1;
        int i = 1;
        while (i <= 10) {
            System.out.println(i + " * " + table + " = " + i * table);
            i++;
        }

        System.out.println("----------------------------------");
    i=1;
    int table2=2;
        do {
            System.out.println(i + " * " + table2 + " = " + i * table2);
            i++;
        }
        while (i <= 10);
    }
}