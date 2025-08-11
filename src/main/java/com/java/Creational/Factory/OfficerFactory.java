package com.java.Creational.Factory;

public class OfficerFactory  implements IPersonFactory{
    @Override
    public Person createPerson(String name) {
        return new Officer(name);
    }
}
