package edu.ren.geeks.dp;

public class KnapSack {
    int getMaxValue(int[] weights, int[] values, int capacity) {
        return getMaxValue(weights, values, capacity, 0);
    }

    private int getMaxValue(int[] weights, int[] values, final int capacity, int index) {
        if (index == values.length) {
            return 0;
        }

        final int valueByPicking = weights[index] <= capacity ? values[index] +
                getMaxValue(weights, values, capacity - weights[index], index + 1) : 0;
        final int valueByNotPicking = getMaxValue(weights, values, capacity, index + 1);
        return Math.max(valueByPicking, valueByNotPicking);
    }
}
