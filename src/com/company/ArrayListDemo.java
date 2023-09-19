package com.company;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(5);

        l2.add(48);
        l2.add(67);
        l2.add(99);
        l2.add(12);
        l2.add(56);

        l1.add(4);
        l1.add(5);
        l1.add(7);
        l1.add(9);
        l1.add(11);
        l1.add(2,45);
        l1.addAll(l2);

//        l1.clear();
        System.out.println(l1.size());

        for(int i=0; i<l1.size(); i++)
        {
            System.out.print(l1.get(i) +" ");
        }

        System.out.println("\n" + l1.indexOf(56));
        System.out.println(l1.contains(12));

        l1.set(2,34);

        for(Integer l:l1)
        {
            System.out.println(l);
        }

    }
}
