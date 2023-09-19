package com.company;

import java.util.Scanner;

public class HandlingSpecificExceptions {

    public static void main(String[] args) {

        int [] arr = new int[3];
        arr[0] = 12;
        arr[1] = 15;
        arr[2] = 18;


        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of index");

        int ind = sc.nextInt();

        int c = sc.nextInt();
        try{

            System.out.println(arr[ind]);
            System.out.println(arr[2]/c);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Arithmetic Exception");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array Index Exception");
            System.out.println(e);
        }
        catch (Exception e)
        {
            System.out.println("this is a normal Exception.");
        }
    }
}
