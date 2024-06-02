package com.freecharge;

import java.util.HashMap;
import java.util.Map;

public class HMTest {

    public static void main(String[] args) {

      Map<String, String> map = new HashMap<>();

      map.put("One", "Ayush");
      map.put("Two", "Bhavuk");
      map.put("Three", "Prayansh");

      System.out.println(map);

      for(Map.Entry e : map.entrySet())
      {
          System.out.println(e.getKey()+" - "+e.getValue());
      }
    }
}
