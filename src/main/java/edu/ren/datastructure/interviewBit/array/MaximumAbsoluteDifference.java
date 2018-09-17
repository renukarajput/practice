package edu.ren.datastructure.interviewBit.array;

import java.util.List;

public class MaximumAbsoluteDifference {
    /**
     * if new number of right is a min ,pair with prevMax
     * if new number on right is a max ,pair with prevMin
     * diff is max of diff between max-min and above two
     *
     * @param arr
     * @return
     */
    int maxDiff(List<Integer> arr) {
        int first = arr.get(0);
        int maxDiff = 0, max, min, pseudoMax, psuedoMin;
        max = min = pseudoMax = psuedoMin = first;
        int indexOfMax, indexOfMin, indexOfPsuedoMax, indexOfPsuedoMin;
        indexOfMax = indexOfMin = indexOfPsuedoMin = indexOfPsuedoMax = 0;
        int diff = 0;
        for (int i = 0; i < arr.size(); i++) {
            int num = arr.get(i);
            if (num >= max) {
                max = num;
                indexOfMax = i;
                diff = max - min + Math.abs(indexOfMax - indexOfMin);
                if (pseudoMax + i - indexOfPsuedoMax < max) {
                    pseudoMax = max;
                    indexOfPsuedoMax = indexOfMax;
                } else {
                    max = pseudoMax;
                    indexOfMax=indexOfPsuedoMax;
                    int newDiff = max - min + Math.abs(indexOfMax - indexOfMin);
                    diff = Math.max(diff, newDiff);
                }

            } else if (num <= min) {
                min = num;
                indexOfMin = i;
                diff = max - min + Math.abs(indexOfMax - indexOfMin);
                if (psuedoMin - (indexOfMin - indexOfPsuedoMin) > min) {
                    psuedoMin = min;
                    indexOfPsuedoMin = indexOfMin;
                } else {
                    min = psuedoMin;
                    indexOfMin=indexOfPsuedoMin;
                    int newDiff = max - min + Math.abs(indexOfMax - indexOfMin);
                    diff = Math.max(diff, newDiff);
                }

            }else {
                int newDiffAsMax = num - min + Math.abs(i - indexOfMin);
                int newDiffAsMin=max-num+Math.abs(indexOfMax-i);
                diff = Math.max(diff, newDiffAsMax);
                diff=Math.max(diff,newDiffAsMin);

            }
            maxDiff = Math.max(diff, maxDiff);

        }
        return maxDiff;
    }
}
