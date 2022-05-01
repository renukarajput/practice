package edu.ren.misc.problems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class NewsPaper {
    static String solve(int vertex, int edges, int []start, int []end) {
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i <start.length ; i++) {
            map.put(start[i],end[i]);
            map.put(end[i],start[i]);
        }
        for (int i = 0; i <start.length ; i++) {
            Set<Integer> visited=new HashSet<>();
            if(solve(vertex,edges,vertex,map,visited,start[i])){
                return "Yes";
            }
            if(solve(vertex,edges,start.length,map,visited,end[i])){
                return "Yes";
            }
        }
        return "No";
    }
    static boolean solve(int vertex, int edges,int size, Map<Integer,Integer> map ,Set<Integer> visited,Integer startIndex) {
        if(visited.size()==vertex){
            return true;
        }

       if(map.get(startIndex)==null){
           return false;
       }

            if(!visited.contains(startIndex)) {
                visited.add(startIndex);
                if (solve(vertex, edges,size, map, visited,map.get(startIndex))) {
                    return true;
                } else {
                    visited.remove(startIndex);
                }
            }

       return false;
    }
}
