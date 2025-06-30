package Task_Program_HW;

import java.util.Scanner;

public class Lab008_Smallest_Three_Numbers {

    //Find the Smallest of Three Numbers.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First Number : ");
        int num1 = scanner.nextInt();

        System.out.println("Enter the Second Number : ");
        int num2 = scanner.nextInt();

        System.out.println("Enter the Third Number : ");
        int num3 = scanner.nextInt();

        int smallest;


        if (num1 <= num2 && num1 <= num3)
        {
            smallest = num1;
        } else if (num2 <= num1 && num2 <= num3)
        {
            smallest = num2;
        } else
        {
            smallest = num3;
        }

        System.out.println("The smallest of " + num1 + " and " + num2 + " and " + num3 + " is: " + smallest);
    }
}
