package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Ex{



}
public class delete extends Ex{

    public static void main(String[] args) {

        Ex a = new Ex();
        Ex a1 = new delete();

        int[] arr = {1, 56, 78, 90, 34, 23, 34, 78, 90, 23, 34, 91};
        int smax = 0;
        int fmax = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if(fmax<arr[i])
            {
                smax = fmax;
                fmax = arr[i];
            }


            else if(smax<arr[i] & arr[i]!=fmax)
                smax = arr[i];
        }

        System.out.println(smax +"  " + fmax);

        String s = "Ayush";
        char[] ch =s.toCharArray();
        HashMap<Character, Integer> hm = new HashMap<>();

        for(char c :ch)
        {
            if(hm.containsKey(c))
                hm.put(c,hm.get(c)+1);
            else
                hm.put(c,1);
        }

        for(Map.Entry<Character,Integer> e :hm.entrySet())
        {
            System.out.println(e.getKey()+" "+e.getValue());
        }

        String s1 = "Ayush";
        char[] ch1 = s1.toCharArray();
        int fr[] = new int[s1.length()];
        int visited = -1;
        for(int i=0; i<s1.length(); i++)
        {
            int count = 1;
            for (int j=i+1; j<s1.length();j++)
            {
                if(ch1[i] == ch1[j])
                {
                    count++;
                    fr[j] = visited;
                }

            }
            if(fr[i]!=visited)
                fr[i] = count;
        }
    }
}
