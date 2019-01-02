package edu.ren.datastructure.interviewBit.string;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

//https://www.interviewbit.com/problems/reverse-the-string/
public class StringReversal {

    private static final char SPACE = ' ';

    public static String reverse1(String input) {
        StringJoiner sb = new StringJoiner(" ");

        String[] strArr = input.split(" ");

        for (int i = strArr.length - 1; i >= 0; --i) {
            if (!strArr[i].toString().trim().isEmpty())
                sb.add(strArr[i]);
        }
        return sb.toString();
    }

    public static String reverse(String input) {
        StringJoiner result = new StringJoiner(String.valueOf(SPACE));


        List<int[]> strArr = getIndexesOfWords(input, SPACE);

        for (int i = strArr.size() - 1; i >= 0; --i) {
            int[] range = strArr.get(i);
            int wordStarIndex = range[0];
            int wordEndIndex = range[1];
            StringBuilder sb = new StringBuilder();
            for (int j = wordStarIndex; j <= wordEndIndex; j++) {
                sb.append(input.charAt(j));
            }
            result.add(sb);
        }
        return result.toString();
    }


    public static List<int[]> getIndexesOfWords(String input, char delimeter) {
        List<int[]> indexArr = new ArrayList<>();
        int start = 0, end = 0;

        while (end < input.length()) {
            if (input.charAt(start) == delimeter) {
                start++;
                if (end == input.length() - 1 && input.charAt(end) != delimeter) {
                    indexArr.add(new int[]{end, end});
                }
                end++;
            } else {
                if ((input.charAt(end) == delimeter && input.charAt(end - 1) != delimeter) ||
                        (end == input.length() - 1 && input.charAt(end) != delimeter)) {
                    if (end == input.length() - 1) {
                        indexArr.add(new int[]{start, end});
                    } else {
                        indexArr.add(new int[]{start, end - 1});
                        start = end;
                    }

                }
                end++;
            }
        }
        return indexArr;
    }
}
