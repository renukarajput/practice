package edu.ren.datastructure.matrix;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by rrn3194 on 11/19/18.
 */
public class SetZeroInMatrixUsingSet extends SetZeroInMatrixOfArrList {
    @Override
    public void setMatrixWithZeros(ArrayList<ArrayList<Integer>> input) {
        Set<Integer> rowIndexSet = new HashSet<>();
        Set<Integer> columnIndexSet = new HashSet<>();
        //1 3 5 row has 0
        //2 4 col has 0
        for (int i = 0; i < input.size(); i++) {
            for (int j = 0; j < input.get(0).size(); j++) {
                if (input.get(i).get(j) == 0) {
                    rowIndexSet.add(i);
                    columnIndexSet.add(j);
                }
            }
        }
        /*Iterator<Integer> rowIterator = rowIndexSet.iterator();
        while (rowIterator.hasNext()) {
            setZeroInRow(input, rowIterator.next());
        }*/

        rowIndexSet.forEach(row -> setZeroInRow(input, row));
        columnIndexSet.forEach(col -> setZeroInColumn(input, col));

        /*
        Iterator<Integer> columnIterator = columnIndexSet.iterator();
        while (columnIterator.hasNext()) {
            setZeroInColumn(input, columnIterator.next());
        }*/

    }
}
