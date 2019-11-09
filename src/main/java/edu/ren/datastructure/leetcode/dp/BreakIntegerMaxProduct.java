package edu.ren.datastructure.leetcode.dp;

public class BreakIntegerMaxProduct {
    int get(int num) {

        int[] parts = getNum(num);
        return getMax(parts);
    }

    int getMax(int[] parts) {
        int res=1,subres=1;
        for(int p:parts){
            int[] partNums = getNum(p);
            if(partNums[0]* partNums[1]>p)
              subres=subres*getMax(partNums);
            else
                subres=subres*p;
        }
        return subres;
    }

    int[] getNum(int num) {
        if(num==2) return new int[]{1,1};
        if(num==3) return new int[]{1,2};
        if(num==1) return new int[]{0,1};
        if(num==0) return new int[]{0,0};
        if (num % 2 == 0) {
            return new int[]{num/2,num/2};

        } else {
           return new int[]{(num-1)/2,(num+1)/2};

        }
    }
}
