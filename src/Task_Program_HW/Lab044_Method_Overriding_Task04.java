package Task_Program_HW;
/*Task 4: Login Functionality
Title: Different login behaviors for users
Description:
Create a class User with method login() that prints “User login”.
Create subclasses AdminUser and RegularUser, each overriding login() with their own logic/messages.
Demonstrate calling the login() method using base class reference to highlight runtime polymorphism.*/

public class Lab044_Method_Overriding_Task04 {
    public static void main(String[] args) {

        User1 u;

        u = new AdminUser1();
        u.login();

        u = new RegularUser();
        u.login();

    }
}


class User1
{
    void login()
    {
        System.out.println("User login");
    }
}

class AdminUser1 extends User1
{
    void login()
    {
        System.out.println(" Admin User login");
    }
}

class RegularUser extends User1
{
    void login()
    {
        System.out.println(" Regular User login");
    }
}