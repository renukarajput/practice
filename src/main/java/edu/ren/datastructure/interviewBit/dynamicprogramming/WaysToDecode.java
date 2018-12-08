package edu.ren.datastructure.interviewBit.dynamicprogramming;

import scala.Char;

import java.util.HashMap;
import java.util.Map;

public class WaysToDecode {
    int numberOfWays(String number) {
        return numberOfWays(number.toCharArray(), 0, new HashMap<>());
    }

    private int numberOfWays(char[] number, int startIndex, Map<Integer, Integer> resultMap) {
        if(Integer.valueOf(number[startIndex]+"")==0){
            return 0;
        }
        if (startIndex == number.length - 1) {
            return 1;
        }


        int withOne = 0, withTwo = 0;
        Integer key = Integer.valueOf(number[startIndex] + "");
        if (key != 0) {
            if (resultMap.containsKey(startIndex + 1)) {
                withOne = resultMap.get(startIndex + 1);
            } else if(startIndex<number.length-1){
                withOne = numberOfWays(number, startIndex + 1, resultMap);
                resultMap.put(startIndex + 1, withOne);
            }else {
                withOne=1;
            }
        }
        key = Integer.valueOf(number[startIndex] + "" + number[startIndex + 1]);
        if (10 <= key && key <= 26 && number[startIndex] != '0') {
            if (resultMap.containsKey(startIndex + 2)) {
                withTwo = resultMap.get(startIndex + 2);
            } else if(startIndex<number.length-2){
                withTwo = numberOfWays(number, startIndex + 2, resultMap);
                resultMap.put(startIndex + 2, withTwo);
            }else {
                withTwo=1;
            }

        }
        return withOne + withTwo;
    }
}
