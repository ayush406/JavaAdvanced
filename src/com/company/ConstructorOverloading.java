package com.company;

class Const{

    private int id;
    private String name;

    public Const()
    {
        id = 12;
        name = "Ayush";
    }
    public Const(int i)
    {
        id = i;
        name = "Rishabh";
    }
    public Const(int i, String n)
    {
        id = i;
        name = n;
    }
    public int getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
}
public class ConstructorOverloading {

    public static void main(String[] args) {

        Const c1 = new Const();
        System.out.println(c1.getId());
        System.out.println(c1.getName());

        System.out.println("****************************************");

        Const c2 = new Const(24);
        System.out.println(c2.getId());
        System.out.println(c2.getName());

        System.out.println("****************************************");

        Const c3 = new Const(36, "Saby");
        System.out.println(c3.getId());
        System.out.println(c3.getName());
    }
}
