package edu.leetcode.array;


import java.util.*;

public class SkillSet {
    public int solution(int[] T, int[] A) {
        Map<Integer, LinkedList<Integer>> dependencyTree = new HashMap<>();
        for (int i = 0; i < T.length; i++) {
            dependencyTree.putIfAbsent(i, new LinkedList<>());
            dependencyTree.get(i).add(T[i]);
        }
        Set<Integer> requiredSkills = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            addDependency(A[i],requiredSkills,dependencyTree);
        }
        return requiredSkills.size();
    }

    void addDependency(int i, Set<Integer> requiredSkills,Map<Integer, LinkedList<Integer>> dependencyTree){
  if(requiredSkills.contains(i))
      return;
            if (dependencyTree.containsKey(i)) {
                LinkedList<Integer> deps = dependencyTree.get(i);
                for (int d:
                     deps) {
                    requiredSkills.add(d);
                    addDependency(d,requiredSkills,dependencyTree);
                }
            }
    }
}
