package Task_Program_HW;

import java.util.Scanner;

public class Lab009_Largest_Two_Numbers {

    //Find the Largest of Two Numbers.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First Number : ");
        int num1 = scanner.nextInt();

        System.out.println("Enter the Second Number : ");
        int num2 = scanner.nextInt();

           int largest;


        if (num1 >= num2)
        {
            largest = num1;
        }
        else
        {
            largest = num2;
        }

        System.out.println("The largest of " + num1 + " and " + num2 +  " is: " + largest);
    }
}
