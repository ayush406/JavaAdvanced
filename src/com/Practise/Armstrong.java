package com.Practise;

public class Armstrong {

    public static void main(String[] args) {


        int a = 153;
        int t=0;

        int sum =0;
        int n =0;
        while(a>0)
        {
            t = a%10;
            sum = sum + t*t*t;
            n = n + t;
            a = a/10;
        }

        System.out.println(sum +" - "+n);
    }
}
