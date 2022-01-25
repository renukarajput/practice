package leetcode_14days.day_6;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringPermutationTest {
    StringPermutation obj = new StringPermutation();

    @Test
    public void input_1() {
        assertTrue(obj.checkInclusion("ab", "eidbaooo"));
    }

    @Test
    public void input_2() {
        assertFalse(obj.checkInclusion("ab", "eidboaoo"));
    }

    @Test
    public void input_3() {
        assertFalse(obj.checkInclusion("hello", "heythere"));
    }

}