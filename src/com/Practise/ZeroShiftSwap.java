package com.Practise;

public class ZeroShiftSwap {

    public static void main(String[] args) {

        int []arr = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        int j =0;

        for (int i=0; i<arr.length; i++)
        {
            if(arr[i] != 0)
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                j++;
            }
        }

        for(int a : arr)
        {
            System.out.print(a+" ");
        }
    }
}
