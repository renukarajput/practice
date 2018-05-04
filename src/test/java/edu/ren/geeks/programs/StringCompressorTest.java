package edu.ren.geeks.programs;

import org.junit.Test;

import java.io.CharArrayReader;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class StringCompressorTest {
    @Test
    public void input0() {
        String input = "aabbcc";
        StringCompressor.getCompressed(input.toCharArray());
    }
    @Test
    public void input1() {
        String input = "abc";
        StringCompressor.getCompressed(input.toCharArray());
    }

    @Test
    public void input2() {
        String input = "aabcccccc";
        //abc
        //aaaaabc
        //a1b1abc
        StringCompressor.getCompressed(input.toCharArray());

//        assertThat(StringCompressor.getCompressed(input.toCharArray()), is("a2b1c3"));
    }

    @Test
    public void input4() {
        char[] input ="aaabbcccd".toCharArray();

        int length = StringCompressor.getCompressedArray(input);
        assertThat(length,is(8));
        char[] compressedCharArr = Arrays.copyOf(input, length);
        assertThat(compressedCharArr, is("a3b2c3d1".toCharArray()));
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void input5() {
        char[] input ="abcd".toCharArray();
        int length = StringCompressor.getCompressedArray(input);
        assertThat(length,is(8));
        char[] compressedCharArr = Arrays.copyOf(input, length);
        assertThat(compressedCharArr, is("a3b2c3d1".toCharArray()));
    }

    @Test
    public void input6() {
        char[] input ="aaaaaaaaaaaabbccccccccccd".toCharArray();
        int length = StringCompressor.getCompressedArray(input);
        assertThat(length,is(10));
        char[] expectedArr = Arrays.copyOf(input,length);
        assertThat(expectedArr, is("a12b2c10d1".toCharArray()));
    }

    @Test
    public void convertToCharArray() {
        List<Integer> digitArrayForInt = StringCompressor.getDigitArrayForInt(66532);
        System.out.println(digitArrayForInt);
        char[] chars = (String.valueOf( 66532)).toCharArray();
        System.out.println(Arrays.toString(chars));
    }
}


//        String b="xyz";
//        b=b.concat("uvw");
//        System.out.println(b);
//       char[] ch= input.toCharArray();
//       ch[0]='y';
//        System.out.println(input);