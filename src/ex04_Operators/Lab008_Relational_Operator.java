package ex04_Operators;

public class Lab008_Relational_Operator {

    public static void main(String[] args) {

        // < Less Than
        // < =  -> Less than or equal to
        // > Greater
        // > = Greater or equal
        // == ->  Equal to (but checking)
        // != -> Not equal

        // All of them will result boolean output.

        int num = 10;
        int num1 = 20;
        boolean result = num > num1;
        System.out.println(result);

        int age_ram = 40;
        int age_laxman = 38;
        boolean result1 = age_ram >= age_laxman;
        System.out.println(result1);

        int a = 40;
        int b = 38;
        boolean r= a != b;
        System.out.println(r);

        int a1 = 40;
        int b1 = 38;
        boolean r1= a == b;
        System.out.println(r1);



    }
}
