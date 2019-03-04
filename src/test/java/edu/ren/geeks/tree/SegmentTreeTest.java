package edu.ren.geeks.tree;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SegmentTreeTest {

    @Test
    public void buildFrom() {
        int[] arr = {1, 3, 5, 7, 9, 11};
        final int[] result = SegmentTree.buildFrom(arr).getTree();
        int[] expected = {36, 9, 27, 4, 5, 16, 11, 1, 3, 0, 0, 7, 9};
        assertThat(result, is(expected));
    }

    @Test
    public void queryRange() {
        final SegmentTree segmentTree = createTreeWith5Elements();
        assertThat(segmentTree.queryRange(0,2),is(9));

    }
    @Test
    public void queryRange_1() {
        final SegmentTree segmentTree = createTreeWith5Elements();
        assertThat(segmentTree.queryRange(2,4),is(21));
    }

    private SegmentTree createTreeWith5Elements() {
        int[] arr = {1, 3, 5, 7, 9, 11};
        return SegmentTree.buildFrom(arr);
    }
}