package com.company;

import java.net.Inet4Address;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapOccurence {

//    static void occurence(String s1)
//    {
//        HashMap<Character, Integer> hm  = new HashMap<>();
//
//        char[] ch = s1.toCharArray();
//
//        for(char c: ch)
//        {
//            int count =1;
//            if(hm.containsKey(c))
//            {
//                hm.put(c,hm.get(c)+1);
//            }
//            else
//                hm.put(c,1);
//        }
//
//        for(Map.Entry<Character, Integer> e : hm.entrySet())
//        {
//            System.out.println(e.getKey()+" "+e.getValue());
//        }
//    }
    public static void main(String[] args) {

        System.out.println("Enter a string");
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        char[] ch = s.toCharArray();


        //        occurence(s);

//        HashMap<Integer, String> hm = new HashMap<>();
//        hm.put(1,"Ayush");
//        hm.put(2,"Vini");
//        hm.put(3,"Saby");
//
//        System.out.println(hm.containsKey(1));
//        System.out.println(hm.get(2));

        HashMap<Character, Integer> hm = new HashMap<>();

        for(int i=0; i<ch.length; i++)
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

        for(Map.Entry<Character, Integer> e : hm.entrySet() )
        {
            System.out.println(e.getKey()+" "+e.getValue());
        }



    }
}
