package ex07_UserInput;

import java.util.Scanner;

public class Lab004_UI_Scanner_02 {

    public static void main(String[] args) {

        System.out.println("Enter the Name");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        System.out.println(s);

        System.out.println("Enter the Age");
        int age = scanner.nextInt();
        System.out.println(age);

        System.out.println("Enter the Value");
        double d = scanner.nextDouble();
        System.out.println(d);



    }
}
