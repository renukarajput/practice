package edu.ren.misc.problems;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NumberOfCycles {
    static int number_of_cycles(List<Integer> arr) {
        Set<Integer> visited = new HashSet<>();
        int numCycle = 0;
        for (int i = 0; i < arr.size(); i++) {
           int j=arr.get(i);
           while (j<arr.size()) {
               if (visited.contains(arr.get(i))) {
                   numCycle++;
                   visited.clear();
                   break;
               }
           }

        }
        return numCycle;
    }
}
//4 3 1 2 0 0
//2

//1 0 2
//2