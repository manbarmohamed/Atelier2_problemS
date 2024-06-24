package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("enter your deposit amount: ");
        Scanner sc = new Scanner(System.in);
        int depositAmount = sc.nextInt();
        System.out.println("enter your withdrawal amount: ");
        int withdrawalAmount = sc.nextInt();
        BankAccount bankAccount = new BankAccount();
        System.out.println("Balance: "+ bankAccount.checkBalance(depositAmount,withdrawalAmount));
    }
}