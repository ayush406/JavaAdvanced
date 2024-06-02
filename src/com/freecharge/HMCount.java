package com.freecharge;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HMCount {

    public static void main(String[] args) {

        Map<String, Integer> hm = new HashMap<>();

        System.out.println("Enter the string");

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String []arr = s.split(" ");

        for(int i=0; i<arr.length; i++)
        {
            if(hm.containsKey(arr[i]))
            {
                hm.put(arr[i], hm.get(arr[i])+1);
            }
            else
                hm.put(arr[i], 1);
        }

        for(Map.Entry e : hm.entrySet())
        {
            System.out.println(e.getKey() +" - "+e.getValue());
        }

    }
}
