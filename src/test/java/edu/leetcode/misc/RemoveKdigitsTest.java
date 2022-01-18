package edu.leetcode.misc;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class RemoveKdigitsTest {
RemoveKdigits removeKdigits=new RemoveKdigits();
    @Test
    public void removeKdigits() {
     assertThat(removeKdigits.removeKdigits("149",1),is("14"));
    }

    @Test
    public void removeKdigits01() {
        assertThat(removeKdigits.removeKdigits("1432219",3),is("1219"));
    }

    @Test
    public void removeKdigits02() {
        assertThat(removeKdigits.removeKdigits("10200",1),is("200"));
    }
}