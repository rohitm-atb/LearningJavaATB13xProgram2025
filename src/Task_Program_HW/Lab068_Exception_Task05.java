package Task_Program_HW;

/*Task 5: Catch Using Exception (Generic Catch)

📘 Description:
Use only catch(Exception e) to catch any exception.
Throw a NullPointerException or ArithmeticException inside try.*/

public class Lab068_Exception_Task05 {

    public static void main(String[] args) {
        try {
            // String s = null;
            // System.out.println(s.length()); // NullPointerException
            int result = 10 / 0; // ArithmeticException
        } catch (Exception e) {
            System.out.println("An exception occurred: " + e.getMessage());
        }
    }
}
