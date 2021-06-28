package com.example.learnjava;

public class returntypes {
    public static void main(String[] args) {
        int results=addNumbers(40,996);
        System.out.println(results);
        int sum = addNumbers(78,90)+60;
        System.out.println(sum);
        String myName=fullname("joe","kingsley");
        System.out.println(myName);
        char characta = showChar('a');
        System.out.println(characta);
    }
    public static int addNumbers(int a ,int b){
        int result = a+b;
        return  result;
    }
    public static String fullname(String firstName,String lastName){
        return firstName+" "+lastName;
    }
    public static char showChar(char characta){
        return characta;
    }
    public static String showBio (String name, String bio, int age){
        String Description = "my name is "+name+ " and i am "+age+" years old. "+bio;
        return Description;
    }
}
