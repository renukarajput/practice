package edu.leetcode.dp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CountCornerRectangles {

    public int countCornerRectangles(int[][] grid) {
        int count = 0, n = grid.length, m = grid[0].length;
        for (int i=0;i<n;i++)
            for (int j=0;j<m;j++) {
                if (grid[i][j] == 0) continue;
                for (int k=i+1;k<n;k++) {
                    if (grid[k][j] == 0) continue;
                    for (int l=j+1;l<m;l++)
                        if (grid[k][l] == 1 && grid[i][l] == 1) count++;
                }
            }
        return count;
    }

    public int countCornerRectangles1(int[][] grid) {
        int res = 0;
        int m = grid.length, n = grid[0].length;
        for(int i = 0; i< m; i++){
            for(int j = i+1; j< m; j++){
                int count = 0;
                for(int c = 0; c< n; c++){
                    if(grid[i][c] + grid[j][c] == 2) count ++;
                }
                res += count*(count-1)/2;
            }
        }
        return res;
    }

    public int countCornerRectangles3(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        List<Set<Integer>> sets = new ArrayList<>(m);

        //for each row, collect column numbers with one
        for (int[] row : grid){
            Set<Integer> cur = new HashSet<>();
            for (int i = 0; i < n; i++){
                if (row[i] == 1) cur.add(i);
            }
            sets.add(cur);
        }
        int sum = 0;
        //row by row intersection, for each intersection, calculate how many pairs can be formed
        for (int i = 0; i < m; i++){
            for (int j = i + 1; j < m; j++){
                Set<Integer> cur = new HashSet<Integer>(sets.get(i));
                cur.retainAll(sets.get(j));
                int s = cur.size();
                sum += s * (s - 1) / 2; //total number of distinct pairs that can be formed with s numbers
            }
        }
        return sum;
    }
}
