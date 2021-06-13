package com.basicprograms;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "Robin Loomba");
        hm.put(1, "Robin Loomba");//Try to add duplicate value in map
        hm.put(2, "Donald Trump");
        hm.put(3, " Manpreet Singh");
        hm.put(4, "Pratap singh");
        for (Map.Entry m : hm.entrySet()) {
            System.out.println("Key value is " + m.getKey() + " :" + m.getValue());
        }

        hm.remove(2);
        System.out.println("After removing value");
        for(Map.Entry m : hm.entrySet())
        {
            System.out.println(m.getKey() +"" +m.getValue());
        }


    }
}
