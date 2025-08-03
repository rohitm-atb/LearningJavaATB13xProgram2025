package Task_Program_HW;

/*Task 10: Try With Multiple Statements
📘 Description:
Write multiple statements in a try block.
Ensure if the first fails, the rest are not executed, and control goes to catch.*/

public class Lab073_Exception_Task10 {
    public static void main(String[] args) {
        try {
            int result1 = 10 / 0; // This fails, throwing ArithmeticException
            System.out.println("This line won't execute.");
            int result2 = 20 / 4; // This won't run
            System.out.println("Result2: " + result2);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage() + ". Subsequent statements skipped.");
        }
    }
}
