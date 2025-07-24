package Task_Program_HW;

/*
Task 2: Print Data
Title: Create a universal printer with overloading
Description:
Create a class Printer with multiple printData() methods to handle different data types:

printData(String data)
printData(int data)
printData(float data)
Demonstrate in the main() method how the same method name behaves differently depending on the parameter type.
*/


public class Lab037_Method_Overloading_Task02 {

    public static void main(String[] args) {
        Printer p = new Printer();
        p.printData("Hello");
        p.printData(100);
        p.printData(5.5f);
    }
}

class Printer
{
    void printData(String data)
    {
        System.out.println("String : " + data);
    }

   void printData(int data)
    {
        System.out.println("Int : " + data);
    }

   void  printData(float data)
    {
        System.out.println("Float : " + data);
    }
}
