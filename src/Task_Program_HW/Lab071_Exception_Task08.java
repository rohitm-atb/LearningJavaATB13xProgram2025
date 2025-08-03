package Task_Program_HW;

/*Task 8: Throw Exception and Catch It

📘 Description:
Manually throw an exception using throw new ArithmeticException() and catch it.*/

public class Lab071_Exception_Task08 {

    public static void main(String[] args) {
        try {
            throw new ArithmeticException("Manually thrown exception");
        } catch (ArithmeticException e) {
            System.out.println("Caught manually thrown exception: " + e.getMessage());
        }
    }
}
