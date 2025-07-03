package ex15_Strings;

public class Lab008_String_All_Fun_Ex03 {

    public static void main(String[] args) {

        String str = "Sandesh";

        //1. charAt
        char ch = str.charAt(3);
        System.out.println(ch);

        //2. Concate
        String str1 = str.concat(" Ladka Sala");
        System.out.println(str1);

        //3. Contains
        System.out.println(str.contains("de"));

        //4. endswith
        System.out.println(str.endsWith("e"));

        //5. equals
        System.out.println(str.equals("Sandesh"));

        // 6. equalsIgnoreCase()
        System.out.println(str.equalsIgnoreCase("sandesh"));


        // 7. indexOf() //
        System.out.println(str.indexOf('o'));

        String s1 = "madam";
        // Returns the index within this string of the
        // first occurrence of the specified substring.
        System.out.println(s1.indexOf("m"));

        System.out.println(s1.lastIndexOf("m"));


        // 8. length()
        System.out.println(str.length());

        // 9. replace( , ) // sonal
        System.out.println(str.replace('n', 'N'));

        // 9. split()

        String name4 = "pramod@live.com@123";
        String[] split_name4 = name4.split("@");
        System.out.println(split_name4[0]);
        System.out.println(split_name4[1]);
        System.out.println(split_name4[2]);



        // 10. substring( , )  , sonal
        System.out.println(str.substring(1, 3));

        // 11. toLowerCase()
        System.out.println("SONAL".toLowerCase());

        // 12. toUpperCase()
        System.out.println("sonal".toUpperCase());

        // 14. startsWith()
        System.out.println(str.startsWith("S"));

        // 15. endsWith()
        System.out.println(str.endsWith("a"));


        String anotherPalindrome = "Niagara. O roar again!";
        System.out.println(anotherPalindrome.length());

        String extract = anotherPalindrome.substring(11,15);
        System.out.println(extract);

    }


}
