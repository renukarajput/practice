package edu.ren.geeks.string;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class StringCompressorTest {
    @Test
    public void input0() {
        String input = "aabbccc";
        char[] inputArr = input.toCharArray();
        StringCompressor.getCompressed(inputArr);
        assertThat(inputArr, is("a2b2c3".toCharArray()));
    }

    @Test
    public void input1() {
        String input = "aaaaabbbbbccccd";
        char[] inputArr = input.toCharArray();
        StringCompressor.getCompressed(inputArr);

        assertThat(inputArr, is("a5b5c4d1".toCharArray()));

    }

    @Test
    public void input2() {
        String input = "aabcccccc";
        StringCompressor.getCompressed(input.toCharArray());

//        assertThat(StringCompressor.getCompressed(input.toCharArray()), is("a2b1c3"));
    }

    @Test
    public void input3() {
        String input = "aabbcc";
        String output = StringCompressor.compressString(input);
        assertThat(output, is("a2b2c2"));
    }

    @Test
    public void input7() {
        String input = "abbbcccdaddd";
        String output = StringCompressor.compressString(input);
        assertThat(output, is("a1b3c3d1a1d3"));
    }

    @Test
    public void input4() {
        char[] input = "aaabbcccd".toCharArray();

        int length = StringCompressor.getCompressedArray(input);
        assertThat(length, is(8));
        char[] compressedCharArr = Arrays.copyOf(input, length);
        assertThat(compressedCharArr, is("a3b2c3d1".toCharArray()));
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void input5() {
        char[] input = "abcd".toCharArray();
        int length = StringCompressor.getCompressedArray(input);
        assertThat(length, is(8));
        char[] compressedCharArr = Arrays.copyOf(input, length);
        assertThat(compressedCharArr, is("a3b2c3d1".toCharArray()));
    }

    @Test
    public void input6() {
        char[] input = "aaaaaaaaaaaabbccccccccccd".toCharArray();
        int length = StringCompressor.getCompressedArray(input);
        assertThat(length, is(10));
        char[] expectedArr = Arrays.copyOf(input, length);
        assertThat(expectedArr, is("a12b2c10d1".toCharArray()));
    }

    @Test
    public void convertToCharArray() {
        List<Integer> digitArrayForInt = StringCompressor.getDigitArrayForInt(66532);
        System.out.println(digitArrayForInt);
        char[] chars = (String.valueOf(66532)).toCharArray();
        System.out.println(Arrays.toString(chars));
    }
}


//        String b="xyz";
//        b=b.concat("uvw");
//        System.out.println(b);
//       char[] ch= input.toCharArray();
//       ch[0]='y';
//        System.out.println(input);