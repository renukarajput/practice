package edu.leetcode.dp;

import java.util.HashMap;
import java.util.Map;

public class FourKeysKeyboard {
    Map<Integer,Integer> cache=new HashMap<>();
    public int maxA(int N) {
        cache.clear();
        return maxLengthFrom(0, N, 0);
    }

    int maxLengthFrom(int currentLength, int remainingLength, int currentBufferLength) {
       int key=currentBufferLength*10000+remainingLength*100+currentBufferLength;
       if(cache.containsKey(key))
           return cache.get(key);
            if (remainingLength == 0)
            return currentLength;
        if (remainingLength < 0)
            return 0;
        int maxLength = Math.max(maxLengthFrom(currentLength + 1, remainingLength - 1, currentBufferLength),
                Math.max(maxLengthFrom(2 * currentLength, remainingLength - 3, currentLength),
                        maxLengthFrom(currentLength + currentBufferLength, remainingLength - 1, currentBufferLength)));
        cache.put(key,maxLength);
        return maxLength;
    }
}

