package Task_Program_HW;

import java.util.Scanner;

public class Lab011_Grade_Calculator {

   /* Calculate Grade Based on Marks. (Follow Below Steps to Write Program.)

1️⃣ Take user input for marks (Use Scanner class).
2️⃣ Check the validity of marks (ensure they are between 0 and 100).
3️⃣ Use if-else-if conditions to determine the grade based on marks.
4️⃣ Display the grade as output.

📌 Grading Criteria (Example)

Marks Range Grade
90 - 100   A+
80 - 89     A
70 - 79      B
60 - 69     C
50 - 59      D
40 - 49      E
Below 40   Fail*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Marks : ");
        int marks = scanner.nextInt();

        if (marks >= 90){
            System.out.println("Your Grade is : A+");}
        else if (marks >= 80 && marks <=89) {
            System.out.println("Your Grade is : A");
        }
        else if (marks >= 70 && marks <=79) {
            System.out.println("Your Grade is : B");
        }
        else if (marks >= 60 && marks <=69) {
            System.out.println("Your Grade is : C");
        }
        else if (marks >= 50 && marks <=59) {
            System.out.println("Your Grade is : D");
        }
        else if (marks >= 40 && marks <=49) {
            System.out.println("Your Grade is : E");
        }
        else if (marks >= 0 && marks < 40) {
            System.out.println("Your Grade is : Fail");
        }
        else{
            System.out.println("Invalid : Give score between 0 to 100");
        }

    }
}
