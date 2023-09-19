package com.company;

class MyEmployee{

    private int id;
    private String name;

    public void setName(String n)
    {
        name = n;
    }
    public String getName()
    {
        return name;
    }
    public void setId(int i)
    {
        id = i;
    }
    public int getId()
    {
        return id;
    }
}
public class Encapsulation {

    public static void main(String[] args) {

        MyEmployee emp = new MyEmployee();

        emp.setId(12);
        emp.setName("Ayush");
        System.out.println(emp.getId());
        System.out.println(emp.getName());


    }
}
