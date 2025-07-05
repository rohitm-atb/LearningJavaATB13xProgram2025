package Task_Program_HW;

import java.util.Scanner;

public class Lab017_Armstrong {

//    Check if a Number is an Armstrong Number.

    public static void main(String[] args) {

        System.out.println("Enter the Valid Number : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int  originalNumber, remainder, result = 0;

        originalNumber = number;

        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if (result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");

    }
}
