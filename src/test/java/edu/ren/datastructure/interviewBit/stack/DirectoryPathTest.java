package edu.ren.datastructure.interviewBit.stack;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class DirectoryPathTest {

    DirectoryPath directoryPath = new DirectoryPath();
    @Test
    public void input_1() {
        String output = directoryPath.simplify("/a/./b/../../c/");
        assertThat(output, is("/c"));
    }

    @Test
    public void input_2() {
        String output = directoryPath.simplify("/home/");
        assertThat(output, is("/home"));
    }

    @Test
    public void input_3() {
        String output = directoryPath.simplify("/home/room/");
        assertThat(output, is("/home/room"));
    }

    @Test
    public void input_4() {
        String output = directoryPath.simplify("/home/room/../room1");
        assertThat(output, is("/home/room1"));
    }
}