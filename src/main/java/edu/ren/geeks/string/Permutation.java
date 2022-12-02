package edu.ren.geeks.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutation {
    List<String> result = new ArrayList();

    public List<String> generatePermutation(String input) {
        backtrack(input.toCharArray(), 0);
        if (result.isEmpty()) {
            return Arrays.asList(input);
        }
        return result;
    }

    void backtrack(char[] input, int index) {
        if (index >= input.length) {
            result.add(String.valueOf(input));
            return;
        }
        for (int j = index; j < input.length; j++) {
            boolean check = shouldSwap(input, index, j);
            if (check) {
                swap(input, index, j);
                backtrack(input, index + 1);
                swap(input, index, j);
            }
        }
    }

    boolean shouldSwap(char str[], int start, int curr) {
        if (str[start] == str[curr]) {
            return false;
        }
        return true;
    }

    void swap(char[] input, int i, int j) {
        char temp = input[i];
        input[i] = input[j];
        input[j] = temp;
    }
}

class PermuteWithDuplicates extends Permutation {
    void backtrack(char[] input, int index) {
        if (index >= input.length) {
            result.add(String.valueOf(input));
            return;
        }
        for (int j = index; j < input.length; j++) {
            if (j != index && j < input.length && input[j] == input[index]) {
                j++;
                continue;
            }
            swap(input, index, j);
            backtrack(input, index + 1);
            swap(input, index, j);

        }
    }
}
