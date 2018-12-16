package edu.ren.datastructure.interviewBit.array;

import org.junit.Test;
import java.util.Set;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.junit.Assert.*;

public class PossiblePairsForKTest {
    PossiblePairsForK possiblePair = new PossiblePairsForK();

    @Test
    public void input_1() {
        int[] arr = {6, -3, -10, 0, 2};
        Set<Pair> output = possiblePair.getPairForK(arr, 8);
        assertThat(output, hasItems(pairOf(6, 2)));
    }

    @Test
    public void input_2() {
        int[] arr = {1, 4, 3, 6, 7, 0};
        Set<Pair> output = possiblePair.getPairForK(arr, 7);
        assertThat(output, hasItems(pairOf(1, 6), pairOf(4, 3), pairOf(7, 0)));
    }

    @Test
    public void input_4() {
        int[] arr = {1, 2, 4, 6, 3, 7, 8};
        Set<Pair> output = possiblePair.getPairForK(arr, 9);
        assertThat(output, hasItems(pairOf(1, 8), pairOf(2, 7), pairOf(6, 3)));
    }

    private Pair pairOf(int x, int y) {
        return new Pair(x, y);
    }

}