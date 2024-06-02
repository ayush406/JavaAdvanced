package com.freecharge;

public class InvertCaseString {

    public static void main(String[] args) {

        String str = "This is my String";
        String f = "";
         char c;

         for(int i=0; i<str.length(); i++)
         {
             if(Character.isAlphabetic(str.charAt(i)))
             {
                 if(Character.isLowerCase(str.charAt(i)))
                 {
                     f = f + Character.toUpperCase(str.charAt(i));
                 }
                 else
                     f = f + Character.toLowerCase(str.charAt(i));
             }
             else
                 f = f + str.charAt(i);
         }

        System.out.println(f);
    }
}
