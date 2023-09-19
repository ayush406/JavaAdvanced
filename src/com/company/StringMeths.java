package com.company;

import java.util.Locale;

public class StringMeths {

    public static void main(String[] args) {

        String name = "AYUSH";
        name = name.toLowerCase();
        System.out.println(name);


        System.out.println(name.length());

        String low = name.toLowerCase();
        System.out.println(low);

        String a = "     Hi";
        System.out.println(a);
        String b = a.trim();
        System.out.println(b);

        System.out.println(name.substring(3));
        System.out.println(name.substring(2,5));

        System.out.println(name.replace('a','I'));
        System.out.println(name.replace("ayu", "IED"));

        System.out.println(name.startsWith("ayu"));
        System.out.println(name.endsWith("yus"));

        System.out.println(name.charAt(3));

        System.out.println(name.indexOf("sh"));

        String name1 = "Ayushyush";
        System.out.println(name1.indexOf("ush",4));

        System.out.println(name1.lastIndexOf("y",4));
    }
}
