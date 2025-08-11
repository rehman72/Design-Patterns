package com.java.Creational.Factory;

public class Officer implements Person {

    private String name;

    public Officer(String name) {
        this.name = name;
    }


    @Override
    public void speak() {
        System.out.println("I am Officer Class");
        System.out.println("Hello! my Name is: " + name);
    }
}
