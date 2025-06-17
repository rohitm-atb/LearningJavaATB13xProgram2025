package ex10_Switch;

import java.util.Scanner;

public class Lab003_Switch_WithoutDefault_Ex_03 {

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
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;


        }
    }
}
