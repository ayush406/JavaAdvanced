package com.company;

public class ArrayInterview {
    public static void main(String[] args) {

        int arr[] = {1,45,2,78,90,34,23, 101,0};

        int first = 0;
        int second = 0;
        for(int i=0; i<arr.length; i++)
        {
            if(first<arr[i])
            {
                second = first;
                first = arr[i];

            }
            else if(second<arr[i] && arr[i]!=first)
            {
                second = arr[i];
            }
        }
        System.out.println(first+" "+second);
    }
}
