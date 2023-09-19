package com.company;

public class MethIntro {

    int add(int x, int y)
    {
        int z = x + y;
        return z;
    }

    public static void main(String[] args) {

        MethIntro m1 = new MethIntro();

        int a = 5;
        int b = 6;
        int c;
        c = m1.add(a,b);
        System.out.println(c);

    }
}
