package ex16_StringBuilder_StringBuffer;

public class Lab002_StringBuffer_Ex01 {

    public static void main(String[] args) {

        StringBuffer stringBuffer = new StringBuffer("Sandesh ");
        stringBuffer.append(" Ladka Sala");
        System.out.println(stringBuffer);

        System.out.println(stringBuffer.reverse());
    }
}
