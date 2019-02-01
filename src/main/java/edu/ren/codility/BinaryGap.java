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
        return maximumSequenceOFZero(stringBuilder.toString().toCharArray());
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
                if (input[i] == '1')
                    count = 0;
            }
        }

        if (maxLength > count) {
            return maxLength;
        }
        return 0;
    }

    //100111001
    public int maximumSequenceOFZero(char[] input) {
        int  endOfBlock = 0, startOfBlock = -1;
        int maxCount = 0;
        while (endOfBlock < input.length) {
            if (input[endOfBlock] == '1') { //0000111100110
                if (startOfBlock != -1 && input[endOfBlock-1]=='0') {
                   int count=endOfBlock-startOfBlock-1;
                    maxCount = Math.max(count, maxCount);
                }
                startOfBlock = endOfBlock;

            }
            endOfBlock++;

        }
        return maxCount;
    }
}
//10000