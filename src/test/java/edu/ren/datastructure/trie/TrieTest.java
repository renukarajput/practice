package edu.ren.datastructure.trie;

import org.junit.Test;

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
    public void insert2() {
        Trie trie = new Trie();
        trie.insert("geek$$$");
        assertFalse(trie.find("geek$"));
    }

}