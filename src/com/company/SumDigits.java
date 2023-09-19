package com.company;

public class SumDigits {

    public static void main(String[] args) {


        int a = 0;
        for(int i=100; i<999; i++)
        {

            int org =i;
            int sum =0;
            while (org > 0) {

                a = org % 10;
                org = org / 10;
                sum = sum + a;
                if (sum == 12)
                    System.out.println(i);
            }
        }

        String s1 = "Ayush";
        String s2 = "Chaudhary";

        s1 = s1 + s2; //s1 = AyushChaudhary.  s2 = Chaudhary
        s2 = s1.substring(0,s1.length()-s2.length());  // s1 = AyushChaudhary  s2 = Ayush
        s1 = s1.substring(s2.length(),s1.length());

        System.out.println(s1+ "  "+s2);
    }
}
