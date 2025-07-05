package Task_Program_HW;

import java.util.Scanner;

public class Lab018_Loan_Eligible {
    /*Check if a Person is Eligible for a Loan (Based on Age, Salary, and Credit Score)
    * Take the below User info and store it into the variables:
    Age (integer)
    Salary (double or float)
    Credit Score (integer)
    Age Validation:
            :- Check if the age is a positive integer.
            :- Ensure the age is at least 18 years old.
            :- Max age can be 80.
    Salary Validation:
            :- Check if the salary is a positive number.
            :- Define a minimum salary threshold (e.g., 30,000).
    Credit Score Validation:
            :- Check if the credit score is a positive integer.
             :- Define a minimum credit score threshold (e.g., 650).
            :- Max credit score threshold (e.g., 850).*/

    public static void main(String[] args) {

        // Get input from the user
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Age : ");
        int age = sc.nextInt();

        System.out.println("Enter the Salary : ");
        double salary = sc.nextDouble();

        System.out.println("Enter the Credit Score : ");
        int creditscore = sc.nextInt();

        // Define loan eligibility criteria
        int minAge = 18;
        double minSalary = 30000.0; // Example minimum salary
        int minCreditScore = 650;

        if (age >= minAge && salary >= minSalary && creditscore >= minCreditScore)
        {
                    System.out.println("Congratulations! You are eligible for the loan.");
                } else {
                    System.out.println("Sorry, You are not eligible for the loan");
                }


        sc.close();

    }
}
