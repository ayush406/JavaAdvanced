package com.Practise;

public class FactRec {

    public static int fact(int n)
    {
        if(n<=1)
        {
            return 1;
        }
        else
            return n * fact(n-1);
    }
    public static void main(String[] args) {

        int a =6;

        System.out.println(fact(a));

    }
}
