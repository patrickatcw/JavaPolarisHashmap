package com.Me;

//http://www.java67.com/2013/02/10-examples-of-hashmap-in-java-programming-tutorial.html

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();

        hashMap.put("bobcat", 7);
        hashMap.put("goat", 3);
        hashMap.put("penguin", 5);
        hashMap.put("grizzly bear", 0);

        for (Map.Entry <String, Integer> entry:hashMap.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println(key + " -----------  " + String.valueOf(value));

            /*
            grizzly bear -----------  0
            bobcat -----------  7
            goat -----------  3
            penguin -----------  5
             */


        }

    }
}
