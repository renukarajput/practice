package edu.ren.datastructure.interviewBit.dynamicprogramming;

import java.util.*;
//9, 4, 7, 2, 10
//9-4 len[1]=2 d[1]=={5}
//9-7 and 4-7  len[2]=2 d[2]={5,3}
//9-2 4-2 7-2 len[3]=2 d[3]={7,2,5}

public class LongestArithmeticProgression {
    int len(Integer[] arr) {
        return len(Arrays.asList(arr));
    }

   protected int len(List<Integer> arr) {
        int[] lenOfProgression = new int[arr.size()];
        Arrays.fill(lenOfProgression, 1);
        Map<Integer, Integer>[] differenceToLenMapAtIndex = new Map[arr.size()];
        lenOfProgression[0] = 1;

        for (int i = 1; i < arr.size(); i++) {
            for (int j = 0; j < i; j++) {
                int diff = arr.get(i) - arr.get(j);
                Map<Integer, Integer> differenceToLenMap = differenceToLenMapAtIndex[j];
                if (differenceToLenMap != null && differenceToLenMap.containsKey(diff)) {
                    Integer lenSoFar = differenceToLenMap.get(diff);
                    lenOfProgression[i] = Math.max(lenOfProgression[i], lenSoFar + 1);
                } else {
                    lenOfProgression[i] = Math.max(lenOfProgression[i], 2);
                   if( differenceToLenMapAtIndex[j]==null) {
                       differenceToLenMapAtIndex[i] = new HashMap<>();
                   }
                }
                differenceToLenMapAtIndex[i].put(diff, lenOfProgression[i]);

            }

        }

        int result = 1;
        for (int len : lenOfProgression) {
            result = Math.max(result, len);

        }
        return result;
    }
}
