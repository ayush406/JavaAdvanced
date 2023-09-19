package com.company;

class Base{

    private int x;
    private String y;

    public int getX()
    {
        return x;
    }
    public void m1()
    {
        System.out.println("hh");
    }
    public void setX(int x)
    {
        this.x = x;
    }
    public String getY()
    {
        return y;
    }
    public void setY(String y)
    {
        this.y = y;
    }

}

class Derived extends Base{

    private int a;

    public int getA()
    {
        return a;
    }
    public void setA(int a)
    {
        this.a = a;
    }

    @Override
    public void m1()
    {

    }

}
public class Inheritance {

    public static void main(String[] args) {

        Derived d = new Derived();

        d.setA(12);
        System.out.println(d.getA());

        d.setX(24);
        System.out.println(d.getX());

        d.setY("Ayush");
        System.out.println(d.getY());

    }
}
