package gs;

import java.util.*;

public class MatrixConnection {

    static int countConnections(List<List<Integer>> matrix) {
        int row = matrix.size();
        int col = matrix.get(0).size();
        Set<int[]> connSet = new HashSet<>();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix.get(i).get(j) == 1) {
                    isValidBound(connSet, matrix, i, j, i, j + 1);
                    isValidBound(connSet, matrix, i, j, i + 1, j + 1);
                    isValidBound(connSet, matrix, i, j, i + 1, j);
                    isValidBound(connSet, matrix, i, j, i -1, j-1);
                }
            }
        }
        for (int[] a : connSet) {
            System.out.println(Arrays.toString(a));

        }
        return connSet.size();
    }


    static boolean isValidBound(Set<int[]> connection, List<List<Integer>> matrix, int si, int sj, int di, int dj) {

        if (di >= 0 && di < matrix.size() && dj >= 0 && dj < matrix.get(0).size()) {
            addConnection(connection, matrix, si, sj, di, dj);
        }
        return false;
    }

    private static void addConnection(Set<int[]> connection, List<List<Integer>> matrix, int si, int sj, int di, int dj) {
        if (matrix.get(di).get(dj) == 1) {
            connection.add(new int[]{si, sj, di, dj});
        }
    }

    public static void main(String[] args) {
        List<List<Integer>> list = asList(
                asList(1, 1, 1, 1),
                asList(0, 1, 1, 1),
                asList(0, 1, 1, 1),
                asList(0, 0, 0, 0),
                asList(1, 1, 1, 1));
        System.out.println(countConnections(list));
               /* asList(1, 0, 0, 1),
                asList(0, 1, 1, 1),
                asList(1, 0, 0, 1));*/
    }
    //[[1, 1, 1, 1], [0, 1, 1, 1], [0, 1, 1, 1], [0, 0, 0, 0], [1, 1, 1, 1]]


    public static <T> List<T> asList(T... items) {
        List<T> list = new ArrayList<T>();
        for (T item : items) {
            list.add(item);
        }

        return list;
    }
}
