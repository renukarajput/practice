package edu.ren.datastructure.interviewBit.backtracking;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.collection.IsIterableContainingInOrder.contains;
import static org.junit.Assert.*;

public class LetterPhoneTest {
    LetterPhone letterPhone = new LetterPhone();

    @Test
    public void getLetters1() {
        List<String> letters = letterPhone.getLetters("34");
        System.out.println(letters);

    }
        @Test
        public void getLetters() {
        List<String> letters = letterPhone.getLetters("23");
        System.out.println(letters);
        assertThat(letters, contains("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"));
    }
}