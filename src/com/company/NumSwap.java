package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NumSwap {

    public static void main(String[] args) {


        //num swap
        //second largest element in array
        //Array sort
        //array number count
        //word occurences
        //String occurences

        //num swap

        int a = 45;
        int b = 60;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a + " " + b);

        //Second largest element in array(normal)

        int[] arr = {1, 56, 78, 90, 34, 23, 34, 78, 90, 23, 34};
//        int temp;
//
//        for(int i=0; i<arr.length; i++)
//        {
//            for(int j=i+1; j<arr.length; j++)
//            {
//                if(arr[i]>arr[j])
//                {
//                    temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        for(int a1:arr)
//        {
//            System.out.print(a1+" ");
//        }
//        System.out.println(arr[arr.length-2]);

        //Second largest element in array(one for loop)
//        int f = 0;
//        int s = 0;
//        for(int i=0; i<arr.length; i++)
//        {
//            if(f<arr[i])
//            {
//                s = f;
//                f = arr[i];
//            }
//            else if(s <arr[i] && arr[i]!=f)
//            {
//                s=arr[i];
//            }
//        }
//        System.out.println(s);

        //Character occurence using Hashmap

//        String s = "ayush is a good boy";
//        char ch[] = s.toCharArray();
//        HashMap<Character,Integer> hm = new HashMap<>();
//        for(char c: ch)
//        {
//            if(hm.containsKey(c))
//            {
//                hm.put(c,hm.get(c)+1);
//            }
//            else
//            {
//                hm.put(c,1);
//            }
//        }
//        for(Map.Entry<Character,Integer> e :hm.entrySet())
//        {
//            if(e.getKey()!=' ')
//            {
//                System.out.println(e.getKey()+" - "+e.getValue());
//            }
//
//        }


        //Duplicate elements in an array
//        ArrayList<Integer> a1 = new ArrayList<>();
//        boolean pres = false;
//        for (int i=0; i<arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++)
//            {
//                if(arr[i] == arr[j])
//                {
//                    if(a1.contains(arr[i]))
//
//                    {
//                        break;
//                    }
//                    else
//                    {
//                        a1.add(arr[i]);
//                        pres = true;
//                    }
//
//                }
//            }
//
//        }
//        if(pres)
//            System.out.println(a1+" ");
//        else
//            System.out.println("no");

        //Word Occurence in a string

//        String s1 = "Bat Cat Mat cat Mat Bat bat";
//        String sp[] = s1.split(" ");
//        HashMap<String, Integer> hm =new HashMap<String, Integer>();
//        for(String s : sp)
//        {
//            if(hm.containsKey(s))
//            {
//                hm.put(s,hm.get(s)+1);
//            }
//            else
//                hm.put(s,1);
//        }
//
//        System.out.println(hm);

        //frequency of each element in an array

//        int fr [] = new int[arr.length];
//        int visited = -1;
//
//        for(int i=0; i<arr.length; i++)
//        {
//            int count =1;
//            for(int j=i+1; j<arr.length; j++)
//            {
//                if(arr[i] == arr[j])
//                {
//                    count++;
//                    fr[j] = visited;
//                }
//
//            }
//            if(fr[i]!=visited)
//                fr[i] = count;
//        }
//
//        for(int i=0; i<arr.length; i++)
//        {
//            if(fr[i]!=visited)
//                System.out.println(arr[i]+" - "+fr[i]);
//        }

        //frequency of each element in array using Hashmap

//        int ar[] = {1,45,67,45,67,67,89,1};
//
//        HashMap<Integer,Integer> hm =new HashMap<>();
//
//        for(int x: ar)
//        {
//            if(hm.containsKey(x))
//                hm.put(x,hm.get(x)+1);
//            else
//                hm.put(x,1);
//        }
//        System.out.println(hm);

        //frequency of each character in string.

//        String s = "Ayush is Good boy";
//        char[] ch = s.toCharArray();
//        int fr[] = new int[ch.length];
//        int visited = -1;
//        for(int i =0; i<ch.length; i++)
//        {
//            int count = 1;
//            for(int j=i+1; j<ch.length; j++)
//            {
//                if(ch[i] == ch[j])
//                {
//                    count++;
//                    fr[j] = visited;
//                }
//            }
//            if (fr[i]!=visited)
//            {
//                fr[i] = count;
//            }
//
//        }
//
//        for (int i =0; i<ch.length; i++)
//        {
//            if(fr[i]!=visited)
//                System.out.println(ch[i]+" - "+fr[i]);
//        }

        //Reverse a array
//        int x = arr.length;
//        for(int i =0; i<x/2; i++)
//        {
//            int temp = arr[i];
//            arr[i] = arr[x-i-1];
//            arr[x-i-1] = temp;
//        }
//
//        for(int i=0; i<arr.length; i++)
//        {
//            System.out.println(arr[i]);
//        }

        //check if number is palindrome or not

//        int x = 1223221;
//        int num = 0;
//        int rev = 0;
//        while(x>=1)
//        {
//            num = x%10;
//            rev = num +rev*10;
//            x=x/10;
//        }
//        System.out.println(x+" "+rev);

        //largest number in array
//        int max =0;
//        for(int i=0; i<arr.length;i ++)
//        {
//            if(max<arr[i])
//            {
//                max = arr[i];
//            }
//        }
//        System.out.println(max);

        //word occurence in a string
//
//        String s1 = "Bat Cat Mat cat Mat Bat bat";
//        String[] spl = s1.split(" ");
//        int fr[] = new int[spl.length];
//        int visited = -1;
//
//        for(int i=0; i<spl.length; i++)
//        {
//            int count =1;
//            for(int j=i+1; j<spl.length; j++)
//            {
//                if(spl[i].equals(spl[j]))
//                {
//                    count++;
//                    fr[j] = visited;
//                }
//            }
//            if(fr[i]!=visited)
//                fr[i] = count;
//        }
//
//        for(int i=0; i<spl.length; i++)
//        {
//            if (fr[i]!=visited)
//            {
//                System.out.println(spl[i]+" - "+fr[i]);
//            }
//        }

        //String Anagram

        String s = "Mother in law";
        String s1 = "Hitler Woman";

        s = s.replaceAll("\\s", "");
        s1 = s1.replaceAll("\\s", "");

        char[] ch = s.toLowerCase().toCharArray();
        char[] ch1 = s1.toLowerCase().toCharArray();

//        Arrays.sort(ch);
//        Arrays.sort(ch1);

        for (int i = 0; i < ch.length; i++) {
            for (int j = i + 1; j < ch.length; j++)
                if (ch[i] > ch[j]) {
                    char temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
                }
        }
        for (int i = 0; i < ch1.length; i++) {
            for (int j = i + 1; j < ch1.length; j++)
                if (ch1[i] > ch1[j]) {
                    char temp = ch1[i];
                    ch1[i] = ch1[j];
                    ch1[j] = temp;
                }


        }

        Boolean x = Arrays.equals(ch,ch1);
        System.out.println(x);
    }
}
