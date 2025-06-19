package ex09_If_Condition;

import java.util.Scanner;

public class Lab006_CodingProgram_Factorial_06 {

    public static void main(String[] args) {

//  Factorial Program

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number :");

        if(!scanner.hasNextInt()){
            System.out.println("Enter the int you fool!");
            return;
        }

        int num = scanner.nextInt();
        long factorial = 1;

        if(num < 0){
            System.out.println("Negative Factorial is not allowed!");
            return;
        }

        if(num <=0){
            System.out.println(factorial);
        }else{
            // Calculate the factorial
            for (int i = 1; i <= num ; i++) {
                //factorial = factorial*i;
                factorial *= i;
            }
        }
        System.out.println("Factorial is -> " + factorial); // Print the calculated factorial
    }
}
