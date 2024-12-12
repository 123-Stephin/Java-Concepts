package com.java.constructors;

public class StudentAdmissionPortal {

    String name;
    int age;
    long phonNo;
    String email;

    public StudentAdmissionPortal(String name, int age, long phonNo, String email)
    {
        this.name= name;
        this.age= age;
        this.phonNo= phonNo;
        this.email= email;
    }
    public void showDetails()
    {
        System.out.println(name+" , "+age+ " , "+phonNo+" , "+ email);
    }

}
