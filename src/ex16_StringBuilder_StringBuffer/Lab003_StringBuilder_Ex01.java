package ex16_StringBuilder_StringBuffer;

public class Lab003_StringBuilder_Ex01 {

    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder("Adesh");
        stringBuilder.append("IT");
        stringBuilder.reverse();
        System.out.println(stringBuilder);
    }
}
