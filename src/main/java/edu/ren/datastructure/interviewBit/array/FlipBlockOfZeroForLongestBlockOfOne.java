package edu.ren.datastructure.interviewBit.array;

import java.util.ArrayList;

public class FlipBlockOfZeroForLongestBlockOfOne extends Flip{
    /**
     * flip to have longest <b>continuous </b> sequence of 1s
     * @param arr
     * @return
     */

    @Override
    int[] flip(char[] arr) {
        int countOfOneOnLeft = 0, countOfZero = 0, countOfOneOnRight = 0, maxCount = -1, currentIndex = 1;
        int startOfZero = -1, startOfZeroInMax = -1, endOfZeroInMax = -1;
        if (arr[0] == '0') {
            countOfZero = 1;
            startOfZero = 0;

        }
        //100001100111110000 here maxCount=count of zero at end + count of 1 before it
        //10000110011111  maxCount=count of zero at end + count of 1 before it and after it
        //100001100111110
        while (currentIndex < arr.length) {
            if (arr[currentIndex] == '0') {
                if (arr[currentIndex - 1] != '0' || currentIndex == arr.length - 1) { //prev is not 0,new block

                    int countOfOneAfterFlip;
                    if (currentIndex != arr.length - 1) {
                        countOfOneAfterFlip = countOfOneOnLeft + countOfZero + countOfOneOnRight;
                    } else {
                        if(arr[currentIndex-1] == '0') {
                            countOfZero++;
                        }else {

                        }
                        countOfOneAfterFlip = countOfOneOnLeft + countOfZero;
                    }
                    if (maxCount < countOfOneAfterFlip) {
                        maxCount = countOfOneAfterFlip;
                        startOfZeroInMax = startOfZero;
                        endOfZeroInMax = startOfZero + countOfZero - 1;
                    }
                    countOfOneOnLeft = countOfOneOnRight;
                    countOfOneOnRight = 0;
                    startOfZero = currentIndex;
                    countOfZero = 1;
                } else {
                    countOfZero++;
                }

            } else { //it is a 1    like 10000110011111   0001110000
                countOfOneOnRight++;
                if (arr[currentIndex - 1] != '1' || currentIndex == arr.length - 1) { // prev is not 1,new block
                    if (currentIndex == arr.length - 1) {
                        if (maxCount < countOfOneOnLeft + countOfZero + countOfOneOnRight) {
                            maxCount = countOfOneOnLeft + countOfZero + countOfOneOnRight;
                            startOfZeroInMax = startOfZero;
                            endOfZeroInMax = startOfZero + countOfZero - 1;
                        }
                    }

                }
            }
            currentIndex++;
        }
       // System.out.println("max=" + maxCount);
        return new int[]{startOfZeroInMax, endOfZeroInMax};
    }

    /**
     * 0,0,0,1,1,0,0,0,0,1,1,1
     *
     * @param arr
     * @return
     */
    int[] flipZerosForMaxInPair(int[] arr) {
        int startOfZero = -1, startOfZeroInMax = -1, endOfZeroInMax = -1, currentCount = 0, maxCount = -1;
        int countOfZero = 0, countOfOne = 0;

        if (arr[0] == 0) {
            countOfZero = 1;
            startOfZero = 0;
        }
        int currentIndex = 1;
        while (currentIndex < arr.length) {
            if (arr[currentIndex] == 0) {
                countOfZero++;

                if (!(arr[currentIndex - 1] == 0 && currentIndex < arr.length - 1) || currentIndex == arr.length - 1) {
                    //previous is 1

                    currentCount = countOfOne + countOfZero;
                    if (currentCount > maxCount) {
                        maxCount = currentCount;
                        startOfZeroInMax = startOfZero;
                        endOfZeroInMax = startOfZeroInMax + countOfZero - 1;
                    }

                    startOfZero = currentIndex;

                    countOfZero = 1;
                }

            } else { //it is a 1
                countOfOne++;

                if (!(arr[currentIndex - 1] == 1 && currentCount < arr.length - 1) || currentIndex == arr.length - 1) {
                    //1 after 0

                    currentCount = countOfOne + countOfZero;
                    if (currentCount > maxCount) {
                        maxCount = currentCount;
                        startOfZeroInMax = startOfZero;
                        endOfZeroInMax = startOfZero + countOfZero - 1;
                    }

                    countOfOne = 1;

                }
            }
            currentIndex++;
        }
        System.out.println("max =" + maxCount);

        return new int[]{startOfZeroInMax, endOfZeroInMax};
    }
}
