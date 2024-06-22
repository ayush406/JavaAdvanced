package com.Practise;

public class ZeroShiftArray {

    public static void main(String[] args) {

        int arr[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};

        int []a1 = new int[arr.length];

        int count = 0;

        for(int a :arr)
        {
            if(a!=0)
            {
                a1[count++] = a;
            }
        }
        while(count<arr.length)
        {
            a1[count++] = 0;
        }

        for(int a : a1)
        {
            System.out.print(a+" ");
        }
    }
}
