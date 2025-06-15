package ex08_Increment_Decrement;

public class Lab006_Advance_003 {
    public static void main(String[] args) {

        int a = 20;
        System.out.println(++a + ++a);

        // A + B
        // A -> a++ -> ExpA -> 21 , a =21
        // +
        // B -> a -> ExpB , ExpB -> 22 , a = 22

        // Line No. |  a |  Exp
        // 6 | 21 | NA |
        // 7 | 22 | 21+22 -> 43

    }
}
