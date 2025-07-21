package Task_Program_HW;

public class Lab035_Multilevel_Inheritance {

    public static void main(String[] args) {
        SuperAdmin superAdmin = new SuperAdmin();
        superAdmin.login();               // From User
        superAdmin.accessAdminPanel();    // From AdminUser
        superAdmin.shutdownSystem();      // From SuperAdmin
    }
}

// Base class
class User {
    void login() {
        System.out.println("User logged in");
    }
}

// Intermediate class
class AdminUser extends User {
    void accessAdminPanel() {
        System.out.println("Admin panel accessed");
    }
}

// Derived class
class SuperAdmin extends AdminUser {
    void shutdownSystem() {
        System.out.println("System shutdown initiated");
    }
}