package edu.ren.datastructure.interviewBit.dynamicprogramming;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.collection.IsIterableContainingInOrder.contains;
import static org.junit.Assert.*;

public class QueenAttackTest {
    QueenAttack queenAttack = new QueenAttack();

    @Test
    public void numberOfQueensAttackingPosition() {
      /*  Integer[][] board={
                {0,1,0},
                {1,0,0},
                {0,0,1}
        };*/
        ArrayList<String> board = new ArrayList<>();
        board.add("010");
        board.add("100");
        board.add("001");
        List<List<Integer>> numberOfAttackingQueens = queenAttack.getNumberOfAttackingQueens(board);
        System.out.println(numberOfAttackingQueens);

        assertThat(numberOfAttackingQueens.get(0), contains(3, 1, 2));
        assertThat(numberOfAttackingQueens.get(1), contains(1, 3, 3));
        assertThat(numberOfAttackingQueens.get(2), contains(2, 3, 0));
    }

    @Test
    public void numberOfQueensAttackingPosition_1() {
        ArrayList<String> board = new ArrayList<>();
        board.add("011");
        board.add("101");
        board.add("101");
        List<List<Integer>> numberOfAttackingQueens = queenAttack.getNumberOfAttackingQueens(board);
        System.out.println(numberOfAttackingQueens);
        assertThat(numberOfAttackingQueens.get(0), contains(3, 3, 3));
        assertThat(numberOfAttackingQueens.get(1), contains(3, 6, 4));
        assertThat(numberOfAttackingQueens.get(2), contains(3, 5, 2));
    }

    @Test
    public void numberOfQueensAttackingPosition_01() {
        ArrayList<String> board = new ArrayList<>();
        board.add("111");
        board.add("001");
        board.add("001");
        List<List<Integer>> numberOfAttackingQueens = queenAttack.getNumberOfAttackingQueens(board);
        System.out.println(numberOfAttackingQueens);
        //[[2, 3, 2], [3, 5, 3], [3, 3, 2]]
    }

    @Test
    public void numberOfQueensAttackingPosition_2() {
        String[] row = {"0101010010", "1100000101", "0001100101", "0110000101", "0000011101", "0001001101", "0011010100", "1100000011", "0101100100", "0011000110"};

        ArrayList<String> board = new ArrayList<>(Arrays.asList(row));
        List<List<Integer>> numberOfAttackingQueens = queenAttack.getNumberOfAttackingQueens(board);
        System.out.println(numberOfAttackingQueens);

        // [3 4 5 4 5 5 5 5 4 3 ] [4 4 6 6 7 6 6 6 6 4 ] [5 6 4 7 4 7 6 7 8 4 ] [5 4 6 6 7 8 7 7 8 5 ] [5 5 6 6 6 7 6 7 8 5 ] [5 5 5 7 8 6 7 8 7 4 ] [5 5 6 6 7 7 6 6 6 5 ] [3 6 7 7 7 7 6 6 6 4 ] [3 5 7 6 6 5 6 6 6 4 ] [3 3 4 5 5 5 5 5 3 3 ]
    }
}
