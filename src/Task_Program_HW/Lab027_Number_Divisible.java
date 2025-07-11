package Task_Program_HW;

import java.util.Scanner;

public class Lab027_Number_Divisible {
//Check if a Number is Divisible by 5 and 11
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = scanner.nextInt();

        if ((num % 5 == 0) && (num % 11 == 0))
        {
            System.out.println("This Number is Divisible by 5 and 11");
        }else
        {
            System.out.println("This Number is not Divisible by 5 and 11");
        }
        scanner.close();
    }
}
