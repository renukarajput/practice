package edu.ren.datastructure.interviewBit.backtracking;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class NQueenTest {
NQueen nQueen=new NQueen();
    @Test
    public void placeNQueen() {
        final ArrayList<ArrayList<String>> result = nQueen.placeNQueen(3);
        printBoard(result);
    }
    @Test
    public void placeNQueen_1() {
        final ArrayList<ArrayList<String>> result = nQueen.placeNQueen(4);
        printBoard(result);
    }
    @Test
    public void placeNQueen_2() {
        final ArrayList<ArrayList<String>> result = nQueen.placeNQueen(8);
        assertThat(result.size(),is(92));
        printBoard(result);
    }

    private void printBoard(ArrayList<ArrayList<String>> result) {
        result.forEach(board->{board.forEach(line->System.out.println(line));
            System.out.println("\n");});
    }
}