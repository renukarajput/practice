package edu.ren.algo.bsearch;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class PalindromeTest {

    @Test
    public void numberOfCharsRequired() {
        assertThat(new Palindrome().numberOfCharsRequired("ABC"),is(2));
    }

    @Test
    public void numberOfCharsRequired1() {
        //AACECAAAA
        //CECAA
        assertThat(new Palindrome().numberOfCharsRequired("AACECAAAA"),is(2));
    }
    @Test
    public void numberOfCharsRequired1_0_0() {
        assertThat(new Palindrome().numberOfCharsRequired("AACBECAAAA"),is(8));
        //AACBECAAAA
        //AAAAC BE CAAAA
        // AA CBECAAAA
    }

    @Test
    public void numberOfCharsRequired1_0() {
       assertThat(new Palindrome().numberOfCharsRequired("AACECBBAA"),is(7));
    }


    @Test
    public void numberOfCharsRequired3() {
        assertThat(new Palindrome().numberOfCharsRequired("AABBCCCDCCCBBAA"),is(0));
    }

    @Test
    public void numberOfCharsRequired4() {
        assertThat(new Palindrome().numberOfCharsRequired("BCCCDCCCBBAA"),is(3));
    }

    @Test
    public void numberOfCharsRequired5() {
        assertThat(new Palindrome().numberOfCharsRequired("hqghumeaylnlfdxfi"),is(16));
    }

    @Test
    public void numberOfCharsRequired5_0() {
        assertThat(new Palindrome().numberOfCharsRequired("hgghumeaylnlfdxfi"),is(13));
    }

    @Test
    public void numberOfCharsRequired5_0_0() {
        assertThat(new Palindrome().numberOfCharsRequired("qzhnbnfuvqnqqlrzjpxi"),is(19));
        //qlrzjpxi
    }

    @Test
    public void numberOfCharsRequired5_0_1() {
        assertThat(new Palindrome().numberOfCharsRequired("abcqqq"),is(5));
        //qlrzjpxi
    }

    @Test
    public void numberOfCharsRequired5_0_2() {
        assertThat(new Palindrome().numberOfCharsRequired("abcaqqq"),is(6));
        //qlrzjpxi
    }

    @Test
    public void numberOfCharsRequired5_0_3() {
        assertThat(new Palindrome().numberOfCharsRequired("qzhqnqab"),is(7));
        //qlrzjpxi
    }

    @Test
    public void numberOfCharsRequired5_0_4() {
        assertThat(new Palindrome().numberOfCharsRequired("qzbbqqa"),is(6));
        //aqqbbz qzbbqqa
    }
    @Test
    public void numberOfCharsRequired5_1() {
        assertThat(new Palindrome().numberOfCharsRequired("DDABMCDD"),is(6));
    }

    //ume ayl nlf d xfi
    @Test
    public void numberOfCharsRequired6() {
        assertThat(new Palindrome().numberOfCharsRequired("abcd"),is(3));
    }

    @Test
    public void numberOfCharsRequired7() {
        assertThat(new Palindrome().numberOfCharsRequired("banana"),is(5));
    }

    @Test
    public void input1() {
        assertThat(Palindrome.isPalindrome("banana"),is(false));
    }

    @Test
    public void input2() {
        assertThat(Palindrome.isPalindrome("aabbaa"),is(true));
    }

    @Test
    public void input3() {
        assertThat(Palindrome.isPalindrome("aabbaa"),is(true));
    }

    @Test
    public void input4() {
        assertThat(Palindrome.isPalindrome("renuka"),is(false));
    }

    @Test
    public void input5() {
        assertThat(Palindrome.isPalindrome("nitin"),is(true));
    }

    //Recursive palindrome check
    @Test
    public void input6() {
        assertThat(Palindrome.isStringPalindrome("nitin",0,4),is(true));
    }

    @Test
    public void input7() {
        assertThat(Palindrome.isStringPalindrome("renuka", 0, 5),is(false));
    }

    @Test
    public void input8() {
        assertThat(Palindrome.isStringPalindrome("malayalam", 0, 8),is(true));
    }

    @Test
    public void input9() {
        assertThat(Palindrome.isStringPalindrome("aba", 0, 2),is(true));
        assertThat(Palindrome.isStringPalindrome("abaa", 0, 3),is(false));
    }
}
