package com.Practise;

public class StringReverse {

    public static void main(String[] args) {

        String str=" Ayush is great";
        String rev = "";
        //output : taerg si hsuyA

        for(int i=0; i<str.length(); i++)
        {
            rev = str.charAt(i) + rev;
        }

        System.out.println(rev);
    }
}
