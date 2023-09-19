package com.company;

public class StringReverse {

    public static void main(String[] args) {

        String str = "AYUSH";

        String ch = "";
        int l = str.length();
        for(int i=l-1; i>=0; i--)
        {
            ch = ch + str.charAt(i);

        }
        System.out.println(ch);
        for(int j=0;j<6;j++)
        {
            System.out.println("*");
        }

        String a = new String("b");
        String b = new String("b");
        System.out.println(a == b);
    }
}
