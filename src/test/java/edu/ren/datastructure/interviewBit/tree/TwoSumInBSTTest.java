package edu.ren.datastructure.interviewBit.tree;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class TwoSumInBSTTest extends TwoSumInBSTAbstractTest{

   @Override
    protected TwoSumInBST getTwoSumInBST() {
        return new TwoSumInBST();
    }
}