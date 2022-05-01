package edu.ren.datastructure.interviewBit.tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class PostOrderTraversal2Test extends PostOrderTraversalAbstractTest{


    @Override
    protected PostOrderTraversal getPostOrderTraversal() {
        return new PostOrderTraversal2();
    }
}