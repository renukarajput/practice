package edu.ren.datastructure.interviewBit.array;

import edu.ren.datastructure.matrix.RotateMatrix;
import org.junit.Test;

import java.util.ArrayList;

import static edu.ren.datastructure.interviewBit.array.MaximumConsecutiveGapTest.listOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class RotateMatrixClockwiseTest {

    @Test
    public void rotateNintyDegrees() {
        int input[][] = {
                {1, 4, 7},
                {2, 5, 8},
                {3, 6, 9}};
        ArrayList<ArrayList<Integer>> arr = listOfArr(input);
        new RotateMatrixClockwise().rotateNintyDegrees(arr);
        int output[][] = {
                {3, 2, 1},
                {6, 5, 4},
                {9, 8, 7}};
        assertThat(arr, is(listOfArr(output)));
    }

    private ArrayList<ArrayList<Integer>> listOfArr(int[][] input) {
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        for (int i = 0; i <input.length ; i++) {
            ArrayList<Integer> list=new ArrayList<>();
            for (int j = 0; j <input[0].length ; j++) {
                list.add(input[i][j]);
            }
            result.add(list);

        }
        return result;
    }


    @Test
    public void rotateNintyDegrees_1() {
        int input[][] = {
                {1, 2, 3,4},
                {5, 6, 7,8},
                {9, 10,11,12},
                {13,14,15,16}};
        ArrayList<ArrayList<Integer>> arr = listOfArr(input);
        new RotateMatrixClockwise().rotateNintyDegrees(arr);
        int output[][] = {
                {13, 9, 5,1},
                {14, 10, 6,2},
                {15, 11, 7,3},
                {16,12,8,4}};
        assertThat(arr, is(listOfArr(output)));
    }

    @Test
    public void rotateNintyDegrees_2() {
        int input[][] = {
                {1, 2, 3,4,5,6},
                {5, 6, 7,8,0,2},
                {9, 1, 4,6,8,3},
                {2, 8, 5,7,4,1},
                {7, 3, 1,8,5,3},
                {4, 1, 7,2,9,6}};
        ArrayList<ArrayList<Integer>> arr = listOfArr(input);
        new RotateMatrixClockwise().rotateNintyDegrees(arr);
        int output[][] = {
                {4, 7, 2,9,5,1},
                {1, 3, 8,1,6,2},
                {7, 1, 5,4,7,3},
                {2, 8, 7,6,8,4},
                {9, 5, 4,8,0,5},
                {6, 3, 1,3,2,6}};
        assertThat(arr ,is(listOfArr(output)));
    }
}