package ex12_While;

import java.util.Random;
import java.util.Scanner;

public class Lab006_While_Ex06 {
    public static void main(String[] args) {
        // Guess a number between 1 and 100
        // Random =>  1 to 100

        Random random = new Random();
        int numberToGuess = random.nextInt(100)+1;
        //System.out.println(numberToGuess);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number");

        int guess;
        int attempts = 0;

    while (true)
    {
        guess = scanner.nextInt();
        attempts++;

        if(guess < numberToGuess){
            System.out.println("Too low, try again");
        } else if( guess > numberToGuess){
            System.out.println("Too high, try again");
        }else{
            System.out.println("Correct! You guessed it in " + attempts + " attempts");
            break;
        }
    }
    }
}
