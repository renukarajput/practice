package edu.ren.hackerrank.dp;

/**
 * Created by kumarrak on 14/12/18.
 */
public class TwoRobots {
    int getMinDistanceMoved(int[][] queries) {
        return getMinDistanceMoved(queries, 0, -1, -1, 0);
    }

    int getMinDistanceMoved(int[][] queries, int index, int robotOnePosition, int robotTwoPosition, int total) {
        System.out.println(index + " "+robotOnePosition+" "+robotTwoPosition+" "+total);
        if (index == queries.length) {
            return total;
        }
        final int[] query = queries[index];
        total += Math.abs(query[0] - query[1]);
        int distanceOne, distanceTwo;

        if (robotOnePosition == -1) {
            distanceOne = 0;
        } else {
            distanceOne = Math.abs(robotOnePosition - query[0]);
        }
        final int minByMovingOne = getMinDistanceMoved(queries, index + 1, query[1], robotTwoPosition, total + distanceOne);
        if (robotTwoPosition == -1) {
            distanceTwo = 0;
        } else {
            distanceTwo = Math.abs(robotTwoPosition - query[0]);
        }
        final int minByMovingTwo = getMinDistanceMoved(queries, index + 1, robotOnePosition, query[1], total + distanceTwo);
        return Math.min(minByMovingOne, minByMovingTwo);
    }
}
