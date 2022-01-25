package edu.ren.datastructure.interviewBit.greedy;

public class Seats {
    int minMoves(String seats) {
       int result=Integer.MAX_VALUE;
        for (int i = 0; i < seats.length(); i++) {
            result=Math.min(result,shift(seats.toCharArray(), i));

        }
        return result;
    }

    // . . . . x . . x x . . . x . .
    //4 1x 2 2x 3 1x 2
    int shift(char[] seats, int moveToIndex) {
        int count = 0;
        int firstFreeIndex = 0;
        int lastFreeIndex = moveToIndex;

        while (firstFreeIndex < lastFreeIndex) {
            if(seats[firstFreeIndex]=='x' && seats[lastFreeIndex]=='.'){
                // System.out.println(seats[firstFreeIndex]+" - "+seats[lastFreeIndex]);
                seats[lastFreeIndex] = seats[firstFreeIndex];
                seats[firstFreeIndex] = '.';
                count += lastFreeIndex-firstFreeIndex;
                firstFreeIndex++;
                lastFreeIndex--;
            }
            else if (seats[firstFreeIndex] == '.') {
                firstFreeIndex++;
            }
            else if (seats[lastFreeIndex] == 'x') {
                lastFreeIndex--;
            }
        }
        int lastFreeIndexOnRight = seats.length - 1;
        int firstFreeIndexOnRight = moveToIndex;
        while (lastFreeIndexOnRight > firstFreeIndexOnRight) {

            if(seats[lastFreeIndexOnRight]=='x' && seats[firstFreeIndexOnRight]=='.'){
                seats[firstFreeIndexOnRight] = seats[lastFreeIndexOnRight];
                seats[lastFreeIndexOnRight] = '.';
                count += lastFreeIndexOnRight-firstFreeIndexOnRight;
                lastFreeIndexOnRight--;
                firstFreeIndexOnRight++;
            }
           else if (seats[lastFreeIndexOnRight] == '.') {
                lastFreeIndexOnRight--;
            }
            else if (seats[firstFreeIndexOnRight] == 'x') {
                firstFreeIndexOnRight++;
            }
        }
        return count;
    }

}
