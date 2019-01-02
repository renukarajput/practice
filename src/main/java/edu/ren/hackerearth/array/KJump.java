package edu.ren.hackerearth.array;

import java.util.Arrays;

public class KJump {

    int get(int[] arr,int k) {
        int[] jumps = new int[arr.length];
        Arrays.fill(jumps,1);
        for (int i = 1; i < arr.length; i++) {
           int maxLen=1;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[i] >= arr[j]+k) { //aj-ai>=k
                    int len = jumps[j] + 1;
                    maxLen=Math.max(len,maxLen);
                }
            }
            jumps[i]=maxLen;
        }
        return Arrays.stream(jumps).max().getAsInt();
    }
}
