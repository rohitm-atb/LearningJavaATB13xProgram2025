package ex31_Exceptions;

import java.util.Scanner;

public class Lab009_Excp_Ex09 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Value : ");
        int x = s.nextInt();
        try {
            int a = 10/x;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            s.close();
        }

    }
}
