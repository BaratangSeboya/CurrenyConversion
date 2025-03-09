package com.univen.currencyconversion;

import java.util.Scanner;

/**
 *
 * @author Baratang Seboya
 */
public class CurrencyConversion { public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the dollar amount
        System.out.print("Enter the amount in dollars: $");
        double amount = scanner.nextDouble();
        
        // Convert the amount to an integer representing cents to avoid floating-point issues
        int totalCents = (int) (amount * 100);
        
        // Calculate the denominations
//        int hundreds = totalCents / 10000; // 100 dollars = 10000 cents
//        totalCents %= 10000;

        int fifties = totalCents / 5000; // 50 dollars = 5000 cents
        totalCents %= 5000;

        int twenties = totalCents / 2000; // 20 dollars = 2000 cents
        totalCents %= 2000;

        int tens = totalCents / 1000; // 10 dollars = 1000 cents
//        totalCents %= 1000;

//        int fives = totalCents / 500; // 5 dollars = 500 cents
//        totalCents %= 500;
//
//        int ones = totalCents / 100; // 1 dollar = 100 cents
//        totalCents %= 100;
//
//        int quarters = totalCents / 25; // Quarter = 25 cents
//        totalCents %= 25;
//
//        int dimes = totalCents / 10; // Dime = 10 cents
//        totalCents %= 10;
//
//        int nickels = totalCents / 5; // Nickel = 5 cents
//        totalCents %= 5;
//
//        int pennies = totalCents; // Pennies = 1 cent
        
        // Display the results
        System.out.println("\nCurrency Denominations for $" + amount + ":");
//        System.out.println("$100 bills: " + hundreds);
        System.out.println("$50 bills: " + fifties);
        System.out.println("$20 bills: " + twenties);
        System.out.println("$10 bills: " + tens);
//        System.out.println("$5 bills: " + fives);
//        System.out.println("$1 bills: " + ones);
//        System.out.println("Quarters: " + quarters);
//        System.out.println("Dimes: " + dimes);
//        System.out.println("Nickels: " + nickels);
//        System.out.println("Pennies: " + pennies);
        
        // Close the scanner object to avoid memory leak
        scanner.close();
    }
}