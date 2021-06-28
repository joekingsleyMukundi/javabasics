package com.example.learnjava;

public class MyClass {

    public static void main(String[] args) {
        //int
        int age = 23;
        int ageinmin = 1200336734;
        long largevalue = 120033673468L;
        //byte cant go over127
        byte value = 127;
        //short
        short value2 = 298;
        //floats
        float temp=23.45f;
        double temp2 = 23.45;
        //string
        String myname = "joe";
        //char
        char letter = 'c';
        System.out.println(myname);
        String lastname = "kings";
        //concatination
        System.out.println("my name is "+myname+" "+lastname+"and i am "+age+" years old");
        //empty string
        String mayname = "";
        System.out.println(mayname);
    }
}