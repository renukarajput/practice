package edu.ren.datastructure.interviewBit.heap;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.collection.IsIterableContainingInOrder.contains;
import static org.junit.Assert.*;

public class MaxKpairSumTest {

    @Test
    public void maxSum() {
        Integer[] a={1,4,2,3};
        Integer b[]={2,5,1,6};
        List<Integer> kmax = getMaxKpairSum().maxSum(new ArrayList<>(Arrays.asList(a)),new ArrayList<>(Arrays.asList(b)));
        assertThat(kmax,contains(10,9,9,8));
    }

    protected MaxKpairSum getMaxKpairSum() {
        return new MaxKpairSum();
    }

    @Test
    public void maxSum_1() {
        Integer[] a={3, 2, 4, 2};
        Integer b[]={4, 3, 1, 2};
        List<Integer> kmax = getMaxKpairSum().maxSum(new ArrayList<>(Arrays.asList(a)),new ArrayList<>(Arrays.asList(b)));
        assertThat(kmax,contains(8,7,7,6));
    }
}