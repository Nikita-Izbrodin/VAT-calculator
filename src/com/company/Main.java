package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Guess a number:");
        Scanner input = new Scanner(System.in);
        Random generatedNumber = new Random();
        int guessedNumber, guesses = 0;
        //System.out.println(guessedNumber);
        int number = generatedNumber.nextInt(11);
        do {
            guessedNumber = input.nextInt();
            ++guesses;
        } while (number != guessedNumber);
        System.out.printf("You guessed the number %d with %d guesses\n", number, guesses);
    }
}
