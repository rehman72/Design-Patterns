package com.java.Creational.AbstractFactory;

public class ReportFactoryProvider {

    public static  IReportFactory getFactory(String typeFactory){
        IReportFactory factory=null;
        switch (typeFactory){
            case StringConstants.FACTORY_TYPE_INPUT ->{
                factory=new InputReportFactory();
                System.out.println("Input Report Factory Created..");
            }

            case StringConstants.FACTORY_TYPE_OUTPUT ->{
                factory=new OutputReportFactory();
                System.out.println("Output Report Factory Created..");
            }
        }

        return factory;
    }

}
