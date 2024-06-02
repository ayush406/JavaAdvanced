package com.freecharge;

public class LowestSubstring {

    public static void main(String[] args) {

        String s = "";
        String[] arr = {"geeks", "geeksforgeeks", "geek", "geeksfor", "geeky"};

        for( int i=0; i< arr.length-1; i++)
        {
            if(arr[i].length() < arr[i+1].length())
            {
                s = arr[i];
            }
        }
        System.out.println(s);
    }
}
