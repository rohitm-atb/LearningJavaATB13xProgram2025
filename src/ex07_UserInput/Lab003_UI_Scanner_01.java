package ex07_UserInput;

import java.util.Scanner;

public class Lab003_UI_Scanner_01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Age");
        int age = scanner.nextInt();
        String canIvote = (age >= 18) ? "Yes" : "No";
        System.out.println(canIvote);

    }
}
