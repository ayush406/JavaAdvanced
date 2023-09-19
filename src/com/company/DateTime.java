package com.company;

import java.util.Date;

public class DateTime {

    public static void main(String[] args) {

        System.out.println(System.currentTimeMillis());

        Date d =new Date();
        System.out.println(d);
        System.out.println(d.getTime());
    }
}
