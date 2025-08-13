package com.java.Creational.AbstractFactory;

public class OutputReport extends  Report{

    public OutputReport(String name) {
        super(name);
    }

    @Override
    public void processReport() {
        super.processReport();
        System.out.println("Performing Output Operation..");
    }
}
