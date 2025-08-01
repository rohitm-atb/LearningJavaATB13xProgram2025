package ex29_Enum;

public class Lab002_Enum_Ex02 {
    public static void main(String[] args) {
        System.out.println(Locators.page_input_email.getLocators());
        System.out.println(Locators.page_input_password.getLocators());
        System.out.println(Locators.page_button.getLocators());

        System.out.println(Colors.RED.getHexCode());
        System.out.println(Colors.GREEN.getHexCode());
    }
}
