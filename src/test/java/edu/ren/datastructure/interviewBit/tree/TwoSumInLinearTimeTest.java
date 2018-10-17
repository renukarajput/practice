package edu.ren.datastructure.interviewBit.tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class TwoSumInLinearTimeTest extends TwoSumInBSTAbstractTest{

    @Override
    protected TwoSumInBST getTwoSumInBST() {
        return new TwoSumInLinearTime();
    }

}