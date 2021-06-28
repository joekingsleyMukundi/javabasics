package com.example.learnjava;

public class operators {
    public static void main(String[] args) {
        int a= 12;
        int b= 34;

        int sum = a+b;
        int diff = a-b;
        int mult = a*b;
       // type casting
        double div =((double)(a))/((double)(b));
        //modilas
        double remainder = a%b;

        System.out.println(sum);
        System.out.println(diff);
        System.out.println(mult);
        System.out.println(div);
        System.out.println(remainder);

    }
}
