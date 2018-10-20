package edu.ren.datastructure.interviewBit.tree;

import org.junit.Test;

import static org.hamcrest.collection.IsIterableContainingInOrder.contains;
import static org.junit.Assert.*;

public class PostOrderTraversalTest extends PostOrderTraversalAbstractTest{



    protected PostOrderTraversal getPostOrderTraversal() {
        return new PostOrderTraversal();
    }


}