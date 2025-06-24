package Task_Program_HW;

import java.util.Scanner;

public class Lab003_Max_Two_Numbers {

    //Find the Maximum of Two Numbers.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First Number : ");
        int num1 = scanner.nextInt();

        System.out.println("Enter the Second Number : ");
        int num2 = scanner.nextInt();

        int max;


        if (num1 > num2)
        {
           max = num1;
        } else
        {
            max = num2;
        }

        System.out.println("The maximum of " + num1 + " and " + num2 + " is: " +max);
    }
}
