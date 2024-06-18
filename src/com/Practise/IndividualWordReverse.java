package com.Practise;

public class IndividualWordReverse {

    public static void main(String[] args) {

        String str = "Aman Pathak is a coder";
        String rev = "";
//        Output :-

        String []arr = str.split(" ");

        for(String s : arr)
        {
            String word = "";
            for(int i=0; i<s.length(); i++)
            {
                word = s.charAt(i) + word;
            }

            rev = rev + word + " ";
        }

        System.out.println(rev);
    }


}
