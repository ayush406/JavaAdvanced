package com.Practise;

public class SecondLargestElemetArray {

    public static void main(String[] args) {

        int[] arr = {1, 56, 78, 90, 34, 23, 34, 78, 90, 23, 34, 91};

        int smax =0, fmax=0;

        for(int i=0; i<arr.length; i++)
        {
            if(fmax < arr[i])
            {
                smax = fmax;
                fmax = arr[i];
            }

            else if( smax<arr[i] && arr[i]!= fmax)
            {
                smax = arr[i];
            }
        }

        System.out.println(smax);



    }
}
