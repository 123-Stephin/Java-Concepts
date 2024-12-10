package com.java.constructors;

public class JobPortalConstructorMain {
    public static void main(String[] args) {

        JobPortalConstructorOverloading jp = new JobPortalConstructorOverloading("Stephin",25,9827178811l,2);
        JobPortalConstructorOverloading jp1 = new JobPortalConstructorOverloading("Amal",25,982772717881l);

        jp.ShowDetails();
        jp1.ShowDetails();

    }
}
