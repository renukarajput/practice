package edu.leetcode.backtracking;

import java.util.HashSet;
import java.util.Set;

public class AssignBikesToWorkers {


    public int assignBikes(int[][] workers, int[][] bikes){
        int[] minCost=new int[]{Integer.MAX_VALUE};
        assignBikes(workers,bikes,0,new HashSet<>(),new HashSet<>(),0,minCost);
        return minCost[0];
    }

     void assignBikes(int[][] workers, int[][] bikes, int startIndex,Set<Integer> assignedWorkers, Set<Integer> inUseBikes,int sum,int[] minCost) {

        if(startIndex>=workers.length) {
               minCost[0]=Math.min(minCost[0],sum);
            return;
        }
        for (int i = startIndex; i <workers.length ; i++) {
            if(assignedWorkers.contains(i))
                continue;
            assignedWorkers.add(i);
            for (int j = 0; j <bikes.length ; j++) {
                //assign bike[j] to worker[i]
                if(inUseBikes.contains(j)){
                    continue;
                }
                inUseBikes.add(j);
                int distance = Math.abs(workers[i][0] - bikes[j][0]) + Math.abs(workers[i][1] - bikes[j][1]);
                if(distance>=minCost[0]){
                    continue;
                }
                //System.out.println("startIndex: "+startIndex+" i: "+i+" j: "+j+" dist: "+distance +" sum : "+ sum+" inuse: "+inUseBikes.size());
                assignBikes(workers,bikes,startIndex+1,assignedWorkers,inUseBikes,sum+distance,minCost);
                inUseBikes.remove(j);
                //System.out.println("->startIndex: "+startIndex+" i: "+i+" j: "+j+" dist: "+distance +" sum : "+ sum+" inuse: "+inUseBikes.size());

            }
            assignedWorkers.remove(i);
        }
    }
}
