package ex08_Increment_Decrement;

public class Lab014_Program_06 {
    public static void main(String[] args) {

        int x = 5;
        int y = x++ + ++x + x++ + ++x;
        System.out.println("x = " + x + ", y = " + y);

        // x + y
        // x -> x++ -> Expx -> 5 , x =6
        // +
        // y -> x -> Expy , Expy -> 7 , x = 7

        // x -> x++ -> Expx -> 7 , x =8
        // +
        // y -> x -> Expy , Expy -> 9 , x = 9

        // Line No. |  a |  Exp
        // 6 | 5 | NA |
        // 7 | 9 | 5+7 -> 12 + 7+9 -> 16, 12+16  = 28

            }
}
