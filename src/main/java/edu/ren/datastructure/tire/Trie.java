package edu.ren.datastructure.tire;

import java.util.HashMap;
import java.util.Map;

public class Trie {
    static final char TERMINAL_CHAR = '$';

    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    void insert(String key) {
        TrieNode trieNode = root;
        Map<Character, TrieNode> linkNodes;
        for (char ch : key.toCharArray()) {
            linkNodes = trieNode.linkNodes;
            if (linkNodes.containsKey(ch)) {
                trieNode = linkNodes.get(ch);
            } else {
                TrieNode node = new TrieNode();
                linkNodes.put(ch, node);
                trieNode = node;

            }
        }
        trieNode.linkNodes.put(TERMINAL_CHAR, new TrieNode());

    }

    boolean find(String key) {
        Map<Character, TrieNode> linkNodes = root.linkNodes;
        TrieNode trieNode = null;
        for (char ch : key.toCharArray()) {
            if (linkNodes.containsKey(ch)) {
                trieNode = linkNodes.get(ch);
                linkNodes = trieNode.linkNodes;
            } else {
                return false;
            }
        }
        if (trieNode == null || !trieNode.linkNodes.containsKey(TERMINAL_CHAR)) {
            return false;
        }
        return true;
    }

    private static class TrieNode {
        Map<Character, TrieNode> linkNodes;

        TrieNode() {
            linkNodes = new HashMap<>();
        }

        boolean addChild(char ch) {
            if (!linkNodes.containsKey(ch)) {
                linkNodes.put(ch, new TrieNode());
                return true;
            }
            return false;
        }

        TrieNode getChild(char ch) {
            return linkNodes.get(ch);
        }

    }
}
