package com.java.Creational.AbstractFactory;

public class InputReportFactory implements IReportFactory{

    @Override
    public Report createReport(String reportType,String name) {
       Report report=null;

       switch (reportType){
           case  StringConstants.REPORT_TYPE_INVOICE ->
                report=new InvoiceInputReport(name);
           case StringConstants.REPORT_TYPE_PURCHASE ->
               report=new PurchaseInputReport(name);
       }

       return report;
    }
}
