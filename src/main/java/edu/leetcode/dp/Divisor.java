package edu.leetcode.dp;

public class Divisor {
    public static void main(String[] args) {
        System.out.println(new Solution().divisorGame(3,true));
        System.out.println(new DPSolution().divisorGame(3,true));
    }
}

class Solution {
    public boolean divisorGame(int N,boolean isMyTurn) {

        if(N<=1) return !isMyTurn;

        for (int i=1;i<N;i++){
            if(N%i!=0) continue;
            if(divisorGame(N-i,!isMyTurn))
                return true;
        }
        return false;
    }
}

class DPSolution {
    public boolean divisorGame(int N,boolean isMyTurn) {
        boolean[] results=new boolean[N];
        results[0]=true;
        for (int i = 1; i <N ; i++) {
            for (int j = 1; j <i ; j++) {
                if(i%j==0 && results[i-j]==true)
                    results[i]=true;
            }

        }
       return results[N-1];
    }
}