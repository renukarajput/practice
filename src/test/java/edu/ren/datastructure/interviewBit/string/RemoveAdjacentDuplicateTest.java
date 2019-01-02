package edu.ren.datastructure.interviewBit.string;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class RemoveAdjacentDuplicateTest {
RemoveAdjacentDuplicate removeAdjacentDuplicate=new RemoveAdjacentDuplicate();
    @Test
    public void remove() {
        assertThat(removeAdjacentDuplicate.remove("geeksforgeeg"),is("gksfor"));
    }

    @Test
    public void remove_1() {
        assertThat(removeAdjacentDuplicate.remove("acaaabbbacdddd"),is("acac"));
    }

    @Test
    public void remove_4() {
        assertThat(removeAdjacentDuplicate.remove(" caaabbbaacdddd"),is(" "));
    }
}