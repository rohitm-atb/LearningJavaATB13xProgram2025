package Task_Program_HW;

import java.util.Scanner;

public class Lab004_Vowel_Consonant {

    //Check if a Character is a Vowel or Consonant.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Character : ");
        // take only the first character
        char ch = scanner.next().charAt(0);
        // convert character to lowercase
        ch =  Character.toLowerCase(ch);

       if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
        {
            System.out.println(ch + " is a vowel");
        }
        else if ((ch >= 'a' && ch <= 'z'))
        {
            System.out.println(ch + " is a consonant");
        }



    }
}
