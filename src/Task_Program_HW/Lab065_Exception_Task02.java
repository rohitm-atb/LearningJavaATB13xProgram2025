package Task_Program_HW;

/*Task 2: Try-Catch with Multiple Catch Blocks
📘 Description:
Write code that may throw either ArithmeticException or ArrayIndexOutOfBoundsException and handle them with multiple catch blocks.
🧤 Expected Output:
Print which exception occurred.*/

public class Lab065_Exception_Task02 {
    public static void main(String[] args) {
        try {
            // Uncomment one line to test each exception
           // int result = 10 / 0; // ArithmeticException
            int[] array = new int[5];
            System.out.println(array[10]); // ArrayIndexOutOfBoundsException
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occurred: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occurred: " + e.getMessage());
        }
    }
}
