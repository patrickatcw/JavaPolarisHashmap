package com.Me;

//http://www.java67.com/2013/02/10-examples-of-hashmap-in-java-programming-tutorial.html
//https://www.tutorialspoint.com/java/util/hashmap_remove.htm

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();

        //(key, value)
        hashMap.put("bobcat", 7);
        hashMap.put("goat", 3);
        hashMap.put("penguin", 5);
        hashMap.put("grizzly bear", 0);

        String key = null;
        Integer value = null;

        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            key = entry.getKey();
            value = entry.getValue();

            System.out.println(key + " -----------  " + String.valueOf(value));

        }

        hashMap.remove("bobcat", 7);

        System.out.println("-------------------------------------------------");
        System.out.println("after removal of 'bobcat' ");

        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            key = entry.getKey();
            value = entry.getValue();

            System.out.println(key + " -----------  " + String.valueOf(value));


        }

    }
}






