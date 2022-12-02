package edu.leetcode.array;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class FirstLetterToAppearTwiceTest {

    FirstLetterToAppearTwice obj = new FirstLetterToAppearTwice();

    @Test
    public void  test(){
        assertThat(obj.repeatedCharacter("abccbaacz"), is('c'));
    }

    @Test
    public void  test_1(){
        assertThat(obj.repeatedCharacter("abcdd"), is('d'));
    }
}