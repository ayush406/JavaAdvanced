package com.company;

import java.util.*;
import java.util.Arrays;

public class Practise {

    public static int fact(int n)
    {
        if (n>0)
            return n*fact(n-1);
        else
            return 1;
    }

    public static int largest(int[] ar)
    {
        int max = 0;
        for(int i=0; i<ar.length;i++)
        {
            if(max<ar[i])
            {
                max=ar[i];
            }

        }
        return max;
    }

    public static void Anagram(String s1, String s2)
    {
        s1 = s1.replaceAll(" ", "");
        s2 = s2.replaceAll(" ", "");
        boolean b = true;

        if(s1.length() != s2.length())
        {
            b = false;
        }
        char[] ch = s1.toLowerCase().toCharArray();
        char ch1 [] = s2.toLowerCase().toCharArray();

        Arrays.sort(ch);
        Arrays.sort(ch1);

        System.out.println(ch);
        System.out.println(ch1);
        b = Arrays.equals(ch, ch1);
        System.out.println(b);


        if(b)
        {
            System.out.println("Yes");
        }
        else
            System.out.println("No");


    }

    public static void main(String[] args) {

//        String reverse program
//        String s1 = "Ayush";
//        String rev = "";
//        for(int i =0; i<s1.length(); i++)
//        {
//            rev = s1.charAt(i) + rev;
//        }
//        System.out.println(rev);

//        Array reverse program
//        int []arr = {1,2,3,4,5,6};
//        int rev[] = new int[arr.length];
//
//        for(int i =0; i<arr.length; i++)
//        {
//            rev[i] = arr[arr.length-i-1];
//        }
//
//        for(int i=0; i<arr.length; i++)
//        {
//            System.out.println(rev[i]);
//        }

//        int []arr = {1,2,3,4,5,6};
//        int a = arr.length;
//
//        for(int i=0; i<a/2; i++)
//        {
//            int c = arr[i];
//            arr[i] = arr[a-i-1];
//            arr[a-i-1] = c;
//        }
//
//        for(int j=0; j<a; j++)
//        {
//            System.out.print(arr[j]+" ");
//        }

//        Factorial using recursion
//        int a = fact(5);
//        System.out.println(a);

//        String Palindrome
//
//        String s1 = "AbBa";
//        s1 = s1.toLowerCase();
//        boolean b = true;
//        for(int i =0; i<s1.length(); i++)
//        {
//            if(s1.charAt(i) == s1.charAt(s1.length()-i-1))
//                b=true;
//            else
//            {
//                System.out.println("no");
//                b= false;
//                break;
//            }
//        }
//        if(b)
//            System.out.println("yes");

//        Maximum number in array
//        int []arr = {1,2,3,4,65,6, 56, 78};
//        int a = largest(arr);
//        System.out.println(a);

//        Minimum number in array
//        int []arr = {1,2,3,4,5,6,7,0,-4,-90};
//        int min = arr[0];
//
//        for(int i=0; i<arr.length; i++)
//        {
//            if(min>arr[i])
//                min=arr[i];
//        }
//        System.out.println(min);

//        Array Sort

//     int arr[] = {1,34,56,7,89,0};
//     int max;
//
//     for(int i=0; i<arr.length; i++)
//     {
//         for(int x =i+1; x<arr.length; x++)
//         {
//             if(arr[i]>arr[x])
//             {
//                 max = arr[x];
//                 arr[x] = arr[i];
//                 arr[i] = max;
//             }
//         }
//     }
//
//     for(int i=0;i<arr.length; i++)
//     {
//         System.out.println(arr[i]);
//     }

        //String anagram
//
//        String s1 = "Aman is very good";
//        String s2 = "AMAN godo IS VERY  ";
//
//        Anagram(s1 , s2);

//        2nd largest element in array
//
//        int arr[] = {1,2,3,4,5,6,34,56,78,0,64};
//        int tmp;
//        for(int i =0; i<arr.length; i++)
//        {
//            for(int j=i+1; j<arr.length; j++)
//            {
//                if(arr[i]>arr[j])
//                {
//                    tmp = arr[j];
//                    arr[j] = arr[i];
//                    arr[i] = tmp;
//                }
//            }
//        }
//
//        System.out.println("Second largest element of the array is "+arr[arr.length-2]);





    }
}
