package com.example.learnjava.arrys;

import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        //arraylists that only accept one type
        ArrayList <String> names = new ArrayList<>();
        names.add("joe");
        names.add("khali");
        names.add("honest");
        names.add("ghandi");
        //for loop
        for (int i = 0; i <names.size(); i++) {
            System.out.println(names.get(i));
        }
        //for each with a spesific type
        for (String name: names){
            System.out.println(name);
        }

        //arraylists that accepts all types

        ArrayList all = new ArrayList();
        all.add(1);
        all.add("names");
        all.add(true);

        for (int i = 0; i < all.size(); i++) {
            System.out.println(all.get(i));
        }
        //for each with no type
        for (Object nameall:all) {
            System.out.println(nameall);
        }
    }
}
