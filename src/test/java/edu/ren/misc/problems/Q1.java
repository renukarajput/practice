package edu.ren.misc.problems;

import java.util.Scanner;

public class Q1 {
    int f(int x,int y){
        int start=x;
       return y/x;
    }

    public static void main(String[] args) {
        int r=f2(178,62);
        System.out.println(r);
    }


   static int f2(int n,int m){
       if(getNumDigits(n+m)==getNumDigits(n)){
            return n+m;
        }
       return n;
    }
    static int getNumDigits(int num){
        int r=1;
        while (num>10){
            num=num/10;
            r++;
        }
        return r;
    }
}
