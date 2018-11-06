package edu.ren.datastructure.interviewBit.string;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

/**
 * Created by kumarrak on 06/11/18.
 */
public class StringReversal {
    final char SPACE = ' ';

    String reverse(String input) {
        char[] arr = input.toCharArray();
        StringJoiner stringJoiner = new StringJoiner(String.valueOf(SPACE));
        final List<WordIndexRange> indexRanges = split(input.toCharArray());
        for (int i = indexRanges.size() - 1; i >= 0; i--) {
            final WordIndexRange wordIndexRange = indexRanges.get(i);
            int start = wordIndexRange.start;
            int end = wordIndexRange.end;
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = start; j <= end; j++) {
                stringBuilder.append(arr[j]);
            }
            stringJoiner.add(stringBuilder.toString());

        }
        return stringJoiner.toString();
    }

    class WordIndexRange {
        int start, end;

        public WordIndexRange(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    //" the end   is   world "
    private List<WordIndexRange> split(char[] input) {
        List<WordIndexRange> wordIndexRangeList = new ArrayList<>();
        int start = 0, end = 0;
        while (end < input.length) {
            if (input[start] == SPACE) {
                start++;
                end++;
            } else {
                //was not space and is space or end of string and end is not space
                if (end > 0 && input[end - 1] != SPACE && input[end] == SPACE || (input[end] != SPACE && end == input.length - 1)) {
                    if (end == input.length - 1) {
                        wordIndexRangeList.add(new WordIndexRange(start, end));
                    } else {
                        wordIndexRangeList.add(new WordIndexRange(start, end - 1));
                        start = end;
                    }
                }
                end++;
            }
        }
        return wordIndexRangeList;
    }
}
