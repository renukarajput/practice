package edu.leetcode.backtracking;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class AndroidUnlockPatternTest {

    @Test
    public void numberOfPatterns() {
       assertThat(new AndroidUnlockPattern().numberOfPatterns(1,1),is(9));
    }

    @Test
    public void numberOfPatterns_01() {
        assertThat(new AndroidUnlockPattern().numberOfPatterns(1,2),is(65));
    }

}