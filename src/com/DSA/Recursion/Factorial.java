package com.DSA.Recursion;

public class Factorial {

    int fact(int n)
    {
        if(n<=1)
        {
            return n;
        }

        return  n * fact(n-1);
    }

    public static void main(String[] args) {

        Factorial factorial = new Factorial();

        System.out.println(factorial.fact(6));


    }
}
