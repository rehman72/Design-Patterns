package com.java.Creational.AbstractFactory;

public class PurchaseOutputReport extends OutputReport{

    public PurchaseOutputReport(String name) {
        super(name);
    }

    @Override
    public void processReport() {
        super.processReport();
        System.out.println("Performing Output Operations for Purchase Report..");
    }
}
