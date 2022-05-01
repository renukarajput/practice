package edu.ren.geeks.string;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ReverseWordsTest {
    ReverseWords reverseWords = new ReverseWords();

    @Test
    public void input_1() {
        String input = "i like this program very much";
        assertThat(reverseWords.reverseWordByWord(input), is("much very program this like i"));
    }

    @Test
    public void input_2() {
        String input = "hello i am renuka";
        assertThat(reverseWords.reverseWordByWord(input), is("renuka am i hello"));
    }

    @Test
    public void input_3() {
        String input = "hello i am renuka";
        assertThat(reverseWords.reverseWordByWord(input.toCharArray()), is("renuka am i hello"));
    }

    @Test
    public void input_4() {
        String input = "hello world";
        assertThat(reverseWords.reverseWordByWord(input.toCharArray()), is("world hello"));
    }

    @Test
    public void input_5() {
        String input = "this is a sentence";
        assertThat(reverseWords.reverseWordByWord(input.toCharArray()), is("sentence a is this"));
    }

}