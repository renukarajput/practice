package edu.leetcode.misc;

public class RemoveKdigits {
    public String removeKdigits(String num, int k) {
        return Integer.toString(removeKdigits(num.toCharArray(), 0, k));
    }

    public int removeKdigits(char[] num, int start, int k) {
        if (num.length - start < k) {
            return Integer.MAX_VALUE;
        }
        if (k == 0) {
            int sum = 0, current = 1;
            for (int i = start; i < num.length; i++) {
                sum = current * sum + Character.getNumericValue(num[i]);
                current *= 10;
            }
            return sum;
        }
        if(Character.getNumericValue(num[start])==0){
            return removeKdigits(num,start+1,k);
        }
        int inc = Integer.MAX_VALUE;
        if (num.length - start - 1 - k >= 0) {
            int firstValue = Character.getNumericValue(num[start]) * (int) Math.pow(10, num.length - start - 1 - k);
            inc = removeKdigits(num, start + 1, k ) + firstValue;
        }
        int exc = removeKdigits(num, start + 1, k-1);
        return Math.min(inc, exc);
    }
}
