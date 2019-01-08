package edu.ren.datastructure.pramp;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class PairsWithGivenDifferenceTest {

    PairsWithGivenDifference pairsWithGivenDifference = new PairsWithGivenDifference();

    @Test
    public void input_1() {
        int[] input = {0, 1, -1, -2, 1};
        int[][] pairs = pairsWithGivenDifference.find(input, 1);
        int[][] expected = {{0,-1},{-1,-2}};
        assertThat(pairs, is(expected));

    }

    @Test
    public void input_2() {
        int[] input = {0, 1, -1, -2, 1};
        int[][] pairs = new PairsWithGivenDifferenceOptimized().find(input, 1);
        int[][] expected = {{0,-1},{-1,-2}};
        assertThat(pairs, is(expected));
    }

    @Test
    public void input_3() {
        int[] input = {4,6,5,8,7,11,9};
        int[][] pairs = new PairsWithGivenDifferenceOptimized().find(input, 3);
        int[][] expected = {};
        assertThat(pairs, is(expected));
    }
    @Test
    public void input_4() {
        int[] input = {1,3,6};
        int[][] pairs = new PairsWithGivenDifferenceOptimized().find(input, 3);
        int[][] expected = {};
        assertThat(pairs, is(expected));
    }
}