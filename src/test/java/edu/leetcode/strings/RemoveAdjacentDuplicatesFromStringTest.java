package edu.leetcode.strings;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class RemoveAdjacentDuplicatesFromStringTest {

    RemoveAdjacentDuplicatesFromString obj = getRemoveAdjacentDuplicatesFromString();

    protected RemoveAdjacentDuplicatesFromString getRemoveAdjacentDuplicatesFromString() {
        return new RemoveAdjacentDuplicatesFromString();
    }

    @Test
    public void input_1() {
        List<Integer> list = new ArrayList<>();
        Collections.reverse(list);
        list.stream().mapToInt(x->x).toArray();
        assertThat(obj.removeDuplicates("abbaca"), is("ca"));
    }

    @Test
    public void input_2() {
        assertThat(obj.removeDuplicates("azxxzy"), is("ay"));
    }

}