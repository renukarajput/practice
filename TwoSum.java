package array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TwoSum {

    //2,7,11,15 : 21
    public int[] twoNums(int[] input, int target) {
        int[] output = new int[2];
        Set<Integer> set = new HashSet<Integer>();
        for (Integer i : input) {
            set.add(i);
        }
        for (int i = 0; i < input.length; i++) {
            int diff = target - input[i];
            if (set.contains(diff)) {
                output[0] = diff;
                output[1] = input[i];
            }
        }
        return output;
    }

    public int[] indicesOfTwoNum(int[] input, int target) {
        int[] output = new int[2];
        int i = 0;
        int j = input.length-1;
        //2,7,11,15 : 21
        while (i >= 0 && j < input.length) {
            int sum = input[i] + input[j];
            if (sum == target) {
                output[0] = i;
                output[1] = j;
                break;
            }
            if (sum < target){
                i++;
            } else {
                j--;
            }
        }
        System.out.println("== "+ Arrays.toString(output));
        return output;
    }
}
