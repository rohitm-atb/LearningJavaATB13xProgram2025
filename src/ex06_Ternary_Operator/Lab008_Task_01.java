package ex06_Ternary_Operator;

public class Lab008_Task_01 {

    public static void main(String[] args) {

        //Find Max of Two Numbers using Ternary Operators.
        //Description: Uses ternary operator to compare a and b and print the maximum value.A =10, B= 20;

        int a = 10;
        int b = 20;

        int max = a > b ? a : b;

        System.out.println("Max number is : " + max);
    }
}
