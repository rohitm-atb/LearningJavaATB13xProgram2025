package ex31_Exceptions;

public class Lab008_Excp_Ex08 {

    public static void main(String[] args) {

        int a =Integer.parseInt(args[0]);
        int c = 0;
        try {
            c = 10/a;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("I will be always executed!");

        }

    }
}
