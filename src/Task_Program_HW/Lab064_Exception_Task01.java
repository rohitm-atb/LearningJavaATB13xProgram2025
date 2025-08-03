package Task_Program_HW;

/*Task 1: Basic Try-Catch with ArithmeticException
📘 Description:
Divide a number by zero and handle the exception.
🧤 Expected Output:
Catch ArithmeticException and print a friendly message.*/


public class Lab064_Exception_Task01 {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Oops! You can't divide by zero.");
        }
    }
}
