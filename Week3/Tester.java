package week6;

import java.io.*;
import java.util.*;
import java.lang.*;
import edu.duke.*;


public class Tester {
    
    public void testLogEntry()
    {
        LogEntry le=new LogEntry("1.2.3.4",new Date(),"example request",200,500);
        System.out.println(le);
        LogEntry le2=new LogEntry("1.2.3.4",new Date(),"example request",200,500);
        System.out.println(le2);
    }
    
    public void testLogAnalyzer()
    {
    	  LogAnalyzer la = new LogAnalyzer();
          la.readFile("short-test_log");
          la.printAll();
          System.out.println(la.countUniqueIPs());
          System.out.println(la.uniqueIPVisitsOnDay("Mar 24").size());
          System.out.println(la.countUniqueIPsInRange(200,299));
          la.printAllHigherThanNum(400);
          System.out.println(la.mostNumberVisitsByIP(la.countVisitsPerIP()));
          System.out.println(la.iPsMostVisits(la.countVisitsPerIP()));
          System.out.println(la.iPsForDays());
          System.out.println(la.dayWithMostIPVisits(la.iPsForDays()));
          
    	
   }
    public static void main(String[] args) {
    	Tester t=new Tester();
    	t.testLogEntry();
//    	t.testLogAnalyzer();
    }
}