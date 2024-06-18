package com.company;

import java.util.Scanner;

public class DupeElementsArr {


    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6,3,4,4};


        for(int i=0; i<arr.length-1; i++)
        {
            for (int j=i+1; j<arr.length; j++)
            {
                if (arr[i] == arr[j])
                {
                    System.out.println(arr[i]);
                }
            }

        }

        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
    }
}
