package com.company;

public class EscapeSeq {

    public static void main(String[] args) {

        System.out.println("This is backslash \\ example");
        System.out.println("This is next line \n example");
        System.out.println("This is tab \t example");
        System.out.println("This is double quote \" example");
        System.out.println("This is single quote \' example");

        EscapeSeq e1 = new EscapeSeq();
        try {
            e1.m2();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void m2() throws Exception
    {
        throw new Exception();
    }

}
