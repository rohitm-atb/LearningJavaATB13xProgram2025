package Task_Program_HW;

import java.util.Scanner;

public class Lab002_Number_Even_Odd {

    //Check if a Number is Even or Odd.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = scanner.nextInt();

        if (num % 2 ==0)
        {
            System.out.println(num + " is Even Number");
        } else
        {
            System.out.println(num + " is Odd Number");
        }

    }
}
