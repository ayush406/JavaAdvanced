package com.company;


class A{

    public void m1()
    {
        System.out.println("this is A");
    }

}
class B extends A {
    @Override
    public void m1()
    {
        System.out.println("this is B");
    }
}
public class MethodOverriding {

    public static void main(String[] args) {

        B b = new B();
        b.m1();
    }
}
