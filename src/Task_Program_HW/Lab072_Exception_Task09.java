package Task_Program_HW;
/*Task 9: Try Block Without Exception
📘 Description:
Write a try block that does not throw any exception.
Verify that the catch block is skipped and finally still runs.*/

public class Lab072_Exception_Task09 {
    public static void main(String[] args) {
        try {
            int result = 10 / 2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("This won't print since no exception occurred.");
        } finally {
            System.out.println("Finally block executes anyway.");
        }
    }
}
