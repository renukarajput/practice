package edu.ren.datastructure.interviewBit.backtracking;

import java.util.ArrayList;

public class Permutations {
    public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> input) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        permute(input, 0, result);
        return result;
    }


    private void permute(ArrayList<Integer> input, int size, ArrayList<ArrayList<Integer>> result) {
        if (size == input.size()) {
            ArrayList<Integer> copy = new ArrayList<>(input);
            result.add(copy);
            return;
        }
        for (int i = size; i < input.size(); i++) {
            swap(input,  i,size);
            permute(input, size +1, result);
            swap(input,  i,size);
        }
    }

    private void swap(ArrayList<Integer> input, int index1, int index2) {
        int temp = input.get(index1);
        input.set(index1, input.get(index2));
        input.set(index2, temp);
    }


}
