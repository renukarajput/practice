package com.scratch;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class LargestNumberTest {
LargestNumber largestNumber=new LargestNumber();
    @Test
    public void rearrange() {
        Integer[] arr={2,5,9,20,4};
        largestNumber.rearrange(arr);
        Integer[] expected={9,5,4,2,20};
        assertThat(arr,is(expected));
    }
    @Test
    public void rearrange_1() {
        Integer[] arr={2,5,9,8,7,20,4};
        largestNumber.rearrange(arr);
        Integer[] expected={9,8,7,5,4,2,20};
        assertThat(arr,is(expected));
    }
}