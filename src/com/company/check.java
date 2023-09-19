package com.company;

interface L1{

    default void show()
    {
        System.out.println("show");
    }
    static void display()
    {
        System.out.println("This is static display method");
    }
    void m1();
}


public class check implements L1 {

    public void m1() {

        System.out.println("this is m1 method");
    }


    public static void main(String[] args) {

        System.out.println("this is main method");
        L1.display();

        check c = new check();
        c.m1();
        c.show();

    }
}
