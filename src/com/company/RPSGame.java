package com.company;

import java.util.Scanner;
import java.util.Random;

public class RPSGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i = 0;
        int j = 0;
        int k = 0;
        while(i<5){
            System.out.println("Enter 0. for Rock, 1. for Paper and 2. for Scissors");
            int a = sc.nextInt();

            Random r = new Random();
            int b = r.nextInt(3);
            System.out.println(b);

            if(a==0 && b==2 || a==1 && b== 0 || a==2 && b==1)
            {
                System.out.println("You win");
                j++;
            }
            else if(a==b)
            {
                System.out.println("game tied");

            }
            else
            {
                System.out.println("You lose");
                k++;
            }

            i++;

        }


        if (j>k)
        {
            System.out.println("You won the 5-Match series.");
        }
        else if(j==k)
        {
            System.out.println("Series tied");
        }
        else
            System.out.println("you lost the 5-Match series.");

    }

}
