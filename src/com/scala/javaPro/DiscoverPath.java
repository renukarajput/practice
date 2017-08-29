package com.scala.javaPro;

/**
 * Created by rrn3194 on 6/25/17.
 */
public class DiscoverPath {
    int size;

    DiscoverPath(int size) {
        this.size = size;
    }

    public static void main(String[] args) {

        int numberOfPathsFromGivenPoint = new DiscoverPath(2).getNumberOfPathsFromGivenPoint(0, 0, 1, 1);
        System.out.println("paths =" + numberOfPathsFromGivenPoint);
        System.out.println("moves= " + new DiscoverPath(2).getNumberOfMovesInAllPathsFromGivenPoint(0, 0, 1, 1));
    }

    public int getNumberOfPathsFromGivenPoint(int xStart, int yStart, int xEnd, int yEnd) {
        Integer[] count=new Integer[]{0};
         getNumberOfPathsFromGivenPoint(xStart, yStart, xEnd, yEnd, count);
        return count[0];
    }

     void getNumberOfPathsFromGivenPoint(int xStart, int yStart, int xEnd, int yEnd, Integer[] count) {
        if (!(xStart >= 0 && xStart < size && yStart >= 0 && yStart < size)) {
            return ;
        }

        if (xStart == xEnd && yStart == yEnd) {
            count[0]++;
        }

        if (xEnd >= 0 && xEnd < size && yEnd - 1 >= 0 && yEnd - 1 < size)
            getNumberOfPathsFromGivenPoint(xStart, yStart, xEnd, yEnd - 1, count);
        if (xEnd - 1 >= 0 && xEnd - 1 < size && yEnd >= 0 && yEnd < size)
           getNumberOfPathsFromGivenPoint(xStart, yStart, xEnd - 1, yEnd, count);

    }

    private int getNumberOfMovesInAllPathsFromGivenPoint(int xStart, int yStart, int xEnd, int yEnd) {
        if (!(xEnd >= 0 && xEnd < size && yEnd >= 0 && yEnd < size)) {
            return 0;
        }
        System.out.println("x "+xEnd+" y "+yEnd);

        if (xStart == xEnd && yStart == yEnd) {
            System.out.println("reached ");
            return 0;

        }
        int count = 0;
        if (xEnd >= 0 && xEnd < size && yEnd - 1 >= 0 && yEnd - 1 < size)
            count += 1 + getNumberOfMovesInAllPathsFromGivenPoint(xStart, yStart, xEnd, yEnd - 1);
        if (xEnd - 1 >= 0 && xEnd - 1 < size && yEnd >= 0 && yEnd < size)
            count += 1 + getNumberOfMovesInAllPathsFromGivenPoint(xStart, yStart, xEnd - 1, yEnd);
        return count;
    }
}
