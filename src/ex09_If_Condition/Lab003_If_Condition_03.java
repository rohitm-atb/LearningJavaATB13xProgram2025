package ex09_If_Condition;

import java.util.Scanner;

public class Lab003_If_Condition_03 {

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
