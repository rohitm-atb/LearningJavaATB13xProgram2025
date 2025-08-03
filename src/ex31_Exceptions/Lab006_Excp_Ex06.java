package ex31_Exceptions;

public class Lab006_Excp_Ex06 {
    public static void main(String[] args) {
        System.out.println("Starting the program!");

        try {
            String input_user  = null;
            input_user = args[0];
            Integer a = Integer.parseInt(input_user);
            Integer output = 100/a;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException | ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("End of the program!");

    }
}
