package com.company;

class Constructor{

    private int x;
    private String name;

    public Constructor(){

        x = 12;
        name = "AYUSH";
        System.out.println("this is a default constructor");
    }


    public void setName(String n)
    {
        name = n;
    }
    public String getName()
    {
        return name;
    }
}
public class ConstructorDemo {

    public static void main(String[] args) {

        Constructor c = new Constructor();
        System.out.println(c.getName());



    }
}
