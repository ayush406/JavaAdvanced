package com.company;

public class ArraySort {

    public static void main(String[] args) {

        int[] arr = {1,2,44,55,66,78};
        boolean isSorted = true;
        for(int i= 0; i< arr.length-1; i++)
        {
            if(arr[i]>arr[i+1])
            {
                isSorted = false;
                break;
            }
        }
        if (isSorted)
        {
            System.out.println("The array is sorted.");

        }
        else
        {
            System.out.println("The array is not sorted.");
        }
    }
}
