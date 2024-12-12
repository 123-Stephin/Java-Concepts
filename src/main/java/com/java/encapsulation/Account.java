package com.java.encapsulation;

public class Account {
    private long accountNo;
    private String name;
    private double balance;

    public Account(String name, long accountNo){
        this.accountNo = accountNo;
        this.name = name;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
       this.balance = balance;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
