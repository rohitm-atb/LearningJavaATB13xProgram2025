package Task_Program_HW;

import java.util.Scanner;

/*Leap Year Checker:

Create a program that determines whether a given year is a leap year.
A leap year is divisible by 4, but not by 100 unless it is also divisible by 400.
Use an if-else statement to make this determination.*/

public class Lab010_Leap_Year {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Year");
        int year = scanner.nextInt();

       if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
        {
            System.out.println( year +" this is a leap year");
        }
        else
        {
            System.out.println( year +" this is not a leap year");
        }
    }
}
