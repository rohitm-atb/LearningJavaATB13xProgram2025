package ex08_Increment_Decrement;

public class Lab007_PreDecrement {
    public static void main(String[] args) {

        int a = 10;
        int b = --a;
        System.out.println(b);
        System.out.println(a);

        //  Exp and Result Table
        // Line No | a | Result b
        //  6 |  10 |  NA
        // 7 |  9 |  9
        // 8 | 9(NA) | 9
        // 9 | 9 | 9(NA)
    }
}
