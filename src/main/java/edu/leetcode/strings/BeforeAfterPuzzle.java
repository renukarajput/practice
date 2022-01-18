package edu.leetcode.strings;

import java.util.*;

public class BeforeAfterPuzzle {

    class Solution {
        public List<String> beforeAndAfterPuzzles(String[] phrases) {
            int n=phrases.length;
            List<String> res=new ArrayList<String>();
            if(n==0) return res;

            List<String[]> phrList=new ArrayList<String[]>();
            HashMap<String,List<Integer>> map=new HashMap<>();
            HashSet<String> set=new HashSet<>();

            //split each phrase (of index i) to String array and build HashMap with first String in the array as Key and i as value
            for(int i=0;i<n;i++){
                String str=phrases[i];
                String[] strArr=str.split(" ");
                phrList.add(strArr);
                List<Integer> indices=map.getOrDefault(strArr[0],new ArrayList<Integer>());
                indices.add(i);
                map.put(strArr[0],indices);
            }

            //build puzzles
            for(int i=0;i<n;i++){
                String first=phrases[i];
                int l=phrList.get(i).length;
                String nextWord=phrList.get(i)[l-1];
                if(!map.containsKey(nextWord)) continue;
                List<Integer> nextSteps=map.get(nextWord);
                for(int k=0;k<nextSteps.size();k++){
                    int next=nextSteps.get(k);
                    if(next==i) continue;
                    List<Integer> nextVisited=new ArrayList<Integer>();
                    StringBuilder sb=new StringBuilder();
                    sb.append(first);
                    for(int j=1;j<phrList.get(next).length;j++){
                        sb.append(" ");
                        sb.append(phrList.get(next)[j]);
                    }
                    set.add(sb.toString());
                }
            }

            res=new ArrayList<String>(set);
            Collections.sort(res);
            return res;
        }
    }
}
