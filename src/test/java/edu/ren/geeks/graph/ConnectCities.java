package edu.ren.geeks.graph;

import java.util.HashSet;
import java.util.Set;

public class ConnectCities {
    int getMinCost(int[][] paths) {
        int minCost = Integer.MAX_VALUE;
        for (int i = 0; i < paths.length; i++) {
            Set<Integer> visited = new HashSet<>();
            visited.add(i);
            int cost = getMinCost(paths,0, i, i, visited);
            minCost=Math.min(cost,minCost);
            visited.remove(i);
        }
        return minCost;
    }

    private int getMinCost(int[][] paths, int sum,final int startPosition, int currentPosition, Set<Integer> visited) {
        if (visited.size() == paths.length ) {
         if( currentPosition == startPosition)
            return sum;
         return Integer.MAX_VALUE;
        }

        int minCost = Integer.MAX_VALUE;
        for (int i = 0; i < paths.length; i++) {
            if ((i != startPosition && visited.contains(i)) || i == currentPosition || paths[currentPosition][i] == 0)
                continue;
            visited.add(i);
            final int cost =  getMinCost(paths,paths[currentPosition][i]+sum, startPosition, i, visited);
            minCost = Math.min(cost, minCost);
            visited.remove(i);
        }
        return minCost;
    }
}
