package edu.ren.hackerrank.dp;

/**
 * Created by kumarrak on 14/12/18.
 */
public class TwoRobots {
    int getMinDistanceMoved(int[][] queries) {
        return getMinDistanceMoved(queries, 0, -1, -1, 0);
    }

    int getMinDistanceMoved(int[][] queries, int index, int robotOnePosition, int robotTwoPosition, int total) {
       // System.out.println(index + " "+robotOnePosition+" "+robotTwoPosition+" "+total);
        if (index == queries.length) {
            return total;
        }
        final int[] sourceToDestination = queries[index];
        total += Math.abs(sourceToDestination[0] - sourceToDestination[1]);
        int extraDistanceOne, extraDistanceTwo;

        if (robotOnePosition == -1) {
            extraDistanceOne = 0;
        } else {
            extraDistanceOne = Math.abs(robotOnePosition - sourceToDestination[0]);
        }
        final int minByMovingOne = getMinDistanceMoved(queries, index + 1, sourceToDestination[1], robotTwoPosition, total + extraDistanceOne);
        if (robotTwoPosition == -1) {
            extraDistanceTwo = 0;
        } else {
            extraDistanceTwo = Math.abs(robotTwoPosition - sourceToDestination[0]);
        }
        final int minByMovingTwo = getMinDistanceMoved(queries, index + 1, robotOnePosition, sourceToDestination[1], total + extraDistanceTwo);
        return Math.min(minByMovingOne, minByMovingTwo);
    }
}
