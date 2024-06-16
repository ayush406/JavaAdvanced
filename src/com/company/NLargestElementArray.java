package com.company;

import java.util.Scanner;

public class NLargestElementArray {

    public static void main(String[] args) {

        int arr[] = {23,1,2,45,6,7,8,0};
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();

        for(int i=0;i<arr.length; i++)
        {
            for(int j= i+1; j<arr.length; j++)
            {
                if(arr[i] < arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            if(i == k-1)
            {
                System.out.println(arr[i]);
            }

        }

        for(int a :arr)
        {
            System.out.println(a);
        }

    }
}
