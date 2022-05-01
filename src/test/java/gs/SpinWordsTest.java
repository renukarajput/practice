package gs;

import org.junit.Test;

import static org.junit.Assert.*;

public class SpinWordsTest {

    SpinWords spinWords = new SpinWords();

    @Test
    public void test() {
        assertEquals("emocleW", spinWords.spinWords("Welcome"));
        assertEquals("abcd", spinWords.spinWords("abcd"));
        assertEquals("Hey wollef sroirraw", spinWords.spinWords("Hey fellow warriors"));
        assertEquals("[ereht is llits]", spinWords.spinWords("[there is still]"));
        assertEquals("Just gniddik [ereht is llits] one more",
                spinWords.spinWords("Just kidding [there is still] one more"));
        assertEquals("Just gniddik ,[ereht is llits] one more",
                spinWords.spinWords("Just kidding ,[there is still] one more"));
    }
}