package edu.ren.datastructure.interviewBit.backtracking;

import java.util.ArrayList;
import java.util.List;

public class KthPermutation extends Permutations {
    String get(int n, int k) {
        ArrayList<Integer> input = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            input.add(i);
        }
        System.out.println(input);
        while (k>1){
            nextPermutation(input);
            System.out.println(input);
            k--;
        }
       // permute(input, 0, new int[]{k}, res);
        StringBuilder stringBuilder = new StringBuilder();
        input.forEach(x -> stringBuilder.append(x));
        return stringBuilder.toString();
    }
    private void nextPermutation(ArrayList<Integer> input) {
        int firstInBlock = getLastIndex(input);
        if(firstInBlock==0){
            return;
        }
        int swapElement=firstInBlock-1;
        int greaterThanSwap=input.size()-1;
        while (input.get(greaterThanSwap)<input.get(swapElement)){
            greaterThanSwap--;
        }
        swap(input,greaterThanSwap,swapElement);

        //reverse firstBlock to greaterThanSwap
        reverse(input, firstInBlock, input.size()-1);
    }

    private void reverse(ArrayList<Integer> input, int start, int end) {
        while (start<end){
            int temp=input.get(start);
            input.set(start,input.get(end));
            input.set(end,temp);
            start++;
            end--;
        }
    }

    private int getLastIndex(ArrayList<Integer> input) {
        int lastIndex = input.size() - 1;
        while (lastIndex > 0 && input.get(lastIndex) < input.get(lastIndex - 1)) {
            lastIndex--;
        }
        return lastIndex;
    }

    private boolean permute(ArrayList<Integer> input, int startIndex, int[] k, ArrayList<Integer> res) {

        if (startIndex == input.size()) {
            System.out.print(input);
            System.out.println("  k= " + k[0]);
            k[0]--;
        }

        if (k[0] == 0) {
            res.addAll(new ArrayList<>(input));
            return true;
        }

        for (int i = startIndex; i < input.size(); i++) {

            swap(input, i, startIndex);
            if (permute(input, startIndex + 1, k, res)) {
                break;
            }

            swap(input, i, startIndex);
        }
        return k[0] == 0;

    }
}
