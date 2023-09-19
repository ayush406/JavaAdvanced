package com.company;

import java.util.Calendar;
import java.util.TimeZone;

public class CalendarClass {

    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();
        Calendar c1 = Calendar.getInstance(TimeZone.getTimeZone("CST"));

        System.out.println(c.getCalendarType());
        System.out.println(c.getTime());
        System.out.println(c.getTimeZone());
        System.out.println(c.getTimeZone().getID());

        System.out.println(c1.getCalendarType());
        System.out.println(c1.getTime());
        System.out.println(c1.getTimeZone());
        System.out.println(c1.getTimeZone().getID());
    }
}
