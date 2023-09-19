package com.company;

public class OrderReverse {

    public static void main(String[] args) {

        String s1 = "Ayush is a good boy";
        String[] spl = s1.split(" ");
        String f = "";

        for(int i=0; i<spl.length/2; i++)
        {
            String s = spl[i];
            spl[i] = spl[spl.length-i-1];
            spl[spl.length-i-1] = s;

        }
        for(int i=0; i<spl.length; i++)
        {
            f = f + spl[i] + " ";
        }
        System.out.println(f);

//        Output :- boy good a is Ayush
    }
}
