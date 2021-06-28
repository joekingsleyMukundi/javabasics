package com.example.learnjava.arrys;

public class arrys {
    public static void main(String[] args) {
        int[] myfirstArray = {1,2,3,4,5};
        System.out.println(myfirstArray[4]);
        String[] myStrArray= {"michel","sancho","mango","deco"};
        System.out.println(myStrArray[2]);
        for (int i = 0;i<myfirstArray.length;i++){
            System.out.println(myfirstArray[i]);
        }

        int[] emptyArray = new int[4];
        emptyArray[0] = 9;
        emptyArray[1]=45;
        emptyArray[2]=34;
        emptyArray[3] =28;


        System.out.println(emptyArray[3]);
    }
}
