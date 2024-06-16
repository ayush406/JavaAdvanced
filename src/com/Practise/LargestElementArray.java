package com.Practise;

public class LargestElementArray {

    public static void main(String[] args) {

        int arr[] = {1,45,67,890,23,4567,3,12};
        int max = arr[0];

        for(int i=0; i<arr.length-1; i++)
        {
            if(max < arr[i])
                max = arr[i];
        }

        System.out.println(max);
    }
}
