package Task_Program_HW;

import java.util.Scanner;

public class Lab022_Visa_Traval {

   /* Find if a Person Can Travel Based on Visa Status and Age.
    take the input from the user for
    Age (integer).
    Visa Status (String or boolean).

    Check Eligibility:
            :- If age is 18 or older and visa status is valid, the person can travel.
    Otherwise, the person cannot travel.
    Validation Criteria
    Age: - Must be a non-negative integer.
            :- Should be greater than or equal to 18 to be eligible to travel.
    Visa Status :- Must be a valid string indicating the visa status (e.g., "valid" or "invalid").
            :- You can also use a boolean where true indicates a valid visa and false indicates an invalid visa.*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Age : ");
        int age = sc.nextInt();

        System.out.println("Do you have a valid visa? (yes/no): ");
        String visa_status = sc.next();

        if (age < 0) {
            System.out.println("Invalid age. Age cannot be negative.");
        } else if (age >= 18) {
            if (visa_status.equalsIgnoreCase("yes")) {
                System.out.println("You are eligible to travel.");
            } else {
                System.out.println("You need a valid visa to travel.");
            }
        } else {
            System.out.println("You are too young to travel independently.");
        }
    }
}
