/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numberguessinggame;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numberToGuess = random.nextInt(100)+1;
        int numberOfTries = 0;
        int guess;
        boolean hasWon = false;
        System.out.println("welcome to the number guessing game");
        System.out.println("i have selected number between 1 and 100 and can you guess it");
        
        while(!hasWon){
            System.out.println("Enter your guess:");
            guess = scanner.nextInt();
            numberOfTries++;
            
            if (guess<numberToGuess){
                System.out.println("Too low bro! try again in a few lightyears.");
            }
            else if(guess>numberToGuess){
                System.out.println("too high like lee!!!!!! try again boii.");
            }
            else{
                hasWon =true;
                System.out.println("congratulations small ballz, you finally did something right" +numberOfTries);
            }
        }
    }
}
