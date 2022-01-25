package edu.leetcode.dp;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class DeleteZeroSubtreeNodesTest {

    @Test
    public void deleteTreeNodes() {
        int nodes = 7;int[] parent = {-1,0,0,1,2,2,2};int[] value = {1,-2,4,0,-2,-1,-1};
        int count = new DeleteZeroSubtreeNodes().deleteTreeNodes(nodes, parent, value);
        assertThat(count,is(2));
    }
}