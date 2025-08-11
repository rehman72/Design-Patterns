package com.java.Creational.Factory;

public class ShopperFactory implements IPersonFactory{
    @Override
    public Person createPerson(String name) {
        return new Shopper(name);
    }
}
