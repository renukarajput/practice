package edu.ren.datastructure.interviewBit.dynamicprogramming;

public class EditDistance {

    int getDistance(String first, String second) {
        return getDistance(first.toCharArray(), first.length() , second.toCharArray(), second.length() );
    }

    protected int getDistance(char[] first, int indexOne, char[] second, int indexTwo) {
        if (indexOne == 0) {
            return indexTwo;
        }
        if (indexTwo == 0) {
            return indexOne ;
        }
        int distance = getDistance(first, indexOne - 1, second, indexTwo - 1);
        if (first[indexOne-1] == second[indexTwo-1]) {
            return distance;
        }
        //delete last in 2nd OR insert at last in first to match last in 2nd
        int distanceByReductionOfSecond = 1 + getDistance(first, indexOne, second, indexTwo - 1);
        //same as above
        int distanceByReductionOfFirst = 1 + getDistance(first, indexOne - 1, second, indexTwo);
        //replace with last non matching of either to match last of both
        int distanceByReductionOfBoth = 1 + distance;
        int result = Math.min(distanceByReductionOfFirst, distanceByReductionOfSecond);
        return Math.min(result, distanceByReductionOfBoth);
    }
}
