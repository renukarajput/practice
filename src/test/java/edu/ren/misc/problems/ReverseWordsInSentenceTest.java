package edu.ren.misc.problems;

import org.junit.Ignore;
import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class ReverseWordsInSentenceTest {
ReverseWordsInSentence reverseWordsInSentence=new ReverseWordsInSentence();
    @Test
    public void reverse() {
        char[] sentence="this is a world".toCharArray();
        reverseWordsInSentence.reverse(sentence);
        assertThat(new String(sentence),is("world a is this"));
    }

    @Test
    @Ignore("fix")
    public void reverse_1() {
        char[] sentence="To reverse in a messy way".toCharArray();
        reverseWordsInSentence.reverse(sentence);
        assertThat(new String(sentence),is("way messy a in reverse To"));
    }
}