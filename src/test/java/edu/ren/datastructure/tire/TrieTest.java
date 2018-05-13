package edu.ren.datastructure.tire;

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
        trie.insert("gee$k");
        assertTrue(trie.find("gee$k"));
        assertFalse(trie.find("geen"));
    }


    @Test
    public void find() {
    }
}