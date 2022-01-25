package edu.ren.misc.problems;

import org.junit.Test;

import static org.junit.Assert.*;

public class NewsPaperTest {
    @Test
    public void solve() {
        int [] x={1,2,1};
        int [] y={2,3,3};
        final String solve = NewsPaper.solve(3, 3, x, y);
        System.out.println(solve);
    }
    @Test
    public void solve_1() {
        int [] x={1,3,2};
        int [] y={3,2,1};
        final String solve = NewsPaper.solve(3, 3, x, y);
        System.out.println(solve);
    }

    @Test
    public void solve_2() {
        int [] x={1,3,2,4};
        int [] y={3,2,1,2};
        final String solve = NewsPaper.solve(4, 4, x, y);
        System.out.println(solve);
    }
}