package com.freecharge;

public class LowestLengthSubstring {

    public static void main(String[] args) {
        
        int min = 0;
        String[] arr = {"geeks", "geeksforgeeks", "geek", "geeksfor", "geeky", "dxdgh"};

        for (int i=0; i<arr.length-1; i++) {

            
            if(arr[i].length()< arr[i+1].length())
            {
                min = arr[i].length();
            }

        }

        System.out.println(min);

    }
}
