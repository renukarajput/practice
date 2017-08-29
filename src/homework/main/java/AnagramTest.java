package homework.main.java;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by rrn3194 on 7/4/17.
 */
public class AnagramTest {

    @Test
    public void input_0() {
        String input1 = "Apple";
        String input2 = "Apple";
        Boolean out = Anagram.isAnagram(input1,input2);
        assertTrue(out);
    }

    @Test
    public void input_1() {
        String input1 = "Apple";
        String input2 = "Aple";
        Boolean out = Anagram.isAnagram(input1,input2);
        assertFalse(out);
    }

    @Test
    public void input_2() {
        String input1 = "AAAABBBC";
        String input2 = "CBBBAAAA";
        Boolean out = Anagram.isAnagram(input1,input2);
        assertTrue(out);
    }
    @Test
    public void input_3() {
        String input1 = "AAA";
        String input2 = "AA";
        Boolean out = Anagram.isAnagram(input1,input2);
        assertFalse(out);
    }
}
