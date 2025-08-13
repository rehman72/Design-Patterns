package com.java.Creational;


import com.java.Creational.AbstractFactory.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class AbstractFactoryTest {

    @Test
    public void testReportQueue() {
        ReportQueue reportQueue=new ReportQueue();
        String[] reports= {"IN_INV_001.txt","OUT_PUR_001.txt","IN_IN_002.txt","OUT_IN_002.txt","IN_PUR_003.txt","OUT_PUR_003.txt"};
        String[] temp;
        for(String report:reports){
            temp=report.split("_");
            reportQueue.addReport(temp[0],temp[1],report);
        }
        Assertions.assertEquals(6,reportQueue.getReports().size());
        reportQueue.processReports();
        Assertions.assertEquals(0, reportQueue.getReports().size());


    }



}
