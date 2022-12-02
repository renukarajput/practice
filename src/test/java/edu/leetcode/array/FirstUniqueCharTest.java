package edu.leetcode.array;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class FirstUniqueCharTest {
    FirstUniqueChar obj = new FirstUniqueChar();
    @Test
    public void test(){
        assertThat(obj.firstUniqueChar("aadadaad"), is(-1));
        assertThat(obj.firstUniqueChar("leetcode"), is(0));
        assertThat(obj.firstUniqueChar("loveleetcode"), is(2));
        assertThat(obj.firstUniqueChar("aabb"), is(-1));
    }

}