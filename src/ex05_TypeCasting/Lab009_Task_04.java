package ex05_TypeCasting;

public class Lab009_Task_04 {

    public static void main(String[] args) {

//        Typecasting in Division
//        Description: int a = 10, int b = 3; now divide 10/3 and store the decimal value in the Result variable and print it.

        int a = 10;
        int b = 3;
        int c = a/b;
        System.out.println(c);
        float result = (float) a/b;
        System.out.println(result);
    }
}
