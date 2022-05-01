package edu.ren.datastructure.interviewBit.array;

import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MatrixSetZeroesTest {

    ArrayList<ArrayList<Integer>> listOf(int[][] matrix) {
        ArrayList<ArrayList<Integer>> matrixList=new ArrayList<>();
        for (int i = 0; i <matrix.length ; i++) {
            ArrayList<Integer> row=new ArrayList<>();
            for (int num:matrix[i]){
                row.add(num);
            }
            matrixList.add(row);
        }
        return matrixList;
    }

    @Test
    public void set_0() {
        int[][] arr1=   {{0, 1},
                        {1, 1},};
        ArrayList<ArrayList<Integer>> arr = listOf(arr1);
        new MatrixSetZeroes().set(arr);

        int[][] expected =  {{0, 0},
                             {0, 1},};
        assertThat(arr,is(listOf(expected)));
    }

    @Test
    public void set() {
        int[][] arr1=   {{1, 0, 1},
                        {1, 1, 1},
                        {1, 1, 1}};
        ArrayList<ArrayList<Integer>> arr = listOf(arr1);
        new MatrixSetZeroes().set(arr);

        int[][] expected =   {{0, 0, 0},
                              {1, 0, 1},
                             {1, 0, 1}};
        assertThat(arr,is(listOf(expected)));
    }

    @Test
    public void set_1_1() {
        int[][] arr1=   {{0, 0, 0},
                {0, 1, 1},
                {0, 1, 1}};
        ArrayList<ArrayList<Integer>> arr = listOf(arr1);
        new MatrixSetZeroes().set(arr);

        int[][] expected =   {{0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}};
        assertThat(arr,is(listOf(expected)));
    }

    @Test
    public void set_1() {
        int[][] arr1=   {{1, 0, 1,1,1},
                         {1, 1, 1,0,1},
                        {1, 1, 1,1,0}};
        ArrayList<ArrayList<Integer>> arr = listOf(arr1);

        new MatrixSetZeroes().set(arr);

        int[][] expected =   {{0, 0, 0,0,0},
                                {0,0,0,0,0},
                                 {0,0,0,0,0}};
        assertThat(arr,is(listOf(expected)));
    }


    @Test
    public void set_2() {
        int[][] arr1=   {{1,0, 1,1,1},
                        {1, 1, 1,0,1},
                         {1,1, 1,1,0},
                        {1, 1, 1,1,1},
                        {1, 1, 1,1,0}};
        ArrayList<ArrayList<Integer>> arr = listOf(arr1);
        new MatrixSetZeroes().set(arr);

        int[][] expected =   {{0,0, 0,0,0},
                              {0,0, 0,0,0},
                             {0, 0, 0,0,0},
                             {1, 0, 1,0,0},
                             {0, 0, 0,0,0}};
        assertThat(arr,is(listOf(expected)));
    }
}