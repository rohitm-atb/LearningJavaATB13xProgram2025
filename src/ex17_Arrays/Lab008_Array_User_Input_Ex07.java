package ex17_Arrays;

import java.util.Scanner;

public class Lab008_Array_User_Input_Ex07 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array");
        int size = sc.nextInt();

        int [] num_mark = new int[size];

        for (int i = 0; i < num_mark.length; i++)
        {
            System.out.println("Enter the Marks");
            num_mark [i] = sc.nextInt();
        }

        System.out.println("Print the Marks");

        for (int i = 0; i < num_mark.length; i++)
        {
            System.out.println(num_mark[i]);
        }
    }
}
