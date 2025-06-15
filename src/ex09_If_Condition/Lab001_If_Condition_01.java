package ex09_If_Condition;

import java.util.Scanner;

public class Lab001_If_Condition_01 {

    public static void main(String[] args) {

        System.out.println("Enter the Age");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age >= 18)
        {
            System.out.println("Allowed to Vote");
        }
    }
}
