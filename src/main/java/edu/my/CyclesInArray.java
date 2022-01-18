package edu.my;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CyclesInArray {
    List<Set<Integer>> count(int[] arr) {
        int cycle = 0;
        Set<Integer> cyclicNodes = new HashSet<>();
        List<Set<Integer>> cycles=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(cyclicNodes.contains(arr[i]))
                continue;
            Set<Integer> visited = new HashSet<>();
            visited.add(i);
            int nextIndex = arr[i];
            while (nextIndex < arr.length) {
                if(nextIndex == arr[nextIndex])
                    break;
                if (visited.contains(nextIndex)) {
                    cyclicNodes.addAll(visited);
                    cycles.add(visited);
                    break;
                }
                visited.add(nextIndex);
                nextIndex = arr[nextIndex];
            }
        }
        return cycles;
    }
}
