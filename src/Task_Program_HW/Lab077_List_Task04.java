package Task_Program_HW;

/*4. Find an Element in ArrayList
📘 Description:
Create an ArrayList of cities: Mumbai, Delhi, Pune.
Check if Pune is present in the list. Print a message accordingly.
(you can use If Condition to check the Pune city and you can take the City name from User)
✅ Expected Output:
Pune is in the list.*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Lab077_List_Task04 {

    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>(Arrays.asList("Mumbai", "Delhi", "Pune"));

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter city name to search: ");
        String city = sc.nextLine();

        if (cities.contains(city)) {
            System.out.println(city + " is in the list.");
        } else {
            System.out.println(city + " is not in the list.");
        }
    }
}
