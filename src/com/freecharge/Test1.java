package com.freecharge;


import java.util.List;

class Emp{

    Emp()
    {
        System.out.println("base constructor");
    }

    Emp(int x)
    {
        System.out.println("param base constructor");
    }

}
public class Test1 extends Emp{

    Test1(){
//        super();
        System.out.println("derived constructor");
    }

    Test1(int x)
    {
        super(x);
        System.out.println("param derived constructor");
    }

    public static void main(String[] args) {

        Test1 T = new Test1(2);
    }
}
