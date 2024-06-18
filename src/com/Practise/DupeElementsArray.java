package com.Practise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DupeElementsArray {

    public static void main(String[] args) {


        //there's a problem with this approach, as when the number is appearing more than 2 times, it will print it more than once
        int [] arr = {1,2,3,4,5,6,3,4,4};
//
//
//        for(int i=0; i<arr.length-1; i++)
//        {
//            for (int j=i+1; j<arr.length; j++)
//            {
//                if (arr[i] == arr[j])
//                {
//                    System.out.println(arr[i]);
//                }
//            }
//
//        }

        //this is the efficient and correct approach

        List<Integer> list = new ArrayList<>();

        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i] == arr[j])
                {
                    if(list.contains(arr[i]))
                    {
                        break;
                    }
                    else
                        list.add(arr[i]);
                }
            }
        }

        System.out.println(list);



        //duplicate elements using hashmap

        Map<Integer, Integer> map = new HashMap<>();
        for(int a : arr)
        {
            if(map.containsKey(a))
            {
                map.put(a, map.get(a)+1);
            }
            else
            {
                map.put(a, 1);
            }
        }
        System.out.println(map);

        for(Map.Entry<Integer, Integer> e : map.entrySet())
        {
            if(e.getValue() > 1)
            {
                System.out.println(e.getKey());
            }
        }
    }

    
}
