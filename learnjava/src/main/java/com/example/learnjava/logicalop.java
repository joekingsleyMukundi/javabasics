package com.example.learnjava;

public class logicalop {
    public static void main(String[] args) {
        int age = 18;
        boolean isCitizen = true;
        boolean notFelon = false;
        //and operator all conditions should be true
        if(age>=18 && isCitizen && notFelon){
            System.out.println("....voting....");
        }else{
            System.out.println("you cannot vote");
        }
        //or logical operators
        int a = 12;
        int b =11;
        boolean isShowing= false;
        if(a>b || isShowing) {
            System.out.println("....one or both conditions are true");
        }else {
            System.out.println("...both conditions are false");
        }
    }

}
