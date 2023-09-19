package com.company;

import java.util.*;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<Integer> l1 = new LinkedList<>();

        l1.add(4);
        l1.add(5);
        l1.add(7);
        l1.add(9);
        l1.add(11);
        l1.add(2,45);
        l1.addFirst(56);
        l1.addLast(12);

        System.out.println(l1.size());

        for(int i=0; i<l1.size(); i++)
        {
            System.out.print(l1.get(i) +" ");
        }

        System.out.println("\n" + l1.indexOf(56));
        System.out.println(l1.contains(12));

        l1.set(2,34);

    }
}
