package com.acarreno.lambda;

import java.util.HashMap;
import java.util.Map;

public class ExampleComparator {

  public static void main(String[] args) {
    comparatorMap();
  }

  private static boolean comparatorMap() {

    Map<Integer, String> map = new HashMap<Integer, String>();
    map.put(10, "z");
    map.put(5, "b");
    map.put(6, "a");
    map.put(20, "c");
    map.put(1, "d");

    Map<Integer, String> map2 = new HashMap<Integer, String>();
    map2.put(10, "z");
    map2.put(1, "w");
    map2.put(5, "b");
    map2.put(6, "a");
    map2.put(20, "c");

    System.out.println("=>" + map.toString().equals(map2.toString()));

    return false;
  }

}
