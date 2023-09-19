package com.company;

import java.util.Scanner;

public class SwicthCase {



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in );

        char var = 'A';

        switch(var){

            case 'a' :
                System.out.println("this is incorrect");
            break;

            case 'A' :
                System.out.println("this is perfect");
                break;
            default :
            System.out.println("jdj");

        }

        int b = sc.nextInt();

        switch (b){

            case 12 -> System.out.println("this is enhanced switch");
            case 1 -> System.out.println("this is a "+b);
            default -> System.out.println("this is default");



        }


    }


}
