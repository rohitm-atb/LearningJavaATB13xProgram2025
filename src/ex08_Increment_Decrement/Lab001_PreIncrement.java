package ex08_Increment_Decrement;

public class Lab001_PreIncrement {
    public static void main(String[] args) {

        int a = 10;
        int b = ++a;
        System.out.println(b);
        System.out.println(a);

        //  Exp and Result Table
        // Line No | a | Result b
        //  6 |  10 |  NA
        // 7 |  11 |  11
        // 8 | 11(NA) | 11
        // 9 | 11 | 11(NA)
    }
}
