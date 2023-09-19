package com.company;

import java.util.*;

public class FirstNonDuplicate {

    public static void main(String[] args) {

        String s = "aabbccgd";
        char[] ch = s.toCharArray();

        Map<Character,Integer> hm = new LinkedHashMap<>();

        for(char c:ch)
        {
            if(hm.containsKey(c))
                hm.put(c,hm.get(c)+1);

            else
                hm.put(c,1);
        }

//        for(Map.Entry<Character,Integer> e : hm.entrySet())
//        {
//            if(e.getValue()==1) {
//                System.out.println(e.getKey()+" - "+e.getValue());
//                break;
//            }
//
//        }

        Set s1 = hm.entrySet();
        Iterator it = s1.iterator();

        while (it.hasNext())
        {
            Map.Entry<Character,Integer> e = (Map.Entry) it.next();
            if(e.getValue()==1) {
                System.out.println(e.getKey());
                break;
            }
        }

    }
}
