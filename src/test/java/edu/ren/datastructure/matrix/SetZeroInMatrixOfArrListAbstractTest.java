package edu.ren.datastructure.matrix;

import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by rrn3194 on 11/18/18.
 */
public abstract class SetZeroInMatrixOfArrListAbstractTest {

    private final SetZeroInMatrixOfArrList setZeroInMatrixOfArrList = getSetZeroInMatrixOfArrList();

    public ArrayList<ArrayList<Integer>> getArrayAsLists(Integer[][] input) {
        ArrayList<ArrayList<Integer>> inp = new ArrayList<>();
        for (Integer[] row : input) {
            inp.add(new ArrayList<>(Arrays.asList(row)));
        }
        return inp;
    }

    @Test
    public void input_1() {
        Integer actual[][] = {
                {1, 0, 1},
                {1, 1, 1},
                {1, 1, 1}};

        Integer expected[][] = {
                {0, 0, 0},
                {1, 0, 1},
                {1, 0, 1}};
        testWithExpected(actual, expected);
    }


    @Test
    public void input_2() {
        Integer actual[][] = {
                {1, 0, 1},
                {1, 1, 1},
                {1, 0, 1}};
        Integer expected[][] = {
                {0, 0, 0},
                {1, 0, 1},
                {0, 0, 0}};
        testWithExpected(actual, expected);
    }

    @Test
    public void input_3() {
        Integer actual[][] = {
                {1, 0, 1, 1},
                {1, 1, 1, 1},
                {1, 0, 1, 1}};
        Integer expected[][] = {
                {0, 0, 0, 0},
                {1, 0, 1, 1},
                {0, 0, 0, 0}};
        testWithExpected(actual, expected);

    }


    @Test
    public void input_4() {
        Integer actual[][] = {
                {1, 0, 1},
                {1, 1, 1},
                {1, 1, 1}};
        Integer expected[][] = {
                {0, 0, 0},
                {1, 0, 1},
                {1, 0, 1}};
        testWithExpected(actual, expected);
    }


    private void testWithExpected(Integer[][] actual, Integer[][] expected) {
        ArrayList<ArrayList<Integer>> actualLists = getArrayAsLists(actual);
        setZeroInMatrixOfArrList.setMatrixWithZeros(actualLists);

        ArrayList<ArrayList<Integer>> expectedLists = getArrayAsLists(expected);
        assertThat(actualLists, is(expectedLists));
    }

    protected abstract SetZeroInMatrixOfArrList getSetZeroInMatrixOfArrList();
}