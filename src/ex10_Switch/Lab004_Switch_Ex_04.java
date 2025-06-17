package ex10_Switch;

import java.util.Scanner;

public class Lab004_Switch_Ex_04 {
    public static void main(String[] args) {

        // Web Automation
        // I will ask the user to give me the input from browser which he wants to
        // use to I will start the automation in that browser.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Browser name, which you want to Start!!");
        String browser = scanner.next();
        browser = browser.toLowerCase();

        switch (browser)
        {
            case "chrome" :
                System.out.println("Starting the Chrome Browser");
                System.out.println("Executing.....");
                System.out.println("TC 001");
                break;

            case "edge" :
                System.out.println("Starting the Edge Browser");
                System.out.println("Executing.....");
                break;

            case "firefox" :
                System.out.println("Starting the Mozilla Browser");
                break;

            default:
                System.out.println("I don't know which browser is this");
        }
    }
}
