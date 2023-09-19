package com.company;

class One{

    int x = 10;
    public void m1()
    {
        System.out.println("class One");
    }

    public void m2()
    {
        System.out.println("Class One m2");
    }

}
class Two extends One{

    int x = 20;


    @Override
    public void m1()
    {
        System.out.println("class Two");
    }
    public void m3()
    {
        System.out.println("Class Two m3");
    }

}

public class DynamicMethodDispatch {


    public static void main(String[] args) {


        One a = new Two();

        System.out.println(a.x);
        a.m1();
        a.m2();
//      a.m3(); .This is not allowed.
    }
}
