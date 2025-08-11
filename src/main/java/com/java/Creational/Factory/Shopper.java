package com.java.Creational.Factory;

public class Shopper implements Person {

    private String name;

    public Shopper(String name) {
        this.name = name;
    }


    @Override
    public void speak() {
        System.out.println("I am Shopper Class");
        System.out.println("Hello! my Name is: " + name);
    }
}
