package ex08_Increment_Decrement;

public class Lab013_Program_05 {
    public static void main(String[] args) {

        int a = 5;
        int b = a++ + ++a;
        System.out.println("a: " + a); // Output: ?
        System.out.println("b: " + b); // Output: ?

        // a + B
        // a -> a++ -> Expa -> 5 , a =6
        // +
        // B -> a -> ExpB , ExpB -> 7 , b = 7

        // Line No. |  a |  Exp
        // 6 | 5 | NA |
        // 7 | 5 | 5+7 -> 12

            }
}
