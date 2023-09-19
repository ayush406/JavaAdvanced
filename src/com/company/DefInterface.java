package com.company;

public interface DefInterface {

    default void show()
    {
        System.out.println("this is a default method defined in an interface");
    }
    void show1();

    static void show2()
    {
        System.out.println("This is a static method defined in an interface");
    }

}
