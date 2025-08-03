package ex31_Exceptions;
//Middle level Eng. handled

public class Lab011_Excp_Ex11 {
    public static void main(String[] args) {

        try {
            String ip = args[0]; // java.lang.ArrayIndexOutOfBoundsException
            int a = Integer.parseInt(ip); // NumberFormatException
            int b = 100 / a; // ArithmeticException
            System.out.println(b);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
