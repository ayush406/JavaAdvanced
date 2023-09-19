package com.company;

class Test{

    Test()
    {

        System.out.println("Inside default constructor");
    }
    Test(int a)
    {
        this();
        System.out.println("Inside Parameterised constructor");
    }

    public void m1()
    {
        this.m2();
        System.out.println("This is m1 method.");
    }
    public void m2()
    {
        System.out.println("this is m2 method.");
    }

}
public class ThisKeyword {

    public static void main(String[] args) {

        Test t1 = new Test(5);
        t1.m1();

    }
}
