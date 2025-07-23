package ex21_Oops_Polymorphism.MethodOverloading;

public class Lab003_MethodOverloading_Ex03 {
    public static void main(String[] args) {

        Browser b1 = new Browser();

        b1.startBrowser("chrome");
    }
}

class Browser
{

    void startBrowser()
    {
        System.out.println("Starting a deafult browser");
    }

    String startBrowser(String browser)
    {
        System.out.println("Starting a browser " + browser);
        return browser;
    }
}
