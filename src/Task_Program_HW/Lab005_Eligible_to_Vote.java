package Task_Program_HW;

import java.util.Scanner;

public class Lab005_Eligible_to_Vote {

    //Check if a Person is Eligible to Vote (Age Check).

    public static void main(String[] args) {

        System.out.println("Enter the Age");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age >= 18)
        {
            System.out.println("Allowed to Vote");
        }
        else
        {
            System.out.println("Not Allowed to Vote");
        }
    }
}
