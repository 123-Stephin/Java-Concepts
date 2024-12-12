package com.java.javabean;

public class JavaBean {

    private String name;
    private int age;

    public String getName()
    {
      return name;
    }
    public int getAge()
    {
        return age;
    }

    public void setName(String name)
    {
        this.name= name;
    }
    public void setAge(int age)
    {
        this.age= age;
    }

    public static void main(String[] args) {

        JavaBean j= new JavaBean();
        j.setName("Stephin");
        j.setAge(25);
        System.out.println("name and age is: "+j.getName() + " , " +j.getAge());

        JavaBean j1= new JavaBean();
//        j1.setName("sagar");
//        j1.setAge(23);
        System.out.println("name and age is: "+j1.getName() + " , " +j1.getAge());
    }
}
