package edu.leetcode.array;

public class MinSwapsContiniousOnes {
    public int minSwaps(int[] data) {
        int totalOneCount=0,totalZeroCount=0;
        int[] oneCounts=new int[data.length];
        for (int i = 0; i <data.length ; i++) {
            if(data[i]==0){
                totalZeroCount++;
            }else {
                totalOneCount++;
            }
            oneCounts[i]=totalOneCount;
        }
        int minSwaps=totalZeroCount;
        for(int i=0;i<data.length;i++)
            for(int j=i;j<data.length;j++){
                int ones=i>0?oneCounts[i-1]:0;
                int zeroes=i>0?i-oneCounts[i-1]:0;
                if(j+1-ones-zeroes==totalOneCount){
                    minSwaps=Math.min(minSwaps,j+1-oneCounts[j]-zeroes);
                }
            }
        return minSwaps;
    }
}

