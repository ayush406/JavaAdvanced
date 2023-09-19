package com.company;

import java.util.HashMap;
import java.util.Map;

public class HashInterview {

    public static void main(String[] args) {

        String str = "Bat Cat Mat Bat Cat Bat";
        String[] spl = str.split(" ");
        int[] arr = {1, 2, 3, 4, 5};
        HashMap<String, Integer> hm = new HashMap<>();

        for (String s :spl)
        {
            if(hm.containsKey(s))
            {
                hm.put(s,hm.get(s)+1);
            }
            else
            {
                hm.put(s,1);
            }
        }

        for(Map.Entry<String,Integer> e :hm.entrySet())
        {
            System.out.println(e.getKey()+" "+e.getValue());
        }

    }

}
