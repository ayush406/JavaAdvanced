package com.DSA.Recursion;

public class Basic {

    public void fun(int n)
    {
        if(n>0)
        {
            System.out.println(n);
            fun(n-1);
        }
    }

    public static void main(String[] args) {

        int x = 3;

        Basic b1 = new Basic();
        b1.fun(x);

    }
}
