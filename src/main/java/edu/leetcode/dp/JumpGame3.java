package edu.leetcode.dp;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class JumpGame3 {
    public boolean canReach(int[] arr, int start) {
        Queue<Integer> queue=new LinkedList<>();
        Set<Integer> visited=new HashSet<>();
        queue.add(0);
        while(!queue.isEmpty()){
            int position=queue.remove();
            if(arr[position]==0){
                return true;
            }

            if(position+arr[position]<arr.length && !visited.contains(position+arr[position])) {
                queue.add(position + arr[position]);
                visited.add(position + arr[position]);
            }

            if(position-arr[position]>=0 && !visited.contains(position-arr[position])) {
                queue.add(position - arr[position]);
                visited.add(position - arr[position]);
            }
        }
        return false;
    }
}
