package edu.ren.datastructure.interviewBit.tree;

import org.junit.Test;

import java.util.List;

import static edu.ren.datastructure.interviewBit.tree.VerticalBSTTraversalTest.fromArray;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;
import static org.junit.Assert.*;

public class PathSumExistsTest extends PathSumExistsAbstractTest {

    @Override
    protected PathSumExists getPathSumExists() {
        return new PathSumExists();
    }
}