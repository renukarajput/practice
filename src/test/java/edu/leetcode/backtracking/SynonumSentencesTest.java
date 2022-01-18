package edu.leetcode.backtracking;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class SynonumSentencesTest {

    @Test
    public void generateSentences() {
        String[][] synonyms = {{"happy", "joy"}, {"sad", "sorrow"}, {"joy", "cheerful"}};
        String sentence = "I am happy today but was sad yesterday";
        List<String> strings = new SynonumSentences().generateSentences(convertToListOfList(synonyms), sentence);
        //strings.forEach(s->System.out.println(s));
        String[] expected =
                {"I am cheerful today but was sad yesterday",
                "I am cheerful today but was sorrow yesterday",
                "I am happy today but was sad yesterday",
                "I am happy today but was sorrow yesterday",
                "I am joy today but was sad yesterday",
                "I am joy today but was sorrow yesterday"};
        verifyOutput(strings, expected);
    }

    @Test
    public void generateSentences_1() {
        String[][] synonyms = {{"a","b"},{"c","d"},{"e","f"}};
        String sentence = "a c e";
        List<String> strings = new SynonumSentences().generateSentences(convertToListOfList(synonyms), sentence);
        //strings.forEach(s->System.out.println(s));
        String[] expected =
                {"a c e","a c f","a d e","a d f","b c e","b c f","b d e","b d f"};
        verifyOutput(strings, expected);
    }

    private void verifyOutput(List<String> strings, String[] expected) {
        for (int i = 0; i <expected.length ; i++) {
            assertThat("failed for %s th strings "+i,strings.get(i),is(expected[i]));
        }
    }

    private List<List<String>> convertToListOfList(String[][] synonyms) {
        List<List<String>> synonymList = new ArrayList<>();
        for (String[] symonymArr : synonyms) {
            synonymList.add(Arrays.asList(symonymArr));
        }
        return synonymList;
    }
}