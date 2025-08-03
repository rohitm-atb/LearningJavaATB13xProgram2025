package Task_Program_HW;

/*Task 3: Try-Catch-Finally

📘 Description:
Create a program with a try, a catch, and a finally block.
Demonstrate that the finally block always executes.*/

public class Lab066_Exception_Task03 {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught exception: " + e.getMessage());
        } finally {
            System.out.println("This finally block always executes, regardless of exceptions.");
        }
    }
}
