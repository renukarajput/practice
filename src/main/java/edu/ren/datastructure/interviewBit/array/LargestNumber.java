package edu.ren.datastructure.interviewBit.array;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LargestNumber {


    String sortForLargest(List<Integer> arr) {
        Comparator<Integer> comparator = (x, y) -> Long.compare(compute(x,y),compute(y,x));

        Collections.sort(arr, comparator.reversed());
        StringBuilder stringBuilder = new StringBuilder();
        boolean removeZero = true;
        int count = 0;
        for (int num : arr) {
            count++;
            char[] charsNum = String.valueOf(num).toCharArray();
            if (removeZero) {
                for (char ch : charsNum) {
                    if (count != arr.size() && ch == '0' && removeZero) {
                        continue;
                    }
                        stringBuilder.append(ch);
                        removeZero = false;

                }
            } else {
                stringBuilder.append(num);
            }
        }

        return stringBuilder.toString();
    }


    long compute(int a, int b) {
        return (a *(long)Math.pow(10,numberOfDigits(b,10)))+b;
    }

    int numberOfDigits(int num,int base) {
        int count = 1;
        while (num / base > 0) {
            count++;
            num = num / base;
        }
        return count;
    }
}
