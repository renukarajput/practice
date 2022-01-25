package edu.leetcode.misc;

public class NumberOfLasersInBank {
    public int numberOfBeams(String[] bank) {
        int sum=0;
        int prevCount=0;
        for(String row:bank){
            int rowCount=0;
            for(int i=0;i<row.length();i++) {
                if (row.charAt(i) == '1') {
                    rowCount++;
                }
            }
                if(rowCount!=0){
                    sum+=prevCount*rowCount;
                    prevCount=rowCount;
                }

        }
        return sum;
    }
}
