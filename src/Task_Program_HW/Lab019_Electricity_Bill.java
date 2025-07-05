package Task_Program_HW;

import java.util.Scanner;

public class Lab019_Electricity_Bill {
    /*Electricity Bill Calculation (Based on Units Consumed)
           :- take the input from the user of Units.
    Implement Rate Structure:
    Define the rate structure for calculating the bill based on the number of units consumed.
            :-  First 100 units: 0.50Rs per unit
            :-  Next 100 units (101-200): 0.75Rs per unit
            :- Next 100 units (201-300): 1.20Rs per unit
            :- Above 300 units: 1.50Rs per unit*/

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of units consumed: ");
        int units = input.nextInt();

        double billAmount = 0.0;

        // Define electricity tariff rates based on slabs
        if (units <= 100) {
            billAmount = units * 0.50; // Rate for first 100 units
        } else if (units <= 200) {
            billAmount = (100 * 0.50) + ((units - 100) * 0.75); // Rate for next 100 units
        } else if (units <= 300) {
            billAmount = (100 * 0.50) + (100 * 0.75) + ((units - 200) * 1.20); // Rate for next 100 units
        } else {
            billAmount = (100 * 0.50) + (100 * 0.75) + (100 * 1.20) + ((units - 300) * 1.50); // Rate for units above 300
        }

        System.out.println("Electricity Bill Amount: Rs. " + billAmount);

        input.close();
    }
}
