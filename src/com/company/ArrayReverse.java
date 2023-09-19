package com.company;

public class ArrayReverse {

    public static void main(String[] args) {

        int[] marks = {1,2,3,4,5};
        int n= marks.length;

        for(int i=0; i< n/2; i++)
        {
            int c = marks[i];
            marks[i] = marks[n-i-1];
            marks[n-i-1] = c;
        }

        for(int e : marks)
        {
            System.out.print(e+ "  ");
        }


        String s1 = "ayush";
        String rev = "";

        for(int i=0; i<s1.length(); i++)
        {
            rev = s1.charAt(i)+rev;
        }
        System.out.println(rev);

        String s2 = "NitIN";
        boolean x = true;

        for(int a =0; a<s2.length()/2;a++)
        {
            if(s2.charAt(a)==s2.charAt(s2.length()-a-1))
            {
                x = true;
            }
            else
            {
                x= false;
                break;
            }
        }
        if (x)
        {
            System.out.println("yes");
        }
        else
            System.out.println("no");

    }

}
                                                                                                                                            