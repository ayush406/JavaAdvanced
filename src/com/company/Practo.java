package com.company;

public class Practo {

    public static void main(String[] args) {

     int arr[] = {1, 2, 3, 4, 5,6};
     int len = arr.length;
     int l = arr.length/2;
     int c;
     for(int i=0;i<l; i++)
     {
         c = arr[i];
         arr[i] = arr[len-i-1];
         arr[len-i-1] = c;
     }

     for(int i=0; i<len; i++)
     {
         System.out.println(arr[i]);
     }

    }
}
