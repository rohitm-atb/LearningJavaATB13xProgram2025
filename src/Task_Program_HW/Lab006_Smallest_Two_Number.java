package Task_Program_HW;

import java.util.Scanner;

public class Lab006_Smallest_Two_Number {

    //Find the Smallest of Two Numbers.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First Number : ");
        int num1 = scanner.nextInt();

        System.out.println("Enter the Second Number : ");
        int num2 = scanner.nextInt();

        int small;


        if (num1 < num2)
        {
            small = num1;
        } else
        {
            small = num2;
        }

        System.out.println("The smallest number is: " +small);
    }
}
