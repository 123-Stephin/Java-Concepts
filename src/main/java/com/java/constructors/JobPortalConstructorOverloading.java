package com.java.constructors;

public class JobPortalConstructorOverloading {

    String name;
    int age;
    long phno;
    int exp;

    public JobPortalConstructorOverloading(String name,int age, long phno,int exp)
    {
        this.name = name;
        this.age= age;
        this.phno=phno;
        this.exp = exp;
    }
    public JobPortalConstructorOverloading(String name,int age, long phno)
    {
        this.name = name;
        this.age= age;
        this.phno = phno;
    }

    public void ShowDetails()
    {
        System.out.println(name);
        System.out.println(age);
        System.out.println(phno);
        System.out.println(exp);
    }
}
