package com.company;

abstract class A1{


    abstract public void m1();

}

class B1 extends A1{

    public void m1()
    {
        System.out.println("I'm in class B1");
    }

}

abstract class C1 extends A1{


}

public class AbstractClass {

    public static void main(String[] args) {

        B1 b = new B1();
        A1 a = new B1();


//        A1 c = new A1(){
//
//            public void m1()
//            {
//
//            }
//        };

    }
}
