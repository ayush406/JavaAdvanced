package com.company;

public class MaximArr {

    public static void main(String[] args) {

        int[] a = {1,2,3,44,5,6};
        int max = 0;
        for (int i=0; i<a.length; i++)
        {
            if(a[i] >max)
            {
                max = a[i];
            }
        }
        System.out.println(max);
    }
}
