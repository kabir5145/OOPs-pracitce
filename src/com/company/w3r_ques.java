package com.company;

import java.util.Scanner;

class Account{
    String accountNumber;
    int balance;

    public Account(String accountNumber, int balance) {
        if (accountNumber == null || accountNumber.isEmpty()) {
            // Print error message if accountNumber is null or empty
            System.err.println("Error: Account number cannot be null or empty.");
            return;
        }
        if (balance < 0) {
            // Print error message if balance is negative
            System.err.println("Error: Balance cannot be negative.");
            return;
        }
            this.accountNumber = accountNumber;
            this.balance = balance;
    }
}
public class w3r_ques {
    public static void main(String[] args) {
//        Question 6 : Constructor with Validation
        Account a = new Account("1234",100000);
        System.out.println("The account number is : "+a.accountNumber);
        System.out.println("The balance is : "+a.balance);

    }
}
