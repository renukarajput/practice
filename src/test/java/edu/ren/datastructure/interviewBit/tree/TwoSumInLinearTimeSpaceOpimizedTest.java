package edu.ren.datastructure.interviewBit.tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class TwoSumInLinearTimeSpaceOpimizedTest extends  TwoSumInBSTAbstractTest{

    @Override
    protected TwoSumInBST getTwoSumInBST() {
        return new TwoSumInLinearTimeSpaceOpimized();
    }

}