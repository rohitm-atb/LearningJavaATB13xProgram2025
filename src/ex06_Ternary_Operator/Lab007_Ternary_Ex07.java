package ex06_Ternary_Operator;

public class Lab007_Ternary_Ex07 {

    public static void main(String[] args) {

        // Find the maximum between the three numbers.

        int num1 = -5;
        int num2 = 10;
        int num3 = 2;

        int max_num = (num1 > num2) ? (num1 > num3) ? num1 : num3 : (num2 > num3) ? num2 : num3;

        System.out.println(max_num);
    }
}
