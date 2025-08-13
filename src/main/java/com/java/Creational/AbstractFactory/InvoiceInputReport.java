package com.java.Creational.AbstractFactory;

public class InvoiceInputReport extends InputReport{

    public InvoiceInputReport(String name) {
        super(name);
    }

    @Override
    public void processReport() {
        super.processReport();
        System.out.println("Performing Invoice Input Operations..");
    }
}
