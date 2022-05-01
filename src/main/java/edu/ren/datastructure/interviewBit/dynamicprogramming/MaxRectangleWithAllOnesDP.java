package edu.ren.datastructure.interviewBit.dynamicprogramming;

import java.util.List;
import java.util.Stack;

public class MaxRectangleWithAllOnesDP extends MaxRectangleWithAllOnes {
    @Override
    public int max(List<List<Integer>> grid) {

        return maxRectangle(grid.size(),grid.get(0).size(),grid);
    }

     int maxRectangle(int numRow, int numCol, List<List<Integer>> grid) {
        // Calculate area for first row and initialize it as
        // result
        int result = maxHist(numCol, grid.get(0));

        // iterate over row to find maximum rectangular area
        // considering each row as histogram
        for (int i = 1; i < numRow; i++) {
            System.out.println(stringOf(grid));
            for (int j = 0; j < numCol; j++) {
                // if A[i][j] is 1 then add A[i -1][j] to set height of bar at i,j
                if (grid.get(i).get(j) == 1) grid.get(i).set(j, 1 + grid.get(i - 1).get(j));
            }


            // Update result if area with current row (as last
            // row of rectangle) is more
            result = Math.max(result, maxHist(numCol, grid.get(i)));
        }

        return result;
    }

    int maxHist(int numColumn, List<Integer> row) {
        // Create an empty stack. The stack holds indexes of
        // hist[] array/ The bars stored in stack are always
        // in increasing order of their heights.
        Stack<Integer> result = new Stack<>();

        int top_val_Height;     // Top of stack

        int max_area = 0; // Initialize max area in current
        // row (or histogram)

        int area = 0;    // Initialize area with current top

        // Run through all bars of given histogram (or row)
        int currentColumn = 0;
        while (currentColumn < numColumn) {
            // If this bar is higher than the bar on top stack since it fits in rectangle
            // push it to stack
            if (result.empty() || row.get(result.peek()) <= row.get(currentColumn)) {
                result.push(currentColumn++);
            }

            else {
                // If this bar is lower than top of stack, then
                // calculate area of rectangle with stack top as
                // the smallest (or minimum height) bar. 'i' is
                // 'right index' for the top and element before
                // top in stack is 'left index'
                top_val_Height = row.get(result.peek());
                result.pop();
                area = top_val_Height * currentColumn;

                if (!result.empty()) {
                    int width = currentColumn - result.peek() - 1;
                    area = top_val_Height * width;
                }
                max_area = Math.max(area, max_area);
            }
        }

        // Now pop the remaining bars from stack and calculate
        // area with every popped bar as the smallest bar
        while (!result.empty()) {
            top_val_Height = row.get(result.peek());
            result.pop();
            area = top_val_Height * currentColumn;
            if (!result.empty())
                area = top_val_Height * (currentColumn - result.peek() - 1);

            max_area = Math.max(area, max_area);
        }
        return max_area;
    }
}
