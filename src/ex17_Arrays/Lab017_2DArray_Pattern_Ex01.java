package ex17_Arrays;

import java.util.Scanner;

public class Lab017_2DArray_Pattern_Ex01 {

    public static void main(String[] args) {

        System.out.println("Enter the Number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
