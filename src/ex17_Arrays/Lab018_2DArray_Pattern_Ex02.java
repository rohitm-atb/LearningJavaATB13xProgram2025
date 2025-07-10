package ex17_Arrays;

import java.util.Scanner;

public class Lab018_2DArray_Pattern_Ex02 {

    public static void main(String[] args) {

        System.out.println("Enter the Number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = num; i >=1; i--) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
