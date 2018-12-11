package edu.ren.datastructure.interviewBit.dynamicprogramming;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CapDistribution {

    int uniqueWays(int[][] personCapList){
        int [] count=new int[]{0};
        uniqueWays(personCapList,0,new HashSet<>(),count);
        return count[0];
    }
    private void uniqueWays(int[][] personCapList,int personIndex,Set<Integer> visitedSet,int[] count){
      if(personIndex==personCapList.length){
          if(visitedSet.size()==personIndex){
              count[0]++;
          }
          return ;
      }
        int[] caps = personCapList[personIndex];
        for (int i = 0; i <caps.length ; i++) {
            if(visitedSet.contains(caps[i])){
                continue;
            }
            visitedSet.add(caps[i]); //mark it taken for recursive tree which finds for other persons
            uniqueWays(personCapList,personIndex+1,visitedSet,count);
            visitedSet.remove(caps[i]);  //for the next loop this person takes another cap ,mark this as free
        }
    }
}
