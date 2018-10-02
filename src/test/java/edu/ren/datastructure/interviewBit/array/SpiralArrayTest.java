package edu.ren.datastructure.interviewBit.array;

import org.junit.Test;

import java.util.Iterator;
import java.util.StringJoiner;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class SpiralArrayTest {

    @Test
    public void iterator() {
        Integer[][] array = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        SpiralArray<Integer> spiralArray = new SpiralArray<>(array);
        Iterator<Integer> iterator = spiralArray.iterator();
        StringJoiner stringJoiner = new StringJoiner("->");
        while (iterator.hasNext()) {
            stringJoiner.add(String.valueOf(iterator.next()));
        }
        System.out.println(stringJoiner.toString());
        assertThat(stringJoiner.toString(), is("1->2->3->4->8->12->16->15->14->13->9->5->6->7->11->10"));
    }
}