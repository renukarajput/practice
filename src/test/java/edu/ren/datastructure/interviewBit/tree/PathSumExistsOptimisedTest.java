package edu.ren.datastructure.interviewBit.tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class PathSumExistsOptimisedTest extends PathSumExistsAbstractTest{

    @Override
    protected PathSumExists getPathSumExists() {
        return new PathSumExistsOptimised();
    }
}