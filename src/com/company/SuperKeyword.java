package com.company;

class Person{

    int speed = 120;


    Person(int a)
    {
        System.out.println("this is Person's parameterised constructor");
    }
    void message()
    {
        System.out.println("this is Person's method.");
    }

}
class Chef extends Person{

    int speed = 180;

    Chef()
    {
        super(5);
        System.out.println("This is Chef's constructor.");
    }
    Chef(int a)
    {
        super(5);
        System.out.println("This is chef's parameterised constructor.");
    }
    void message()
    {
        System.out.println("this is Chef's method.");
    }
    void display()
    {
        super.message();
        System.out.println("the speed is "+super.speed);
    }
}
public class SuperKeyword {

    public static void main(String[] args) {

        Chef c = new Chef();
        c.display();
    }
}
