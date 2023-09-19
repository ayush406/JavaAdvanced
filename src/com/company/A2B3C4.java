package com.company;
import java.util.*;
import java.util.Arrays;

public class A2B3C4 {

    public static void main(String[] args) {

        String s = "A2B3C4D5";
//        String spl[] = s.split("");

//        System.out.println(Arrays.toString(spl));

        for(int i =0; i<s.length(); i++)
        {
            if(Character.isAlphabetic(s.charAt(i)))
            {
                System.out.print(s.charAt(i));
            }
            else {
                int a = Character.getNumericValue(s.charAt(i));
                for (int j = 1; j < a; j++) {
                    System.out.print(s.charAt(i - 1));
                }
                System.out.println();
            }

        }

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("as",1);
        hm.put("sd",2);

        Set s1 = hm.entrySet();

        Iterator it = s1.iterator();

        while(it.hasNext())
        {
            Map.Entry map = (Map.Entry) it.next();

            System.out.println(map.getKey()+" - "+map.getValue());
        }

        for(Map.Entry e : hm.entrySet())
        {
            System.out.println(e.getKey()+" - "+e.getValue());
        }

    }
}
