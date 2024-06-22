package com.Practise;

import java.util.*;

public class Test {

    public Boolean anagram(String str, String spl)
    {
        char ch[] = str.toCharArray();
        char ch1[] = spl.toCharArray();

        Arrays.sort(ch);
        Arrays.sort(ch1);

        return Arrays.equals(ch, ch1);

    }

    public int[] arraySort(int []arr)
    {
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                int temp=0;
                if(arr[i]>arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }

    public void duplicateArrayMap(int arr[])
    {
        Map<Integer, Integer> map = new HashMap<>();

        for(int a : arr)
        {
            if(map.containsKey(a))
            {
                map.put(a, map.get(a) + 1);
            }
            else
                map.put(a,1);
        }

        for(Map.Entry<Integer,Integer> e : map.entrySet())
        {
            if(e.getValue()>1)
            {
                System.out.println(e.getKey());
            }
        }
    }

    public void duplicateArrayList(int []arr)
    {
        List<Integer> l1 = new ArrayList<>();
            for(int i=0;i<arr.length; i++)
            {
                for(int j=i+1; j<arr.length;j++)
                {
                    if(arr[i] == arr[j])
                    {
                        if(l1.contains(arr[i]))
                            break;
                        else
                            l1.add(arr[i]);
                    }
                }
            }
        System.out.println(l1);
    }

    public static void main(String[] args) {

        Test t = new Test();

        String s = "Anagram";
        String s1 = "Angramaa";

//        System.out.println(t.anagram(s, s1));

        int arr[] = {1,45,67,890,23,4567,3,12, 45678,4567};

        int arr1[] = t.arraySort(arr);

        for (int a : arr1)
        {
//            System.out.println(a);
        }

        t.duplicateArrayMap(arr);

        t.duplicateArrayList(arr);



    }
}
