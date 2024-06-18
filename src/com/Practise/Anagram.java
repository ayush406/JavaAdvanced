package com.Practise;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        String s = "Anagram";
        String s1 = "Angrama";

        char []ch = s.toLowerCase().toCharArray();
        char []ch1 = s1.toLowerCase().toCharArray();

        Arrays.sort(ch);
        Arrays.sort(ch1);

        System.out.println(Arrays.equals(ch, ch1));


    }
}
