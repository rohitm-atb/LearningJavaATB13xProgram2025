package ex06_Ternary_Operator;

public class Lab010_Task_03
{

    public static void main(String[] args)
    {

        //Grade Calculation Using Nested Ternary

        //Marks 90 = A+, 75 = A, 60 = B, 40 = C, below 40 Fail.


        int marks = 35;

        String result = (marks >= 90) ? "A+" : (marks >= 75) ? "A" : (marks >= 60) ? "B" : (marks >= 40) ? "C" : "Fail";

        System.out.println(result);


    }
}
