package com.company;

class Employee{
    int id;
    String name;

    public void printDeets()
    {

        System.out.println("My id is "+id+" and my name is "+name);
    }
}
public class OOPS_Demo {

    public static void main(String[] args) {

        Employee E1 = new Employee();
        E1.name = "Ayush";
        E1.id = 11739138;
        E1.printDeets();

    }
}
