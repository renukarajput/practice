package edu.ren.datastructure.trie;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class TrieTest {

    @Test
    public void insert() {
        Trie trie = new Trie();
        trie.insert("geek");
        trie.insert("geem");
        assertTrue(trie.find("geek"));
        assertTrue(trie.find("geem"));
        assertFalse(trie.find("geen"));

    }

    @Test
    public void insertWithTerminalCharacter() {
        Trie trie = new Trie();
        trie.insert("geek$$$");
        assertFalse(trie.find("geek$"));
    }

    @Test
    public void testPrefixWord() {
        Trie trie = new Trie();
        trie.insert("geeksandnerds");
        Trie.PrefixSearchResult prefixSearchResult = trie.findLengthIfKeyIsAMatchingPrefix("geeks");
        assertTrue(prefixSearchResult.isPrefix);
        assertThat(prefixSearchResult.matchCount,is(5));
        assertFalse(prefixSearchResult.isDictionaryWord);
    }

    @Test
    public void testDictionaryWord() {
        Trie trie = new Trie();
        trie.insert("geeksandnerds");
        Trie.PrefixSearchResult prefixSearchResult = trie.findLengthIfKeyIsAMatchingPrefix("geeksandnerds");
        assertTrue(prefixSearchResult.isPrefix);
        assertThat(prefixSearchResult.matchCount,is(13));
        assertTrue(prefixSearchResult.isDictionaryWord);
    }

    @Test
    public void testNonPrefixWord() {
        Trie trie = new Trie();
        trie.insert("geeksandnerds");
        Trie.PrefixSearchResult prefixSearchResult = trie.findLengthIfKeyIsAMatchingPrefix("geekss");
        assertFalse(prefixSearchResult.isPrefix);
        assertThat(prefixSearchResult.matchCount,is(5));
        assertFalse(prefixSearchResult.isDictionaryWord);
    }


}