package com.company;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {

        HashSet<Integer> h1 = new HashSet<>(12,0.5f);
        h1.add(45);
        h1.add(7);
        h1.add(6);
        h1.add(4);

        System.out.println(h1);


    }
}
