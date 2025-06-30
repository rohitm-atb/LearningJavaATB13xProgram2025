package Task_Program_HW;

import java.util.Scanner;

public class Lab013_Prime_Number {

    //Check if a Number is Prime

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = scanner.nextInt();

        boolean isPrime = true; // Assume prime initially

        if (num <= 1) {
            isPrime = false; // Numbers less than or equal to 1 are not prime
        } else if (num == 2) {
            isPrime = true; // 2 is a prime number
        } else if (num % 2 == 0) {

            isPrime = false; // Even numbers greater than 2 are not prime
        } else {
            // Check for divisibility from 3 up to the square root of the number,
            // incrementing by 2 to check only odd divisors
            for (int i = 3; i * i <= num; i += 2) {
                if (num % i == 0) {
                    isPrime = false; // Found a divisor, not prime
                    break; // No need to check further
                }
            }
        }

        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}