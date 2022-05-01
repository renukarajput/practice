package edu.ren.datastructure.interviewBit.backtracking;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class AllInterLeavingsOfTwoStringTest {
AllInterLeavingsOfTwoString allInterLeavingsOfTwoString=new AllInterLeavingsOfTwoString();

    @Test
    public void testInterLeavingStrings() {
        List<String> generated = allInterLeavingsOfTwoString.generate("AB", "CD");
        assertThat(generated,hasItems("ABCD","ACBD","ACDB","CABD","CADB","CDAB"));
    }

    @Test
    public void testInterLeavingStrings_1() {
        List<String> generated = allInterLeavingsOfTwoString.generate("024", "135");
        assertThat(generated.size(),is(20));
    }

    @Test
    public void testInterLeavingStrings_2() {
        List<String> generated = allInterLeavingsOfTwoString.generate("024", "1357");
        assertThat(generated.size(),is(35));
    }
    //what will be size of output
}