package scala.javaPro;

import java.util.*;

public class Islands {
    public static void main(String[] args) {
        int arr[][] = {   {1, 1, 0, 0, 0},
                          {0, 1, 0, 0, 1},
                          {1, 0, 0, 1, 1},
                          {0, 0, 0, 0, 0},
                          {1, 0, 1, 0, 1}
        };
//        int arr[][] = { {1,1,0},
//                        {1,0,0},
//                        {0,0,1}
//        };
        findNumberOfIslands(arr);
    }

    private static void findNumberOfIslands(int[][] arr) {
        Map<Integer,Integer> matrixIndexToRegionIndexMap = new HashMap<>();
        Map<Integer,Integer> regionIndexToCountMap = new HashMap<>();
       int key = 0;
        int row = arr.length;
        int col = arr[0].length;

        boolean visited[][] = new boolean[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] == 1 && !visited[i][j] ) {
                    if (isConnected(i, j, arr)) {
                        int regionIndex = getNeighbourRegion(arr,i,j);
                        key = i * col + j;
                        matrixIndexToRegionIndexMap.put(key,regionIndex);
                        visited[i][j] = true;
                        Integer count = regionIndexToCountMap.get(regionIndex);
                        regionIndexToCountMap.put(regionIndex,count+1);

                    }
                    else{
                       int discoveredRegionIndex=regionIndexToCountMap.keySet().size()+1;
                        key = i * col + j;
                        matrixIndexToRegionIndexMap.put(key,discoveredRegionIndex);
                        regionIndexToCountMap.put(discoveredRegionIndex,1);
                        visited[i][j] = true;
                    }
                }

            }
        }
    }

    //i--j
    private static int getNeighbourRegion(int[][] arr, int i, int j) {
    // i-1, j-1
        return 0;
    }

    private static boolean isConnected(int i, int j, int[][] arr) {
        if (j > 0 && arr[i][j-1] == 1){  //left
            return true;//map.get(key) key=i*row+j-1
        }
        if(i > 0 && arr[i-1][j] == 1){ //up
            return true;
        }
        if (i > 0 && j > 0 && arr[i-1][j-1] == 1){ //left diagonal
            //if not null return regionIndex
            return true;
        }
        if (i > 0 && j > 0 && arr[i-1][j+1] == 1){ //right diagonal
            return true;
        }
        return false;
    }
}
