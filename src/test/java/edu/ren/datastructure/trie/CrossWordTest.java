package edu.ren.datastructure.trie;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class CrossWordTest {

    @Test
    public void getDictionaryWords() {
        String[] words={"CIZ",
                        "UAK",
                        "QSR"};
        String[] dictionary= {"GEEKS", "FOR", "QUIZ", "GO","CAR","IAS"};
        CrossWord crossWord=new CrossWord(words, Arrays.asList(dictionary));
        List<String> dictionaryWords = crossWord.getDictionaryWords();
       assertThat(dictionaryWords.size(),is(2));
       assertThat(dictionaryWords,hasItems("IAS","CAR"));
    }
}