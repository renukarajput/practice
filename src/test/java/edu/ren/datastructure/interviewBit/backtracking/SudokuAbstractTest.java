package edu.ren.datastructure.interviewBit.backtracking;

import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;

public abstract class SudokuAbstractTest {
    Sudoku sudoku = getSudoku();

    protected abstract Sudoku getSudoku();

    @Test
    public void solve() {
        String[] gridValues = {
                "53..7....",
                "6..195...",
                ".98....6.",
                "8...6...3",
                "4..8.3..1",
                "7...2...6",
                ".6....28.",
                "...419..5",
                "....8..79"};
        ArrayList<ArrayList<Character>> grid = getGrid(gridValues);
        sudoku.solve(grid);
        String expected="[[5, 3, 4, 6, 7, 8, 9, 1, 2], [6, 7, 2, 1, 9, 5, 3, 4, 8], [1, 9, 8, 3, 4, 2, 5, 6, 7], [8, 5, 9, 7, 6, 1, 4, 2, 3], [4, 2, 6, 8, 5, 3, 7, 9, 1], [7, 1, 3, 9, 2, 4, 8, 5, 6], [9, 6, 1, 5, 3, 7, 2, 8, 4], [2, 8, 7, 4, 1, 9, 6, 3, 5], [3, 4, 5, 2, 8, 6, 1, 7, 9]]";
//        assertThat(grid.toString(),is(expected));
       // System.out.println(grid);
        grid.forEach(g -> System.out.println(g));
     //   [[534678912], [672195348], [198342567], [859761423], [426853791], [713924856], [961537284], [287419635], [345286179]]
    }

  //  @Test
    public void solve_basic() {
        String[] gridValues = {
                "1..",
                "2..",
                "3..",
        };
        ArrayList<ArrayList<Character>> grid = getGrid(gridValues);
        sudoku.solve(grid);
        grid.forEach(g -> System.out.println(g));
    }


    ArrayList<ArrayList<Character>> getGrid(String[] gridValues) {
        ArrayList<ArrayList<Character>> grid = new ArrayList<>();
        for (String val : gridValues) {
            Character[] charObjectArray =
                    val.chars().mapToObj(c -> (char) c).toArray(Character[]::new);
            grid.add(new ArrayList<>(Arrays.asList(charObjectArray)));
        }
        return grid;
    }
}