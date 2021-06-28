package com.example.learnjava.hashmap;

import java.util.HashMap;

public class hashmap{
    public static void main(String[] args) {
        HashMap<String,Integer> gameStats=new HashMap<String, Integer>();
        gameStats.put("id",234);
        gameStats.put("regNo",230018);
        System.out.println( gameStats.size());
        for (String key:gameStats.keySet()) {
            System.out.println(key);
        }
        for (int values:gameStats.values()) {
            System.out.println(values);
        }
        for (String key:gameStats.keySet()) {
            System.out.println(key+":"+gameStats.get(key));
        }
    }

}
