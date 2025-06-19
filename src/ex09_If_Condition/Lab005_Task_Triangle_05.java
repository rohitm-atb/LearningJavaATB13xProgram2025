package ex09_If_Condition;

import java.util.Scanner;

public class Lab005_Task_Triangle_05 {

    public static void main(String[] args) {

//  //      Triangle Classifier:Write a program that classifies a triangle based on its side lengths.
////        Given three input values representing the lengths of the sides,
////        determine if the triangle is equilateral (all sides are equal), isosceles (exactly two sides are equal),
////                or scalene (no sides are equal).
////                Use an if-else statement to classify the triangle.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Side 1 of Triangle : ");
        int side1 = scanner.nextInt();

        System.out.println("Enter the Side 2 of Triangle : ");
        int side2 = scanner.nextInt();

        System.out.println("Enter the Side 3 of Triangle : ");
        int side3 = scanner.nextInt();

        if ((side1 == side2) && (side2 == side3)){
            System.out.println("The triangle is Equilateral");
        }
        else if ((side1 == side2)  || (side2 == side3) || (side1 == side3)){
            System.out.println("The triangle is isosceles");
        }
        else {
            System.out.println("The triangle is scalene");
        }

    }
}
