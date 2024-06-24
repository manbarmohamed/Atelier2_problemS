package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        Safe safe = new Safe();
//        System.out.println("enter your deposit amount: ");
//        Scanner sc = new Scanner(System.in);
//        int depositAmount = sc.nextInt();
//        System.out.println("enter your withdrawal amount: ");
//        int withdrawalAmount = sc.nextInt();
//        System.out.println("Balance: "+ bankAccount.checkBalance(depositAmount,withdrawalAmount));
//
        safe.checkSafe(true,true,false,10);
    }
}