package com.Practise;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        boolean flag = true;

        for(int i =2; i<a/2; i++)
        {
            if(a%i == 0)
            {
                flag = false;
                break;
            }
        }

        if(flag)
        {
            System.out.println(a + " is prime");
        }
        else
            System.out.println(a + " is not prime");
    }
}
