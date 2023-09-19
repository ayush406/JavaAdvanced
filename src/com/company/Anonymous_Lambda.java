package com.company;

@FunctionalInterface
interface Phone{

//    void method1();

    void method1(int a);
    default void show()
    {
        System.out.println("I'm the default method of phone");
    }
}

public class Anonymous_Lambda {

    public static void main(String[] args) {

//        Phone p = new Phone() {
//            @Override
//            public void method1() {
//
//                System.out.println("I'm method1 using Anonymous class");
//            }
//        };

        int b = 9;
        Phone p = (a) ->{
            System.out.println("I'm method1 using lambda & "+b);
        };

        p.method1(b);
    }
}
