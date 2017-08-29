package homework.main.test;

import homework.main.java.CharCount;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class CharCountTest {

    @Test
    public void input_0() {
        String str = "A";
        CharCount.getCharWithCount(str);
    }


    @Test
    public void input1() {
        String str = "AAABBCCCCDDDDD";
        CharCount.getCharWithCount(str);
    }

    @Test
    public void input2() {
        String str = "AABBBBAAA";
        CharCount.getCharWithCount(str);
    }

    @Test
    public void input3() {
        String str = "AAABBCCCCDDDDD";
        CharCount.compressInputStr(str);
    }

    @Test
    public void input4() {
        String str = "AABBBBAAA";
        CharCount.compressInputStr(str);
    }

    @Test
    public void input5() {
        String str = "ABCADEBBAC";
        CharCount.compressInputStr(str);

    }

    @Test
    public void compressInputWithSingleChars() {
        Character[] in = {'A', 'A', 'B', 'B', 'B', 'C', 'C', 'C', 'C', 'D', 'D'};
        CharCount.compressInput(in);
        Character[] expected = {'A', '2', 'B', '3', 'C', '4', 'D', '2', null, null, null};
        assertArrayEquals(in, expected);
//      Assert.assertThat(in.length,is(11));
    }
}
