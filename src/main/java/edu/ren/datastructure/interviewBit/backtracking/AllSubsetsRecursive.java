package edu.ren.datastructure.interviewBit.backtracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AllSubsetsRecursive extends AllSubsets {

    @Override
    List<List<Integer>> subsets(List<Integer> arr) {
        Collections.sort(arr);
        int resultSize= (int) Math.pow(2,arr.size());
        List<List<Integer>> result=new ArrayList<>(resultSize);
        generate(arr,-1,new ArrayList<>(),result);
        return result;
    }

    void generate(List<Integer> str, int index, List<Integer> subset, List<List<Integer>> result) {
        if(index>=str.size()){
            return;
        }
        result.add(new ArrayList<>(subset));
        for (int i = index + 1; i < str.size(); i++) {
            subset.add(str.get(i));
            generate(str, i, subset, result);
            subset.remove(subset.size()-1);
        }
    }
}
