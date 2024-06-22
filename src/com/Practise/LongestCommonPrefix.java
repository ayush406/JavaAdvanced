package com.Practise;

import java.util.Arrays;



public class LongestCommonPrefix {

    public static void main(String[] args) {

        String arr[] = {"geeksforgeeks", "geeks", "geek", "geezer", "geyser"};

        StringBuffer sb = new StringBuffer();


        Arrays.sort(arr);

        char[] ch = arr[0].toCharArray();
        char[] ch1 = arr[arr.length-1].toCharArray();

        for(int i=0; i< arr.length; i++)
        {
            if(ch[i] != ch1[i])
            {
                break;
            }

            sb.append(ch[i]);
        }
        System.out.println(sb);
    }
}
