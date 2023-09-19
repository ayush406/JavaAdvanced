package com.company;

import java.util.HashMap;
import java.util.Map;

public class Hashmapdemo {

    public static void occurence(String s)
    {
        char[] ch = s.toCharArray();
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0; i<ch.length;i++)
        {
            if(hm.containsKey(ch[i]))
            {
                hm.put(ch[i],hm.get(ch[i])+1);
            }
            else
            {
                hm.put(ch[i],1);
            }
        }

        for(Map.Entry<Character,Integer> e : hm.entrySet())
        {
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }

    public static void main(String[] args) {

        HashMap<Integer, String> hm = new HashMap<>();

        hm.put(1,"One");
        hm.put(2,"Two");
        hm.put(3,"Three");
        hm.put(4,"Four");
        hm.put(1,"Ayush");

        System.out.println(hm);
        hm.remove(4);


        for(Map.Entry<Integer,String> e : hm.entrySet())
        {
            System.out.println(e.getKey() +" "+e.getValue());
        }

        String s = "Ayush is a good boy";
        occurence(s);
    }
}
