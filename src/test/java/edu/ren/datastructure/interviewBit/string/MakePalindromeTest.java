package edu.ren.datastructure.interviewBit.string;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MakePalindromeTest {
    MakePalindrome makePalindrome = new MakePalindrome();

    @Test
    public void charactersToMakePalindrome_1() {
        int actual = makePalindrome.charactersToMakePalindrome("nitin");
        assertThat(actual, is(0));
    }

    @Test
    public void charactersToMakePalindrome_2() {
        int actual = makePalindrome.charactersToMakePalindrome("abc");
        assertThat(actual, is(2));
    }

    @Test
    public void charactersToMakePalindrome_3() {
        int actual = makePalindrome.charactersToMakePalindrome("abca");
        assertThat(actual, is(3));
    }

    @Test
    public void charactersToMakePalindrome_4() {
        int actual = makePalindrome.charactersToMakePalindrome("AACECAAAA");
        assertThat(actual, is(2));
    }

    @Test
    public void charactersToMakePalindrome_5() {
        int actual = makePalindrome.charactersToMakePalindrome("BABABAA");
        assertThat(actual, is(2));
    }

    @Test
    public void charactersToMakePalindrome_6() {
        int actual = makePalindrome.charactersToMakePalindrome("aba");
        assertThat(actual, is(0));
    }

    @Test
    public void charactersToMakePalindrome_7() {
        int actual = makePalindrome.charactersToMakePalindrome("Anna");
        assertThat(actual, is(0));
    }

    @Test
    public void charactersToMakePalindrome_8() {
        int actual = makePalindrome.charactersToMakePalindrome("demand");
        assertThat(actual, is(5));
    }

    @Test
    public void charactersToMakePalindrome_9() {
        int actual = makePalindrome.charactersToMakePalindrome("hqghumeaylnlfdxfi");
        assertThat(actual, is(16));
    }

    @Test
    public void charactersToMakePalindrome_10() {
        int actual = makePalindrome.charactersToMakePalindrome("hqgh");
        assertThat(actual, is(3));
    }

    @Test
    public void charactersToMakePalindrome_11() {
        int actual = makePalindrome.charactersToMakePalindrome("hqghumeay");
        assertThat(actual, is(8));
    }

    @Test
    public void charactersToMakePalindrome_12() {
        int actual = makePalindrome.charactersToMakePalindrome("pggxrpnrvystmwcysyy");

        assertThat(actual, is(18));
    }

   /* @Test
    public void test() {
        String s1 = "hello";
        String s2 = "hello";
        System.out.println("== " + (s1 == s2));
        System.out.println("eq " + (s1.equals(s2)));

        int i1 = 10;
        int i2 = 10;
        System.out.println("== " + (i1 == i2));

        Integer a = new Integer(10);
        Integer b = new Integer(10);
        System.out.println("== a " + (a == b));
        System.out.println("== a " + (a.equals(b)));

        String s3 = new String("hello");
        String s4 = new String("hello");
        System.out.println("s3 " + (s3 == s4));
        System.out.println("s3 " + (s3.equals(s4)));

    }
*/
}