package edu.leetcode.dp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DeleteZeroSubtreeNodes {

    public Map<Integer, List<Integer>> map = new HashMap<>();
    public int deleteTreeNodes(int nodes, int[] parent, int[] value) {
        for (int i = 0; i < nodes; i++) {
            map.computeIfAbsent(parent[i], k -> new ArrayList<>()).add(i);
        }
        int[] res = help(value, 0);
        return res[1];
    }

    public int[] help (int[] value, int i) {
        int tot = value[i], num = 1;
        for (int nei : map.getOrDefault(i, new ArrayList<>())) {
            int[] pre = help(value, nei);
            tot += pre[0];
            num += pre[1];
        }
        return tot == 0 ? new int[]{0, 0} : new int[]{tot, num};
    }


    public int deleteTreeNodes_(int nodes, int[] parent, int[] value) {
       Map<Integer,Integer> subTreeSum=new HashMap<>();
       Map<Integer,Integer> subTreeCount=new HashMap<>();

        for (int i = 0; i <value.length ; i++) {

            int parentValue=parent[i];
            int depth=0;
            while (parentValue!=-1){
                depth++;
                int existingSum=subTreeSum.getOrDefault(parentValue,0);
                subTreeSum.put(parentValue,existingSum+value[i]);
                Integer existingCount = subTreeCount.getOrDefault(parentValue, 0);
                subTreeCount.put(parentValue,depth+existingCount);
                parentValue=getParent(value,parent,parentValue);
            }
        }
        int total=value.length;
        for(int key:subTreeSum.keySet()){
            if(subTreeSum.get(key)==0){
                total-=subTreeCount.get(key);
            }
        }
        return total;
    }

    private int getParent(int[] value, int[] parent, int nodeValue) {
        for (int i = 0; i <value.length ; i++) {
            if(value[i]==nodeValue)
                return parent[i];
        }
        return -1;
    }
}
