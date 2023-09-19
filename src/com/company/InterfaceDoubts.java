package com.company;

public class InterfaceDoubts implements DefInterface{

    public static void main(String[] args)
    {
        InterfaceDoubts I = new InterfaceDoubts();

        I.show1();

        I.show();

        DefInterface.show2();

    }

    @Override
    public void show1() {
        // TODO Auto-generated method stub
        System.out.println("Hi");
    }

    @Override
    public void show()
    {
        System.out.println("this is an overridden default method");
    }

}
