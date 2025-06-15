package ex08_Increment_Decrement;

public class Lab005_Advance_002 {
    public static void main(String[] args) {

        int a = 20;
        System.out.println(a++ + ++a);

        // A + B
        // A -> a++ -> ExpA -> 20 , a =21
        // +
        // B -> a -> ExpB , ExpB -> 22 , a = 22

        // Line No. |  a |  Exp
        // 6 | 20 | NA |
        // 7 | 22 | 20+22 -> 42

    }
}
