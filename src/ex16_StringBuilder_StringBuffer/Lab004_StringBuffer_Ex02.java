package ex16_StringBuilder_StringBuffer;

public class Lab004_StringBuffer_Ex02 {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Java");
        sb.append(" Programming");
        System.out.println(sb);
        sb.delete(5,16); // Delete the substring
        System.out.println(sb);
        sb.replace(0, 4, "C++");
        System.out.println(sb);
    }
}
