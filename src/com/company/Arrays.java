package com.company;

public class Arrays {

    public static void main(String[] args) {

        int[] marks = new int[6];
        marks[0] = 90;
        marks[1] = 24;
        marks[2] = 36;
        marks[3] = 78;
        marks[4] = 92;
        marks[5] = 45;


//        System.out.println(marks.length);
        for(int j=0; j<marks.length; j++)
        {
            System.out.println(marks[j]);
        }

        System.out.println("******************************");

        for(int k = marks.length-1; k>=0; k--)
        {
            System.out.println(marks[k]);
        }

        System.out.println("*******************************");
        int[] pixels;
        pixels = new int[5];

        int[] light = {34, 56, 89, 27, 54};

        for(int i : light)
        {
            System.out.println(i);
        }
    }
}
