package Task_Program_HW;

import java.util.Scanner;

public class Lab001_Number_Positive_Negative {

    //Check if a Number is Positive or Negative.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = scanner.nextInt();

        if (num > 0)
        {
            System.out.println(num + " is Positive Number");
        } else if (num < 0) {
            System.out.println(num + " is Negative Number");
        }
        else {
            System.out.println(num + " is zero");
        }
    }
}
