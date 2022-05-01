package edu.ren.geeks.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class LongestSubArrayWithEvenElementsTest {
LongestSubArrayWithEvenElements longestSubArrayWithEvenElements=new LongestSubArrayWithEvenElements();
    @Test
    public void len() {
        int[] arr={5, 2, 4, 7 };
       assertThat(longestSubArrayWithEvenElements.len(arr),is(2));
    }

    @Test
    public void len_1() {
        int[] arr={9, 8, 5, 4, 4, 4, 2, 4, 1 };
       assertThat(longestSubArrayWithEvenElements.len(arr),is(5));
    }
}