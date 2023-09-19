package com.company;

import java.util.Scanner;

public class Average {

    public static void main(String[] args) {

        int i;
        Scanner sc = new Scanner(System.in);
        float sum =0.0f;
        for(i=1; i<51; i++)
        {
            System.out.println("Enter the number");
            float a = sc.nextFloat();
            sum = sum +a;
            float avg = sum/i;

            System.out.println("average of numbers is "+avg);
        }
    }
}
