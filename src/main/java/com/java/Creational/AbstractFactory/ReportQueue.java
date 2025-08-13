package com.java.Creational.AbstractFactory;

import java.util.LinkedList;
import java.util.List;

public class ReportQueue {

    private List<Report> reports;

    public void addReport(String factoryType,String reportType,String name){
        IReportFactory reportFactoryType=ReportFactoryProvider.getFactory(factoryType);
        if(this.reports==null){
            this.reports=new LinkedList<>();
        }
        reports.add(reportFactoryType.createReport(reportType,name));
    }

public void processReports(){
    this.reports.forEach(report->{
        if(report==null){
            return;
        }
        report.processReport();
        System.out.println("---------------------Processing Completed-----------------------");
    });
    this.reports.clear();
}


    public List<Report> getReports(){
        return  this.reports;
    }

}