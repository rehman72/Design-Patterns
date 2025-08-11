package com.java.Creational.Factory;


public class SimplePersonFactory {

    private static final String CLASS_NAME_SHOPPER = "Shopper";
    private static final String CLASS_NAME_EMPLOYEE = "Employee";
    private static final String CLASS_NAME_OFFICER = "Officer";

    //    Private Constructor
    private SimplePersonFactory() {
    }

// LazyHolder for ThreadSafe

    private static class LazyHolder {
        private final static SimplePersonFactory INSTANCE = new SimplePersonFactory();
    }

    // public getInstance() method
    public static SimplePersonFactory getInstance() {
        return LazyHolder.INSTANCE;
    }

// create Person

    public Person createPerson(Class className, String name) {
        Person person = null;

         switch (className.getSimpleName()){
             case CLASS_NAME_EMPLOYEE ->
                person=new Employee(name);
            case CLASS_NAME_OFFICER ->
                person=new Officer(name);
            case CLASS_NAME_SHOPPER ->
                person=new Shopper(name);
            default -> {
                throw new IllegalArgumentException("Invalid Class Name");
            }
        }

        return person;

    }

    public Person createForUser(String className, String name){
        if(className.equalsIgnoreCase(CLASS_NAME_EMPLOYEE)){
            return new Employee(name);
        }
        else if(className.equalsIgnoreCase(CLASS_NAME_OFFICER)){
            return new Officer(name);
        }
        else if(className.equalsIgnoreCase(CLASS_NAME_SHOPPER)){
            return new Shopper(name);
        }
        else{
           return  null;
        }

    }


}
