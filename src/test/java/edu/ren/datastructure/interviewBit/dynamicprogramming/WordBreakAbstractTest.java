package edu.ren.datastructure.interviewBit.dynamicprogramming;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public abstract class WordBreakAbstractTest {
    WordBreak wordBreak = getWordBreak();

    protected abstract WordBreak getWordBreak();

    @Test
    public void isBreakFeasible() {
        String[] dict = {"trainer", "my", "interview"};
        assertThat(wordBreak.isBreakFeasible("myinterviewtrainer", setOf(dict)), is(true));
    }

    @Test
    public void isBreakFeasible_1() {
        String[] dict = {"training", "my", "interview"};
        assertThat(wordBreak.isBreakFeasible("myinterviewtrainer", setOf(dict)), is(false));
    }

    @Test
    public void isBreakFeasible_2() {
        String[] dict = {"trainer", "my", "interview"};
        assertThat(wordBreak.isBreakFeasible("myinterviewnowtrainer", setOf(dict)), is(false));
    }

    @Test
    public void isBreakFeasible_3() {
        String[] dict = {"trainer", "my", "interview","now"};
        assertThat(wordBreak.isBreakFeasible("myinterviewnowtrainer", setOf(dict)), is(true));
    }

    @Test
    public void isBreakFeasible_4() {
        String[] dict = {"trainer", "my", "interview","now","myst"};
        assertThat(wordBreak.isBreakFeasible("mystinterviewmynowtrainer", setOf(dict)), is(true));
    }

    @Test
    public void isBreakFeasible_5() {
        String[] dict = {""};
        assertThat(wordBreak.isBreakFeasible("abcdef", setOf(dict)), is(false));
    }

    @Test
    public void isBreakFeasible_6() {
        String[] dict = {"lrbbmqb","cd","r","owkk"};
        assertThat(wordBreak.isBreakFeasible("lrbbmqbabowkkab", setOf(dict)), is(false));
    }

    Set<String> setOf(String[] dict) {
        return new HashSet<>(Arrays.asList(dict));
    }
}