package Task_Program_HW;

/*Task 3: Employee Role Info
Title: Show employee roles with overridden methods
Description:
Create a class Employee with method role() printing “General Employee”.
Create child classes Manager, Clerk, Tester, each overriding role() to print their specific roles.
Call role() on each object to show how overriding helps in specialization.*/

public class Lab043_Method_Overriding_Task03 {
    public static void main(String[] args) {

        Employee1 e;

        e = new Manager();
        e.role();

        e = new Clerk();
        e.role();

        e = new Tester();
        e.role();

    }
}

class Employee1
{
    void role()
    {
        System.out.println("General Employee");
    }
}

class Manager extends Employee1
{
    void role()
    {
        System.out.println("Manager");
    }
}

class Clerk extends Employee1
{
    void role()
    {
        System.out.println("Clerk");
    }
}

class Tester extends Employee1
{
    void role()
    {
        System.out.println("Tester");
    }
}