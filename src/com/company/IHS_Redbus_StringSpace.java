package com.company;

public class IHS_Redbus_StringSpace {

    public static void main(String[] args) {

        String s = "This  is       my          string.";

        s = s.replaceAll("( )+"," ");

        System.out.println(s);
    }
}

// Output -> This is my string.
