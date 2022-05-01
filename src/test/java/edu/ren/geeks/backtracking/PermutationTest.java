package edu.ren.geeks.backtracking;

import org.junit.Test;
import java.util.List;

public class PermutationTest {
    Permutation permutation = new Permutation();
    @Test
    public void permute() {
        int[] arr = {1,2,3};
        List<List<Integer>> result = permutation.permute(arr);
        System.out.println("No fo permutations - "+ result.size());
        for (List<Integer> list: result) {
            System.out.println(list);
        }
    }
}