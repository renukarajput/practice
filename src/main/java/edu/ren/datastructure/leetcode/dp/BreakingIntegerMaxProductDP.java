package edu.ren.datastructure.leetcode.dp;

public class BreakingIntegerMaxProductDP extends BreakIntegerMaxProduct {
    @Override
    public int integerBreak(int num){
        int[] cache=new int[num+1];
        cache[1]=1;
        for (int i = 2; i <=num ; i++) {
            int product=Integer.MIN_VALUE;
            for (int j = 1; j <= i/2; j++) {
               int temp_product = Math.max(j,cache[j])*Math.max(i-j,cache[i - j]);
               product=Math.max(product,temp_product);
            }
            cache[i]=Math.max(cache[i],product);
        }
        return cache[num];
    }
}
