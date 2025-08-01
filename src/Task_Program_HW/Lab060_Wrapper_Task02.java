package Task_Program_HW;
/*Task 2: Converting String to Primitive Using Wrapper
📘 Description:
Use Integer.parseInt() to convert a string (e.g. "123") into a primitive int and print it.
📤 Expected Output:
Parsed number: 123*/

public class Lab060_Wrapper_Task02 {
    public static void main(String[] args) {
        String numberStr = "123";
        int parsedNumber = Integer.parseInt(numberStr);  // String to int

        System.out.println("Parsed number: " + parsedNumber);
    }
}
