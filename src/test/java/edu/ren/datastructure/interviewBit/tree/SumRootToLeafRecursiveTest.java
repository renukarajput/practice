package edu.ren.datastructure.interviewBit.tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class SumRootToLeafRecursiveTest extends SumToRootLeafAbstractTest {

    @Override
    protected SumRootToLeaf getSumRootToLeaf() {
        return new SumRootToLeafRecursive();
    }
}