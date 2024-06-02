package com.freecharge;

import java.util.HashMap;
import java.util.Map;

public class Check {

    public static void main(String[] args) {

      String s = "abcdabcaba";

      Map<Character, Integer> map = new HashMap<>();
      char ch[] = s.toCharArray();

      for(char c : ch)
      {
          if(map.containsKey(c))
          {
              map.put(c, map.get(c)+1);
          }
          else
              map.put(c,1);
      }

      for(Map.Entry e : map.entrySet())
      {
          System.out.println(e.getKey() + " - " +e.getValue());
      }
    }
}
