package ex31_Exceptions;

public class Lab005_Excp_Ex05 {
    public static void main(String[] args) {

        String s = null;
        try {
            s.trim();
            int a = 10/0;
        } catch (NullPointerException | ArithmeticException e) {
            System.out.println("Null or Arithmetic Error");;
        } catch (Exception e)
        {
            System.out.println("Yes");
        }


    }
}
