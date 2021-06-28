package com.example.learnjava;

public class controllflow {
    public static void main(String[] args) {
        int a = 12;
        int b = 12;
        boolean isRunning = false;
        if (a==b){
            System.out.println("a==b is RAUNNING ....");
        }else if (a!=b){
            System.out.println(".... a!=b running ......");
        }else if(isRunning){
            System.out.println(".......running......");
        }else{
            System.out.println(".....switching off..........");
        }
        //exersis
        String Command = "Withdraw";
        double balance = 1000;
        double amount = 100;
        if (Command =="Withdraw"){
           balance= balance-amount;
            System.out.println("your balance is "+balance);
        }else if(Command == "Deposit") {
            balance=balance+amount;
            System.out.println("your balance is "+balance);
        }
    }
}
