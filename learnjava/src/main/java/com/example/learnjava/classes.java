package com.example.learnjava;

public class classes {
    public static void main(String[] args) {
        //creting an instance of micclass
         micclass mymicrophone= new micclass();
         mymicrophone.color = "Black";
         mymicrophone.name = "RBDQ";
         mymicrophone.model = 545634234;

         micclass userMic = new micclass();
         userMic.name = "rund red";
         userMic.color = "black";
         userMic.model = 345290;

         userMic.details();

        System.out.println(mymicrophone.color);

        //creating an inctance of User
        User user1 = new User();
        user1.age = 23;
        user1.fullName = "joekingsley mukundi";
        user1.username = "Khali GHandi";
        user1.password = "Mukundijoe254";

        System.out.println(user1);


        //initisting the constructor name
        constructor con1;
        con1 = new constructor("joe","black",2343);
        System.out.println(con1.name);
    }
}
