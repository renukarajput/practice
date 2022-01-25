package edu.ren.datastructure.interviewBit.tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class PathSumExistsInAllPathsOptimisedTest extends PathSumExistsInAllPathsAbstractTest{


    @Override
    protected PathSumExistsInAllPaths getPathSumExistsInAllPaths() {
        return new PathSumExistsInAllPathsOptimised();
    }
}