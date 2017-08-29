package com.scala.javaPro;

import java.util.Comparator;

/**
 * Created by rrn3194 on 4/24/16.
 */
public class RowComparator implements Comparator<int[]>{

    @Override
    public int compare(int[] rowOne, int[] rowTwo) {
        if (rowOne != null && rowTwo != null) {
            if (rowOne.length != rowTwo.length) {
                throw new RuntimeException();
            }
            int index = 0;
            while (index < rowOne.length) {
                int diff = rowOne[index] - rowTwo[index];
                if (diff != 0)
                    return diff;
            }
        }
        return 0;
        }
}
