package com.java.Creational.AbstractFactory;

public class InvoiceOutputReport extends  OutputReport{

    public InvoiceOutputReport(String name) {
        super(name);
    }

    @Override
    public void processReport() {
        super.processReport();
        System.out.println("Performing Invoice Output Operations..");
    }
}
