package Task_Program_HW;

import java.util.Scanner;

public class Lab014_ATM_Withdrawal {

    /*ATM Withdrawal Simulation. (Follow Below Steps to Write Program)
       Steps to Write the Program
1️⃣ Initialize the account balance with a fixed amount (e.g., ₹10,000).
2️⃣ Take user input for the amount they want to withdraw.
3️⃣ Check withdrawal conditions:
The amount should be greater than zero.
The amount should be a multiple of 100 (common ATM rule).
The amount should not exceed the account balance.
4️⃣ Deduct the amount from the balance if conditions are met.
5️⃣ Display the updated balance or an error message if the withdrawal fails.*/

    public static void main(String[] args) {

        int acc_bal = 10000;

        System.out.println("Welcome to the ATM!");
        System.out.println("Your current balance is: " + acc_bal);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount for withdraw :");
        int with_amt = scanner.nextInt();

        if (with_amt <= 0)
        {
            System.out.println("The amount should be greater than zero.");
        } else if ( with_amt % 100 !=0) {
            System.out.println("The amount should be a multiple of 100");
            
        } else if (with_amt > acc_bal) {
            System.out.println("Insufficient funds. You do not have enough money, " + acc_bal + " in your account." );

        }
        else {
            acc_bal =  acc_bal - with_amt; // Deduct the amount
            System.out.println("Withdrawal successful! Please collect your cash.");
            System.out.println("Your new balance is: " + acc_bal);
        }
    }
}
