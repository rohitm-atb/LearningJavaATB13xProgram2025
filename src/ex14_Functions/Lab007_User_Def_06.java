package ex14_Functions;

import java.util.Scanner;

/**
 * This class provides basic arithmetic operations.
 */
public class Lab007_User_Def_06 {

    // Create a Function of  Sum, Sub, Mul, Mod and Div
    // with parameter, a, b (take the parameter from the User)

    // Logic Building
    // Step 1 -> Inputs and Outputs
    //  a, b - int -> Scanner
    //  int -> variable result ->


    // Step 2 - Rough logic -> Create functions
    // function -> type 4th - with return and with arguments/ parameters


    // Step 3 - Write the code and Find and Fix  -> Edge Cases

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First Number : ");
        int a = scanner.nextInt();

        System.out.println("Enter the First Number : ");
        int b = scanner.nextInt();

        int sum_result = sum(a,b);
        System.out.println("Addition : " +sum_result);

        int sub_result = sub(a,b);
        System.out.println("Substraction : " +sub_result);

        int mul_result = mul(a,b);
        System.out.println("Multiplication : " +mul_result);

        int div_result = div(a,b);
        System.out.println("Division : " +div_result);

        int mod_result = mod(a,b);
        System.out.println("Mod : " +mod_result);
    }

    static int sum(int a, int b)
    {
        return a + b;
    }

    static int sub(int a, int b)
    {
        return a - b;
    }

    static int mul(int a, int b)
    {
        return a * b;
    }

    static int div(int a, int b)
    {
        return a / b;
    }

    static int mod(int a, int b)
    {
        return a % b;
    }
}
