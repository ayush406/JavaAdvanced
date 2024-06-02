package com.freecharge;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharOccurence {

    public static void main(String[] args) {

        Map<Character, Integer> hm =new HashMap<>();

        System.out.println("enter the string");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        char []ch = s.toCharArray();

        for(int i=0; i<ch.length; i++)
        {
            if(hm.containsKey(ch[i]))
            {
                hm.put(ch[i], hm.get(ch[i])+1);
            }
            else
                hm.put(ch[i], 1);
        }

        System.out.println(hm);

    }
}
