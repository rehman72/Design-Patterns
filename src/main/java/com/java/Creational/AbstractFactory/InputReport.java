package com.java.Creational.AbstractFactory;

public class InputReport extends Report{

    public InputReport(String name){
        super(name);
    }

    @Override
    public void processReport() {
        super.processReport();
        System.out.println("Performing Input Operations..");
    }


}
