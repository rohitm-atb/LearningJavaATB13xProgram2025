package ex06_Ternary_Operator;

public class Lab006_Ternary_Ex06 {
    public static void main(String[] args) {
        //Find Minor/Adult/Senior Citizen
        // age < 18 - Minor
        // 18 < age > 65 - Adult
        // age > 65 - Senior Citizen

        int age = 38;

        String result = (age < 18) ? "Minor" : (age < 65) ? "Adult" : "Senior Citizen";

        System.out.println(result);


    }
}
