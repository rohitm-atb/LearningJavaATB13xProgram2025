package ex08_Increment_Decrement;

public class Lab010_Program_02 {
    public static void main(String[] args) {

        int i = 1;
        i = i++ + ++i;
        System.out.println(i);

        // i + B
        // i -> i++ -> Expi -> 1 , i =2
        // +
        // B -> i -> ExpB , ExpB -> 3 , i = 3

        // Line No. |  a |  Exp
        // 6 | 1 | NA |
        // 7 | 1 | 1+3 -> 4

            }
}
