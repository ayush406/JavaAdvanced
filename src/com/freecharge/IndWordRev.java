package com.freecharge;

public class IndWordRev {

    public String rev(String s)
    {
        String s1[] = s.split(" ");
        String rev ="";

        for(int i=0; i< s1.length; i++)
        {
            String str = "";
            for(int j=0; j<s1[i].length();j++)
            {
                str = s1[i].charAt(j) + str;
            }
            rev = rev + " " +str;
        }

        return rev;
    }

    public static void main(String[] args) {

        String s = "Ayush is fucked up";

        IndWordRev ind = new IndWordRev();
        System.out.println(ind.rev(s));

    }
}
