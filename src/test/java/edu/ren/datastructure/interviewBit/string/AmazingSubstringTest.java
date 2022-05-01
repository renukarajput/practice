package edu.ren.datastructure.interviewBit.string;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class AmazingSubstringTest {
    AmazingSubstring substring = new AmazingSubstring();

    @Test
    public void countOfSubstrings_1() {
        int actual = substring.countOfSubstrings("ABEC");
        int expected = 6;
        assertThat(actual, is(expected));
    }

    @Test
    public void countOfSubstrings_2() {
        int actual = substring.countOfSubstrings("ABC");
        int expected = 3;
        assertThat(actual, is(expected));
    }

    @Test
    public void countOfSubstrings_3() {
        int actual = substring.countOfSubstrings("AB@CDI$PQO#RSU");
        int expected = 23;
        assertThat(actual, is(expected));
    }
    @Test
    public void countOfSubstrings_4() {
        int actual = substring.countOfSubstrings("ABCUI");
        int expected = 8;
        assertThat(actual, is(expected));
    }

    @Test
    public void countOfSubstrings_5() {
        int actual = substring.countOfSubstrings("AB@CDIJ");
        int expected = 8;
        assertThat(actual, is(expected));
    }

    @Test
    public void countOfSubstrings_6() {
        int actual = substring.countOfSubstrings("AB@CDI$");
        int expected = 6;
        assertThat(actual, is(expected));
    }

    @Test
    public void countOfSubstrings_7() {
        int actual = substring.countOfSubstrings("ABCDI");
        int expected = 6;
        assertThat(actual, is(expected));
    }

    @Test
    public void countOfSubstrings_8() {
        int actual = substring.countOfSubstrings("");
        int expected = 0;
        assertThat(actual, is(expected));
    }
    @Test
    public void countOfSubstrings_9() {
        int actual = substring.countOfSubstrings("a");
        int expected = 1;
        assertThat(actual, is(expected));
    }

    @Test
    public void countOfSubstrings_10() {
        int actual = substring.countOfSubstrings("pqrs");
        int expected = 0;
        assertThat(actual, is(expected));
    }

    @Test
    public void countOfSubstrings_11() {
        int actual = substring.countOfSubstrings("AzZGBauYuTknYjjWEEbLvqMQwnoSgXKBdHKEVpeoxYNNtBfrxQrPauttMzjKFayKwMeuChjzCocgAHfAmPCatOqarzLuabyTnxoheeocVshfERNssVPfRyPmwvOVGbzNAuvryYNWwIeyZLMlLbkcFFJRHjEIgIwOThRJJFpLbunVrbhAYsMtdsKslLAGElwrZjvZweIytMpPEYVmktQeNleNROcTjrNxXeHvOMMTMfqZHTUjetojHFzZwOekfAILYISANxeJFRNgeZDKoOTddXqxduPIjGXsRSSkgIqKMeSqlQwAKtdrkvHLgmKleNAPEztGMPmZzUuCImLAhzUnXmsVzFvJUTeIKleuRnMPNAPWJYAZLXgzTBPmkXVShbBSlIAJSeFgvRFvcoqfVFgHUefxUxuYFCfUxbxlOslUhYRFXKmMmqDIQhhfXyGqUwGMSYeLLpEsKAhvFUzavDCOUgtmmNMnsvfmCdPWuWIjuUfZCBTrWnaDopbqXcjzSqRMpQWIBNnMcOQZjDkjPkxsuwENYQyjgSHFJrgSLnwbEInBfdeIfBbVuZZbBrblJgKHOmLZACLQkSRxxQJeUMPIQutraxFtrRcSeqAejOTSqaFGglQOoWPkcNOnLIgfclWNtjGQRVMlqCPUnUlOLbHfkzUyNAmTsswWtZjIGUBrLmRmstHgVcRUgWdQTCEPRzjPVTMJRJocYHftwoRzOSyQexjmceRHdqFdgNuGmGTUdXQaNwKmvOUzZPzGCBVcbVLgMoQrESbpVGteVVntOwEWxXsZnSAoIfBSsWVhDFBuDTkcrnsPdmmSHymouxHlcgtjgKUAPznxsIRUjDFsrjadJjEtPaWTVBHpatqYeSgrpWJDOGfgIGQPcTIXVsCVyCfKMpcXWGkvwuRuTmvCbNMLeUkZrEpYZdlKAgFELfwCCbZCYBcXhfUrsIHfdwhYyxHKAMYMERwlyRtxObDoxBhjXmynYkmkYZrkzlCuvrhW");
        int expected = 2099;
        assertThat(actual, is(expected));
    }

    @Test
    public void countOfSubstrings_12() {
        int actual = substring.countOfSubstrings("AzZGBauYuT");
        int expected = 21;
        assertThat(actual, is(expected));
    }

    @Test
    public void countOfSubstrings_13() {
        int actual = substring.countOfSubstrings("AzZa");
        int expected = 5;
        assertThat(actual, is(expected));
    }

}

