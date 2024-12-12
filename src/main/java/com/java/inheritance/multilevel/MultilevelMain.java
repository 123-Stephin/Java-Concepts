package com.java.inheritance.multilevel;

public class MultilevelMain {
    public static void main(String[] args) {
        Whatsappv1 v1= new Whatsappv1();
        v1.message();

        WhatsappV2 v2 = new WhatsappV2();
        v2.call();
        v2.message();

        WhatsappV3 v3 = new WhatsappV3();
        v3.message();
        v3.call();
        v3.status();
    }
}
