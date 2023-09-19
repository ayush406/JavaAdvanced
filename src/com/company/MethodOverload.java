package com.company;

public class MethodOverload {

    public int sum()
    {
        System.out.println("This is first method");
        return 0;
    }
    public int sum(int x)
    {
        System.out.println("This is second method " +x);
        return x+5;
    }
    public double sum(double x, double y)
    {
        System.out.println("this is third method "+x+" "+y);
        return x+y;
    }


    public static void main(String[] args) {

        int x =5;
        int y= 10;
        double a = 2.5;
        double b = 3.7;
        MethodOverload m1 = new MethodOverload();
        m1.sum();
        int c = m1.sum(x);
        System.out.println(c);
        double d = m1.sum(a,b);
        System.out.println(d);

    }
}
