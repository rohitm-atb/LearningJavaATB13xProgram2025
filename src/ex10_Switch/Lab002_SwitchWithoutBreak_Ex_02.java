package ex10_Switch;

import java.util.Scanner;

public class Lab002_SwitchWithoutBreak_Ex_02 {

    public static void main(String[] args) {

        // Take a user input and tell them the day which they have told.
        // 1 to 7 -> 1 -> mon, 5 -> fri
        // 8 ? - Not allowed or error

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Day");
        int day = scanner.nextInt();

        switch (day)

        {
            case 1 :
                System.out.println("Monday");
            case 2 :
                System.out.println("Tuesday");
            case 3 :
                System.out.println("Wednesday");
            case 4 :
                System.out.println("Thursday");
            case 5 :
                System.out.println("Friday");
            case 6 :
                System.out.println("Saturday");
            case 7 :
                System.out.println("Sunday");

            default:
                System.out.println("Not Allowed");

        }
    }
}
