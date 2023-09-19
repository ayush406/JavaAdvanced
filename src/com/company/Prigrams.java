package com.company;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Prigrams {

    public static void main(String[] args) {

        String s = "google";
        char ch [] = s.toCharArray();
//        String rev = "";
//        String s1[] = s.split[""];

//        for(int i=0; i<s.length(); i++)
//        {
////            rev = s.charAt(i) + rev;
//            boolean b = false;
//            for(int j=0; j<s.length();j++)
//            {
//                if(s.charAt(i)==s.charAt(j))
//                    b = true;
//
//            }
//            if(b)
//                continue;
//            else
//                System.out.println(s.charAt(i));


        Map<Character,Integer> hm = new LinkedHashMap<>();

        for(char c :ch)
        {
            if(hm.containsKey(c))
                hm.put(c,hm.get(c)+1);
            else
                hm.put(c,1);

        }

        for(Map.Entry<Character, Integer> e : hm.entrySet())
        {
            if(e.getValue()==1)
            {
                System.out.println(e.getKey());
                break;
            }

        }

//        System.out.println(rev);
    }
}
