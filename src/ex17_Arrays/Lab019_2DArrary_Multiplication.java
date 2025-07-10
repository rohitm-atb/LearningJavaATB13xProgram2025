package ex17_Arrays;

import java.util.Scanner;

public class Lab019_2DArrary_Multiplication {

    public static void main(String[] args) {

        System.out.println("Enter the Array Size : ");
        Scanner sc = new Scanner(System.in);
        int size_of_table = sc.nextInt();

        for (int i = 0; i < size_of_table; i++) {
            for (int j = 0; j < size_of_table; j++) {

                System.out.print(i*j + " | ");
            }

            System.out.println();
        }
    }
}
