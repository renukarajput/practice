package edu.ren.geeks.string;


import java.util.ArrayList;
import java.util.List;

public class StringCompressor {
    public static void getCompressed(char[] input) {  //a4aabbcc
        int length = input.length - 1;
        int writeAt = 1;
        int count = 1;
        for (int i = 0; i <= length; i++) {
            if (i == length || !(input[i] == input[i + 1])) {
                input[writeAt] = (char) (count + 48);
                writeAt = writeAt + 2;
                count = 1;
            } else {
                count++;
            }
        }
    }


    public static String compressString(String input) {
        int length = input.length() - 1;
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 0; i <= length; i++) {
            if (i == length || (input.charAt(i) != input.charAt(i + 1))) {
                sb.append(input.charAt(i)).append(count);
                count = 1;
            } else {
                count++;
            }
        }
        return sb.toString();
    }

    public static int getCompressedArray(char[] input) {
        int length = input.length - 1;
        int count = 1;
        int writePosition = 0;
        for (int readPosition = 0; readPosition <= length; readPosition++) {
            if (readPosition == length || !(input[readPosition] == input[readPosition + 1])) {
                input[writePosition++] = input[readPosition];
//               List<Integer> digits = getDigitArrayForInt(count);
                char[] digits = String.valueOf(count).toCharArray();
                if (count > 9) {
                    for (int j = 0; j < digits.length; j++) {
                        input[writePosition++] = Character.forDigit(Character.getNumericValue(digits[j]), 10);
                    }
                } else {
                    input[writePosition++] = Character.forDigit(count, 10);
                }
                count = 1;
            } else {
                count++;
            }
        }
        return writePosition;
    }

    static List<Integer> getDigitArrayForInt(int number) { //6532
        List<Integer> list = new ArrayList<>();
        // Integer[] integers = list.toArray(new Integer[list.size()]);
        while (number > 0) {
            list.add(0, number % 10);
            number = number / 10;
        }
        return list;
    }
}

