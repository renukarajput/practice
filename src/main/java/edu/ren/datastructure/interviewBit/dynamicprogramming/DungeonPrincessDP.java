package edu.ren.datastructure.interviewBit.dynamicprogramming;

import java.util.List;

public class DungeonPrincessDP extends DungeonPrincess{
    @Override
    protected int minimumInititalHealth(List<List<Integer>> grid) {
        int row=grid.size()-1;
        int col=grid.get(0).size()-1;
        int[][] minPointToCross=new int[row+1][col+1];
        if(grid.get(row).get(col)>0) {
            minPointToCross[row][col] = 1;
        }else {
            minPointToCross[row][col] = 1-grid.get(row).get(col);

        }



        for (int i = row-1; i >=0 ; i--) {
            minPointToCross[i][col]=Math.max(minPointToCross[i+1][col]-grid.get(i).get(col),1);
        }

        for (int i = col-1; i >=0 ; i--) {
            minPointToCross[row][i]=Math.max(minPointToCross[row][i+1]-grid.get(row).get(i),1);
        }

        for (int i = row-1; i >=0 ; i--) {
            for (int j = col-1; j >=0 ; j--) {
                int minPointsToNext = Math.min(minPointToCross[i + 1][j], minPointToCross[i][j + 1]);
                minPointToCross[i][j]=Math.max(minPointsToNext-grid.get(i).get(j),1);

            }

        }
        return minPointToCross[0][0];
    }
}
