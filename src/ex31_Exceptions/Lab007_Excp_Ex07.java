package ex31_Exceptions;

public class Lab007_Excp_Ex07 {

    public static void main(String[] args) {

        int c = 0;
        int b = 0;
        try {
            b = 10/c;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
