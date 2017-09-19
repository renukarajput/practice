package scala.javaPro;

public class ToLowerCase {
    public static void main(String[] args) {
        String str = "renuka";
        toUpperCase(str);
    }

    public static void toUpperCase(String a) {
            char aChar = a.charAt(0);
            if (aChar >= 92 && aChar<=122) {
                aChar = (char)( (aChar - 32) );

            }
        System.out.print(aChar);
        for (int i = 1; i< a.length(); i++)
            System.out.print(a.charAt(i));
    }
}
