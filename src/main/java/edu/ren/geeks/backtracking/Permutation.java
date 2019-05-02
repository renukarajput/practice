package edu.ren.geeks.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Permutation {

    public List<List<Integer>> permute(int[] arr){
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list, new ArrayList<>(), arr);
        return list;
    }

    private void backtrack(List<List<Integer>> list,  List<Integer> tempList, int[] arr) {
        if(tempList.size() == arr.length) {
            list.add(new ArrayList<>(tempList));
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (tempList.contains(arr [i])) continue;
                tempList.add(arr[i]);
                backtrack(list, tempList, arr);
                tempList.remove(tempList.size() - 1);
            }
        }
    }


}
