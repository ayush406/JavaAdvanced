package com.company;

interface bicycle{

    int x = 45;
    void speedUp(int a);
    void applyBrake(int b);
}

interface I1{

    void m1();
    void m2();
}

class cycle implements bicycle,I1{

    @Override
    public void applyBrake(int a)
    {
        System.out.println("this is apply brake method");
    }

    @Override
    public void speedUp(int b) {

        System.out.println("this is speed up method");
    }

    @Override
    public void m1()
    {
        System.out.println("this is m1 method");
    }

    @Override
    public void m2()
    {
        System.out.println("this is m1 method");
    }
}
public class Interface_Demo {

    public static void main(String[] args) {

        cycle c = new cycle();

//        c.x = 10;

        System.out.println(c.x);
        c.applyBrake(5);
        c.speedUp(6);
        c.m1();
        c.m2();

    }
}
