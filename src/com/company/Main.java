package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        final double VAT = 1.2;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an amount");
        double amount = input.nextDouble();
        System.out.println("Your price + VAT is " + (amount*VAT) );
    }
}
