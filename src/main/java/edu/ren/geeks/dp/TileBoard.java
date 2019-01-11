package edu.ren.geeks.dp;

public class TileBoard {

    int numways(int n) {
       return numways(2, n);
    }

    int numways(int row, int col) {
        if (row == 1 && col == 2) {
            return 1;
        }
        /*if ((row == 2 && col == 1) || (row == 0 && col == 2)) {
            return 1;
        }*/
        if (row < 0 || col < 0) {
            return 0;
        }
        return numways(row - 2, col) + numways(row, col - 2);
    }
}
