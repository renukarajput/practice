package edu.ren.datastructure.interviewBit.tree;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class SumRootToLeafTest extends SumToRootLeafAbstractTest {

    @Override
    protected SumRootToLeaf getSumRootToLeaf() {
        return new SumRootToLeaf();
    }

}