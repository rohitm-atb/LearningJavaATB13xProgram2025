package ex09_If_Condition;

import java.util.Scanner;

public class Lab008_Task_02 {

   /* Grade Calculator:

    Write a program that calculates and displays the letter grade for a given numerical score
            (e.g., A, B, C, D, or F) based on the following grading scale:

    A: 90-100
    B: 80-89
    C: 70-79
    D: 60-69
    F: 0-59*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Marks : ");
        int marks = scanner.nextInt();

        if (marks >= 90){
            System.out.println("Your Grade is : A");}
        else if (marks >= 80 && marks <=89) {
            System.out.println("Your Grade is : B");
        }
        else if (marks >= 70 && marks <=79) {
            System.out.println("Your Grade is : C");
        }
        else if (marks >= 60 && marks <=69) {
            System.out.println("Your Grade is : D");
        }
        else if (marks >= 0 && marks <=59) {
            System.out.println("Your Grade is : F");
        }
        else{
            System.out.println("Invalid : Give score between 0 to 100");
        }

    }
}
