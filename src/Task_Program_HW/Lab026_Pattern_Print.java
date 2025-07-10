package Task_Program_HW;

public class Lab026_Pattern_Print {

    public static void main(String[] args) {

        int rows = 3; // Number of rows for the pyramid

        // Outer loop for the number of rows
        for (int i = 1; i <= rows; i++) {

            // Inner loop to print leading spaces
            // The number of spaces decreases with each row
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Inner loop to print asterisks
            // The number of asterisks increases by 2 in each row (1, 3, 5, ...)
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            // Move to the next line after each row is complete
            System.out.println();
        }
    }
}
