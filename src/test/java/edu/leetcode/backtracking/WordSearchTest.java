package edu.leetcode.backtracking;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class WordSearchTest {
    WordSearch wordSearch = new WordSearch();

    @Test
    public void exist() {
        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}};
        assertThat(wordSearch.exist(board, "ABCB"), is(false));
    }

    @Test
    public void exist_true() {
        char[][] board = {
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}};
        assertThat(wordSearch.exist(board, "SEE"), is(true));
    }
    @Test
    public void exist_single_true() {
        char[][] board = {{'A'}};
        assertThat(wordSearch.exist(board, "A"), is(true));
        }
    

}