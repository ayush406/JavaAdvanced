package com.freecharge;


import java.util.ArrayList;
import java.util.List;

//////print all numbers between 100 and 1000 having sum of digits as 12 and store them in an array and return that array.
public class SumD {

    public static void main(String[] args) {

        for (int i = 100; i < 1000; i++)
        {

            int sum =0, org, a;
            org = i;
            while(org>0)
            {
                a = org%10;
                org = org/10;
                sum = sum + a;
            }
            if(sum == 12)
            {
                System.out.println(i);
            }
        }
    }

}
