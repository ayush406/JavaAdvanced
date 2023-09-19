package com.company;

abstract class XYZ
{
    public XYZ(int a)
    {
        System.out.println("This is abstract class constructor.");
    }
    void m1()
    {
        System.out.println("This is m1 of Abstract class.");
    }
    abstract void m2();
}

class PQR extends XYZ{

    public PQR()
    {
        super(2);
    }
    void m2()
    {
        System.out.println("This is abstract m2 method.");
    }

}

public class AbstractConstructor {

    public static void main(String[] args) {

        PQR p = new PQR();
        p.m2();
        p.m1();
    }
}
