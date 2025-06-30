package Task_Program_HW;

import java.util.Scanner;

public class Lab015_Triangle {

    public static void main(String[] args) {

//        Check if a Triangle is Valid Based on Three Sides.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Side 1 of Triangle : ");
        int side1 = scanner.nextInt();

        System.out.println("Enter the Side 2 of Triangle : ");
        int side2 = scanner.nextInt();

        System.out.println("Enter the Side 3 of Triangle : ");
        int side3 = scanner.nextInt();

         if ((side1 + side2 > side3) && (side2 + side3 > side1) && (side1 + side3 > side2))
         {
            System.out.println("The triangle is valid.");
        }
         else
         {
            System.out.println("The triangle is not valid.");
        }


    }
}
