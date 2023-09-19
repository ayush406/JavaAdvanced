package com.company;

import java.util.Scanner;

public class Recursion {

    static int fact(int x)
    {
        if(x==1)
        {
            return 1;
        }
        else
        {
            return x * fact(x-1);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        System.out.println(fact(a));
    }
}
