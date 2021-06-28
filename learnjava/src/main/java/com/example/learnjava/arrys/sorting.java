package com.example.learnjava.arrys;

import java.util.Arrays;

public class sorting {
    public static void main(String[] args) {
        int[] arr = {123,45,565,7,8,908,67,12,345,56,76,843,46,657,778,99,56,57,23};
        Arrays.sort(arr);
        //after sorting;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //you can also use sort with strings
    }

}
