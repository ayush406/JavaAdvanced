package com.company;

import java.util.*;
import java.util.Arrays;

public class RemoveDupeELements {

    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<Integer>(Arrays.asList(1,23,45,23,45,67,8,9,1));

        Set<Integer> s1 = new HashSet<>();
        s1.addAll(a1);

        a1.clear();
        a1.addAll(s1);

        System.out.println(a1);
    }



}
