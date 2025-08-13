package com.java.Creational.AbstractFactory;

public class OutputReportFactory implements IReportFactory {


    @Override
    public Report createReport(String reportType, String name) {
        Report report=null;
        switch (reportType){
            case StringConstants.REPORT_TYPE_INVOICE ->
                report=new InvoiceOutputReport(name);
            case StringConstants.REPORT_TYPE_PURCHASE ->
                report=new PurchaseOutputReport(name);
        }
        return report;
    }
}
