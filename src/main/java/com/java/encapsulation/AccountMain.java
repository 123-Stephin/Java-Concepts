package com.java.encapsulation;

public class AccountMain {
    public static void main(String[] args) {
        Account a = new Account("stephin", 987654321L);

        Account sagar = new Account("sagar", 123456789L);

        System.out.println(a.getBalance());

        a.setBalance(200.0);

        System.out.println(a.getBalance());

        a.setBalance(400);

        System.out.println(a.getBalance());

        System.out.println(a.getName());

        a.setName("stephin abhraham");

        System.out.println(a.getName());

        System.out.println(sagar.getName() +" "+ sagar.getBalance());
    }
}
