package com.freecharge;

public class CommonSubstring {

    public static void main(String[] args) {

        String []arr = {"geeksy", "geeksforgeeks", "geekr", "geeksfor", "geekso"};
        String subs = "";
        String result = "";

        for(int i =0; i<arr.length-1; i++)
        {
            if(arr[i].length() < arr[i+1].length())
            {
                subs =arr[i];
            }
        }
        System.out.println(subs);

        for(int i=0; i<arr.length; i++)
        {
           result = arr[i].substring(0,subs.length());
        }


    }
}
