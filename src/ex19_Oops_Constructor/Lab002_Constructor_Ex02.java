package ex19_Oops_Constructor;

public class Lab002_Constructor_Ex02 {

    public static void main(String[] args) {

        WebAutomation wb = new WebAutomation();
    }
}

class WebAutomation {
    // DC
    WebAutomation() {
        System.out.println("I want to read a CSV File");
        System.out.println("Open the Page before loading the scripts");
        System.out.println("You can do anything which you want to do, when Object is created.");

    }
}
