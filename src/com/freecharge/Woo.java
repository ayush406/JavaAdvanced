package com.freecharge;

public class Woo {

    public static void main(String[] args) {

        String str = "Life is fucked up!";

        String []s = str.split(" ");
        String rev = "";

        for(String s1 :s)
        {
            String word = "";

            for(int i=0; i<s1.length(); i++)
            {
                word = s1.charAt(i) + word;
            }

            rev = rev + word + " ";
        }

        System.out.print(rev.trim());
    }
}
