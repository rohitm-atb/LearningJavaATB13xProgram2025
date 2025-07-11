package Task_Program_HW;

import java.util.Scanner;
/*Convert Days into Years, Months, and Days.
       :- Take the Days Input from the User
Define the conversion logic:
       :- Assume 1 year = 365 days.
        :- Assume 1 month = 30 days
        :- Convert the Days into Years, Month and days and Print it.
        if you input 1000 days, the output of the program would be:  2 years, 9 months, and 0 days.*/

public class Lab028_Convert_Years_Into_Days {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Days : ");
        int total_days = scanner.nextInt();

        int year = 0;
        int month =0;
        int days = 0;

        //Calculating Years

        if (total_days >= 365)
        {
            year = total_days/365;
            total_days = total_days % 365;
        }

//Calculating Months

        if (total_days >= 30)
        {
            month = total_days/30;
            total_days = total_days % 30;
        }
        else
        {
            days = total_days;
        }

        System.out.println(" Year, " + year + " Month, " + month + " Days, " + days);
        scanner.close();
    }

}
