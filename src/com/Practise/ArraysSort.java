package com.Practise;

import java.util.Arrays;

public class ArraysSort {

    public static void main(String[] args) {

        int arr[] = {1,45,67,890,23,4567,3,12, 45678,4567};


        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j< arr.length; j++)
            {
                int temp =0;
                if(arr[i]> arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int a : arr)
        {
            System.out.print(a +" ");
        }
    }
}
