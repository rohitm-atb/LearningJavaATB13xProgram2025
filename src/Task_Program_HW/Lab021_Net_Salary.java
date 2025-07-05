package Task_Program_HW;

import java.util.Scanner;

public class Lab021_Net_Salary {

//    Calculate Employee Net Salary (Basic Pay, HRA, DA, Tax Deductions,)

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Basic Salary : ");
        double bas_sal = scanner.nextDouble();

        double hra = 0.10 * bas_sal;  // 10% of basic
        double da = 0.08 * bas_sal;   // 8% of basic
        double grossSalary = bas_sal + hra + da;

        double tax = 0.05 * grossSalary; // 5% tax on gross salary
        double netSalary = grossSalary - tax;

        System.out.println("Employee Salary Breakdown:");
        System.out.println("Basic: " + bas_sal);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Tax Deduction: " + tax);
        System.out.println("Net Salary: " + netSalary);
    }
}
