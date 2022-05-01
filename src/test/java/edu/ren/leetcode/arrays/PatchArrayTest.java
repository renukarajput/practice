package edu.ren.leetcode.arrays;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class PatchArrayTest {
PatchArray patchArray=new PatchArray();
    @Test
    public void minPatches() {
        int[] arr={1,5,10};
       assertThat(patchArray.minPatches(arr,20),is(2));
    }
}