package com.java.Creational.AbstractFactory;

public class PurchaseInputReport extends InputReport{

    public PurchaseInputReport(String name) {
        super(name);
    }

    @Override
    public void processReport() {
        super.processReport();
        System.out.println("Performing InputOperations for Purchase Report..");
    }
}
