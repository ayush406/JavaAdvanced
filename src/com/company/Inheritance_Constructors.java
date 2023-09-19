package com.company;

class Base1{

    Base1()
    {
        System.out.println("I'm default constructor of Parent class.");
    }

    Base1(int a)
    {
        System.out.println("I'm parameterised constructor of parent class with a value of "+a);
    }

}

class Derived1 extends Base1{

    Derived1()
    {
        super(0);
        System.out.println("I'm default constructor of Derived1 class.");
    }
    Derived1(int x, int y)
    {
        super(x);
        System.out.println("I'm parametrised constructor of Derived1 class with a value of "+y);
    }

}

class Child extends Derived1{

    Child()
    {
        super(5,6);
        System.out.println("I'm default constructor of Child class.");
    }
    Child(int x, int y, int z)
    {
        super(x,y);
        System.out.println("I'm a parameterised constructor of Child class with value of "+z);
    }


}
public class Inheritance_Constructors {

    public static void main(String[] args) {

//        Derived1 d = new Derived1();
//        Derived1 d = new Derived1(5,6);
//          Child c = new Child();
          Child c = new Child(6,8,9);

    }
}
