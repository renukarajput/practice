package edu.ren.datastructure.interviewBit.array;

import java.util.ArrayList;

public class MinStepsInGrid {


    public int getMinSteps(int[]... points) {
        int distance=0;
        for (int i = 1; i <points.length ; i++) {
            distance+=getMinDistance(points[i-1],points[i]);
        }
    return distance;
    }

    /**
     * 1 2 3 4 5
     * 6 5 4 3 2
     * 9 3 5 1 4
     * 1 0 8 3 4
     * 7 5 2 9 1
     * <p>
     * (0,0)=1 (4,3)=9  xdiff=4 ydiff=3 dist =3(along diagonal)+1
     * (2,1)=3 (4,4)=1 xdiff=2 ydiff=3 (2,1)+xdiff=(4,3)  -->1 =(4,4) ,i.e xdiff+y2-(y1+xdiff)
     * (1,3)=3 (4,1)=5 xdiff=-3 ydiff=2
     *
     * @param pointA
     * @param pointB
     * @return
     */
    int getMinDistance(int[] pointA, int[] pointB) {
        int x1 = pointA[0];
        int x2 = pointB[0];
        int y1 = pointA[1];
        int y2 = pointB[1];
        return getMinDistance(x1, y1, x2, y2);
    }

    public int getMinSteps(ArrayList<Integer> xList,ArrayList<Integer> yList) {
        int distance=0;
        for (int i = 1; i <yList.size() ; i++) {
            distance+=getMinDistance(xList.get(i-1),yList.get(i-1),xList.get(i),yList.get(i));
        }
        return distance;
    }



    int getMinDistance(int x1, int y1, int x2, int y2) {
        int xDistance = x1 - x2;
        int yDistance = y1 - y2;

        if (xDistance == 0) {
            return Math.abs(yDistance);
        }
        if (yDistance == 0) {
            return Math.abs(xDistance);
        }
        int nextX, nextY, targetX, targetY;
        int diffOnDiagonal = Math.min(Math.abs(xDistance), Math.abs(yDistance));


        nextX = Math.min(x1, x2) + diffOnDiagonal;
        targetX = Math.max(x1, x2);

        nextY = Math.min(y1, y2) + diffOnDiagonal;
        targetY = Math.max(y1, y2);


        if (nextX == targetX) {
            return diffOnDiagonal+Math.abs(targetY - nextY);
        }
        if (nextY == targetY) {
            return diffOnDiagonal+ Math.abs(targetX - nextX);
        }
        return -1;
    }
}
