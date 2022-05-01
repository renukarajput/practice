package edu.ren.datastructure.matrix;

/**
 * Created by rrn3194 on 11/19/18.
 */
public class SetZeroInMatrixUsingSetTest extends SetZeroInMatrixOfArrListAbstractTest{

    @Override
    protected SetZeroInMatrixOfArrList getSetZeroInMatrixOfArrList() {
        return new SetZeroInMatrixUsingSet();
    }
}