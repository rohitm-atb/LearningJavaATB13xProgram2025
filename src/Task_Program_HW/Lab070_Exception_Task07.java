package Task_Program_HW;

/*Task 7: Handle Checked Exception using Try-Catch

📘 Description:
Open a file using FileReader and handle FileNotFoundException using try-catch.*/

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab070_Exception_Task07 {

    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("nonexistentfile.txt");
            System.out.println("File opened successfully.");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
