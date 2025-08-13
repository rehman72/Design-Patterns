package com.java.Creational.AbstractFactory;

public class Report {

    private  String name;

    public Report(String name){
        this.name=name;
    }

    public void processReport(){
        System.out.println("Processing Report: "+name);
    }


}
