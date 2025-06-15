package ex08_Increment_Decrement;

public class Lab004_Advance_001 {
    public static void main(String[] args) {

        int a = 20;
        System.out.println(a++ + a);

        // A + B
        // A -> a++ -> ExpA -> 20 , a =21
        // +
        // B -> a -> ExpB , ExpB -> 21 , a = 21

        // Line No. |  a |  Exp
        // 6 | 20 | NA |
        // 7 | 21 | 20+21 -> 41

    }
}
