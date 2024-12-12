package com.java.constructors;

public class StudentAdmissionMain {

    public static void main(String[] args) {
        StudentAdmissionPortal s = new StudentAdmissionPortal("Stephin",25,87377283L,"abc@gmail.com");
        StudentAdmissionPortal s1 = new StudentAdmissionPortal("Shubha",27,89977283L,"shubha@gmail.com");
        StudentAdmissionPortal s2 = new StudentAdmissionPortal("Sagar",23,95647283L,"sagar@gmail.com");
        StudentAdmissionPortal s3 = new StudentAdmissionPortal("Dhanush",24,782457283L,"dhanush@gmail.com");
        s.showDetails();
        s1.showDetails();
        s2.showDetails();
        s3.showDetails();
    }
}
