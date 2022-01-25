package edu.ren.misc.problems;

/**
 * Created by rrn3194 on 6/5/16.
 */
public class FilterString {
//    public static void main(String[] args) {
//        String str = "abcd $0015aa0012";
//        int index = get$IndexFromInput(str);
//        String output = String.valueOf(getDigitsFromInput(index, str));
//        ignoreInitialZeros(output);
//    }

    public static int get$IndexFromInput(String str) {
        int len = str.length();
        int index = 0;
        for (int i = 0 ; i < len ;i++){
            if (str.charAt(i) == '$'){
                index = i;
            }
        }
        return index;
    }

    public static StringBuilder getDigitsFromInput(int index, String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = index + 1; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                sb.append(str.charAt(i));
            }
        }
        return sb;
    }

    public static void ignoreInitialZeros(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) > 48 ){
                int count = i ;
                System.out.println(String.valueOf(getActualAmount(count, input)));
                break;
            }
        }
    }

    private static StringBuilder getActualAmount(int count, String input) {
        StringBuilder sb = new StringBuilder();
        for (int i = count; i < input.length(); i++) {
            sb.append(input.charAt(i));
        }
    return sb;
    }

   /* private static Character[] getCharArray(String str) {
        int len = str.length();
        Character[] array = new Character[len];
        for (int i = 0 ; i < len ;i++){
            array[i] = new Character(str.charAt(i));
        }
        return array;
    }*/
}
