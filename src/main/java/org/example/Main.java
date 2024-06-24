package org.example;

import java.util.ArrayList;
import java.util.Scanner;

import static org.example.Challenge1.sortAndRemoveDuplicates;

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


        int[] inputArr = {5, 3, 8, 3, 9, 1, 5};
        ArrayList<Integer> outputList = sortAndRemoveDuplicates(inputArr);
        System.out.println(outputList);
    }
}