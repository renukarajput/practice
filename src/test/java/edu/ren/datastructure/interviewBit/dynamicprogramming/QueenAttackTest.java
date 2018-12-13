package edu.ren.datastructure.interviewBit.dynamicprogramming;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class QueenAttackTest {
    QueenAttack queenAttack=new QueenAttack();

    @Test
    public void numberOfQueensAttackingPosition() {
        Integer[][] board={
                {0,1,0},
                {1,0,0},
                {0,0,1}
        };
        List<List<Integer>> numberOfAttackingQueens = queenAttack.getNumberOfAttackingQueens(board);
        System.out.println(numberOfAttackingQueens);
    }
}