package Task_Program_HW;

public class Lab031_Default_Constructor {

    //A default constructor is a constructor without parameters.

    // Program 1: Default Constructor Example

    public static void main(String[] args) {
        Employee emp = new Employee();
    }
}

class Employee{

    String emp_name;
    int emp_num;
    double sal;

    Employee()
    {
        System.out.println("Ramesh");
        System.out.println(1001);
       System.out.println("50,000");
    }

}