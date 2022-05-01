package edu.ren.datastructure.trie;

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
        trieNode.linkNodes.put(TERMINAL_CHAR, null);

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
        if (trieNode == null || !trieNode.linkNodes.containsKey(TERMINAL_CHAR) || trieNode.linkNodes.get(TERMINAL_CHAR)!=null) {
            return false;
        }
        return true;
    }

public static class PrefixSearchResult{
        int matchCount;
        boolean isPrefix;
        boolean isDictionaryWord;

    public PrefixSearchResult(int matchCount, boolean isPrefix,boolean isDictionaryWord) {
        this.matchCount = matchCount;
        this.isPrefix = isPrefix;
        this.isDictionaryWord=isDictionaryWord;
    }
}
    PrefixSearchResult findLengthIfKeyIsAMatchingPrefix(String key) {
        int matchCount=0;
        Map<Character, TrieNode> linkNodes = root.linkNodes;
        TrieNode trieNode = null;
        for (char ch : key.toCharArray()) {
            if (linkNodes.containsKey(ch)) {
                trieNode = linkNodes.get(ch);
                linkNodes = trieNode.linkNodes;
                matchCount++;
            } else {
                return new PrefixSearchResult(matchCount,false,false);
            }
        }

        if (!isTerminalNode(trieNode)) {
            return new PrefixSearchResult(matchCount,true,false);
        }

        return new PrefixSearchResult(matchCount,true,true);
    }

    boolean isTerminalNode(TrieNode trieNode){
        if(trieNode==null){
            return false;
        }
        if(!trieNode.linkNodes.containsKey(TERMINAL_CHAR)){
            return false;
        }
        if(trieNode.linkNodes.get(TERMINAL_CHAR)!=null)
            return false;

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
