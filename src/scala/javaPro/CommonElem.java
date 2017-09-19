package scala.javaPro;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by rrn3194 on 5/16/16.
 */
public class CommonElem {
    public static void main(String[] args) {
        int [][]matrix = {
                {1, 2, 6, 4, 8},
                {1, 8, 4, 2, 9},
                {8, 7, 0, 3, 1},
                {8, 1, 2, 7, 9},
        };
        //Set resultSet = findCommonElements(matrix);
        Integer[] commonElements = new CommonElem().getCommonElements(matrix);
        System.out.println( Arrays.toString(commonElements));
       // System.out.println(resultSet);

    }

    Integer[] getCommonElements(int[][] matrix) {

        Set<Integer> prevOverlapSet = new HashSet<>();
        Set<Integer> overlapSet = new HashSet<>();
        final int ROWS = matrix.length;
        final int COLS = matrix[0].length;

        for (int i = 0; i <COLS ; i++)
            prevOverlapSet.add(matrix[0][i]);

        for (int i = 1; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                if (prevOverlapSet.contains(matrix[i][j])) {
                    overlapSet.add(matrix[i][j]);
                }
            }
            prevOverlapSet.clear();
            prevOverlapSet.addAll(overlapSet);
            overlapSet.clear();
        }
        return prevOverlapSet.toArray(new Integer[matrix.length] );
    }

    private static Set findCommonElements(int[][] arr) {
        Set resultSet = new HashSet();
        int m  = arr.length;
        int n = arr[0].length;

        int elm1 = arr[0][0];
        int elm2 = arr[0][4];

        for (int i = 0; i < m; i++ ){
            for (int j = 0; j< n; j++){
                if (arr[i][j] == elm1 || arr[i][j] == elm2) {
                    resultSet.add(arr[i][j]);
                }

            }
        }
        return resultSet;
    }
}
