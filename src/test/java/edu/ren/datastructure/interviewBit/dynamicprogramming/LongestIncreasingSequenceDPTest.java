package edu.ren.datastructure.interviewBit.dynamicprogramming;

import org.junit.Ignore;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.collection.IsIterableContainingInOrder.contains;
import static org.junit.Assert.assertThat;

public class LongestIncreasingSequenceDPTest extends LongestIncreasingSequenceAbstractTest{
    @Override
    protected LongestIncreasingSequenceDP getLongestIncreasingSequence() {
        return new LongestIncreasingSequenceDP();
    }

    @Test
    public void lis(){
        int[] arr={10, 22, 9, 33, 21, 50, 41, 60, 80};
        List<Integer> lis = getLongestIncreasingSequence().lis(arr);
        assertThat(getLongestIncreasingSequence().lis(arr),contains(10, 22, 33, 50, 60, 80));
    }

    @Ignore("TODO fixme!")
    @Test
    public void getLengthOfLIS_3() {
        int arr[]={0, 8, 4, 6};
         assertThat(getLongestIncreasingSequence().lis(arr),contains(0,4,6));
    }
}
