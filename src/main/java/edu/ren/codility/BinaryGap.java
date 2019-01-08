package edu.ren.codility;

import java.util.Arrays;

public class BinaryGap {

    public int maximumSequenceOFZero(int num) {
        String input = Integer.toBinaryString(num);
        return maximumSequenceOFZero(input.toCharArray());
    }

    public int maximumSequenceOFZero(int[] input) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i : input) {
            stringBuilder.append(i);
        }
        return maximumSequenceOFZero_(stringBuilder.toString().toCharArray());
    }

    //10010
    public int maximumSequenceOFZero_(char[] input) {
        System.out.println("******** " + Arrays.toString(input));
        int startValue = input[0], count = 0, maxLength = 0;
        for (int i = 1; i < input.length; i++) {
            if (startValue != input[i] && startValue == '1') {
                count++;
            } else {
                if (maxLength < count)
                    maxLength = count;
                startValue = input[i];
                if (input[i]=='1')
                    count = 0;
            }
        }

        if (maxLength > count) {
            return maxLength;
        }
        return 0;
    }

    //10010
    public int maximumSequenceOFZero(char[] input) {
        int first = 0, second = 1;
        int count = 0;
        int maxCount = 0;
        if (first > 0 && input[first] == '0' && input[first - 1] == '1') { //0000111100110
            count = 1;
        } else if (input[second] == '0' && input[second - 1] == '0') {
            count++;
        }
        if (input[second] == '1' && input[second - 1] == '0') {
            maxCount = Math.max(count, maxCount);
        }
        return maxCount;
    }
}
//10000