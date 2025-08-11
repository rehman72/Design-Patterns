package com.java.Creational.Factory;

public class EmployeeFactory implements IPersonFactory {
    @Override
    public Person createPerson(String name) {
        return new Employee(name);
    }
}
