package com.java.Creational.Factory;

public class Employee implements Person {

    private String name;

    Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    @Override
    public void speak() {
        System.out.println("I am Employee Class");
        System.out.println("Hello! my Name is: " + name);

    }
}
