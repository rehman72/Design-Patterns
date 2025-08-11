package com.java.Creational;

import com.java.Creational.Factory.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class FactoryClass {
    @Test
    public void testSimplePersonFactory(){
        SimplePersonFactory simplePersonFactory = SimplePersonFactory.getInstance();
        Person abdul = simplePersonFactory.createPerson(Employee.class, "Abdul");
        Person abdul1 = simplePersonFactory.createPerson(Officer.class, "Abdul");
        Person abdul2 = simplePersonFactory.createPerson(Shopper.class, "Abdul");

        Assertions.assertEquals("Employee",abdul.getClass().getSimpleName());
        Assertions.assertEquals("Officer",abdul1.getClass().getSimpleName());
        Assertions.assertEquals("Shopper",abdul2.getClass().getSimpleName());

    }


    @Test
    public void TestPersonFactory(){
        IPersonFactory personFactory;

         personFactory=new ShopperFactory();
        Person alex = personFactory.createPerson("alex");

        personFactory=new EmployeeFactory();
        Person eve = personFactory.createPerson("Eve");

        personFactory=new OfficerFactory();
        Person simon = personFactory.createPerson("Simon");

        alex.speak();
        eve.speak();
        simon.speak();

        Assertions.assertEquals("Shopper",alex.getClass().getSimpleName());
        Assertions.assertEquals("Employee",eve.getClass().getSimpleName());
        Assertions.assertEquals("Officer",simon.getClass().getSimpleName());
    }
}
