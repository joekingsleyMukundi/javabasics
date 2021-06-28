package com.example.learnjava;

public class methods {
    public static void main(String[] args) {
        showname();
        int age = 5;
        String name = "joe";
        myName(name,age);
        addNumbers(12,35);
        multiply(34,60);
        div(34,78);
    }
    //method
    public static void showname(){
        System.out.println("from show name");
    }
    //function parameters
    public static  void  myName(String name,int age){
        System.out.println("my name is " +name+" and i am "+age+" years old.");
    }
    public static  void addNumbers(int a, int b){
        int sum =a+b;
        System.out.println("The sum is " + sum);
    }
    //Todo: create  a multiply function divide function....
    public static void  multiply(int a,int b){
        int product = a*b;
        System.out.println(product);

    }
    public  static  void  div (int a , int b ){
        double dif = ((double)(a)/(double)(b));
        System.out.println(dif);
    }
}
