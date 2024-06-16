package com.freecharge;

public class ReverseWordString {

    public static void main(String[] args) {

        String str = "My Name is Bhavuk";
//        Output string :- "Bhavuk is Name My"

        String rev = "";


        String []arr = str.split(" ");

        for(String s : arr)
        {
            rev = s + " " + rev;
        }

        System.out.println(rev);
    }
}
