package Task_Program_HW;

import java.util.Scanner;

public class Lab020_Calculate_Bonus {

    /*Calculate Bonus Based on Salary and Years of Experience.
          :- take the salary and Year info from the User.
    Implement Bonus Calculation Logic:
    Define the bonus structure based on salary and years of experience.
           :- If years of experience is less than 1 year: No bonus.
           :- If years of experience is between 1 and 3 years: Bonus is 5% of the salary.
           :- If years of experience is between 4 and 6 years: Bonus is 10% of the salary.
           :- If years of experience is greater than 6 years: Bonus is 15% of the salary.*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the annual Salary : ");
        double annual_sal = sc.nextDouble();

        System.out.println("Enter the Years of Experience : ");
        int Yrs_Exp = sc.nextInt();

        if (Yrs_Exp < 1) {
            System.out.println("No bonus");
        } else if (Yrs_Exp > 1 && Yrs_Exp <= 3) {
            double bonus = annual_sal * 0.05;
            System.out.println("Bonus: " + bonus);
        } else if (Yrs_Exp >= 4 && Yrs_Exp < 6) {
            double bonus = annual_sal * 0.10;
            System.out.println("Bonus: " + bonus);
        } else if (Yrs_Exp <= 6) {
            double bonus = annual_sal * 0.15;
            System.out.println("Bonus: " + bonus);
        }
        else
        {
            System.out.println("Entered valid data ");
        }
    }
}
