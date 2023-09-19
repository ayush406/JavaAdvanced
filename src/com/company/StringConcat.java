package com.company;

public class StringConcat {
    public static void main(String[] args) {

        String str = "a m s f";
        String n = "";
        int N=4;
        for(int i=0; i<N; i++)
        {
            String[] chs = str.split(" ");
            n = n.concat(chs[i]);
        }
        System.out.println(n);

    }

}
