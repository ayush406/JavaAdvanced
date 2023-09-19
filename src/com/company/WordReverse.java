package com.company;

public class WordReverse {

    public static void main(String[] args) {

        String s = "Ayush is a good boy";


        String spl[] = s.split(" ");
        String rev = "";

        for(String s1 : spl)
        {
            String word = "";
            for(int i=0;i<s1.length(); i++)
            {
                word = s1.charAt(i) + word;
            }
            rev = rev + word + " ";
        }
        System.out.println(rev);
    }
    //Output :- hsuyA si a doog yob

}
