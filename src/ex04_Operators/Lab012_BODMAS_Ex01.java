package ex04_Operators;

import javax.management.MBeanAttributeInfo;

public class Lab012_BODMAS_Ex01 {

    public static void main(String[] args) {
        System.out.println((9 * 3 / 9 + 1) * 3);
        // 9 * 3 - 27
        // 27/9 -> 3
        // 3+1 -> 4
        // 4 * 3 -> 12

        System.out.println((5 * 3 / 9 + 5) * 9);
        // 5 * 3 - 15
        // 15/9 -> 1
        // 1+5 -> 6
        // 6 * 9 -> 54
    }
}
