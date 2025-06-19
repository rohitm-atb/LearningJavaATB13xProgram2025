package ex13_Do_While;

import java.util.Scanner;

public class Lab004_Coding_Program_Vowel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Charater : ");
        char ch = scanner.next().toLowerCase().charAt(0);

//        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
//            System.out.println(ch +  " is Vowel");
//        else
//            System.out.println(ch +  " is Consonant");

        switch (ch)
        {
            case 'a', 'e', 'i', 'o', 'u' -> System.out.println("Vowel");
            default -> System.out.println("Consonant");
        }
    }
}
