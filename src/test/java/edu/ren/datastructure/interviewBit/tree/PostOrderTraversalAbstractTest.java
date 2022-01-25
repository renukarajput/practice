package edu.ren.datastructure.interviewBit.tree;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.collection.IsIterableContainingInOrder.contains;
import static org.junit.Assert.assertThat;

public abstract class PostOrderTraversalAbstractTest {

    @Test
    public void postOrder() {
        BinarySearchTree binarySearchTree=BinarySearchTree.fromArray(new int[]{2,1,3});
        //BinaryTreePrinter.printNode(binarySearchTree.root);
        assertThat(getPostOrderTraversal().postOrder(binarySearchTree),contains(1,3,2));
    }


    @Test
    public void postOrder_1() {
        BinarySearchTree binarySearchTree=BinarySearchTree.fromArray(new int[]{8,6,10,4,5,3,2,1,12,13});
       // BinaryTreePrinter.printNode(binarySearchTree.root);
        assertThat(getPostOrderTraversal().postOrder(binarySearchTree),contains(1,2,3,5,4,6,13,12,10,8));
    }

    @Test
    public void postOrder_2() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26};
        BinarySearchTree binarySearchTree=new TreeFromBFS().createFromArray(arr);
       // BinaryTreePrinter.printNode(binarySearchTree.root);
        assertThat(getPostOrderTraversal().postOrder(binarySearchTree),contains(16, 17, 8, 18, 19, 9, 4, 20, 21, 10, 22, 23, 11, 5, 2, 24, 25, 12, 26, 13, 6, 14, 15, 7, 3,1));
    }

    @Test
    public void postOrder_22() {
        BinarySearchTree binarySearchTree=new TreeFromBFS().createFromArray(new int[]{85,97,141,52,136,4,69,28,62,153,104,73,164,80,123,107,3,135,23,31,40,74,-1,-1,68,61,156,76,55,103,49,6,51,182,41,71,102,-1,-1,154,167,35,155,150,173,36,-1,-1,110,-1,82,11,166,67,105,-1,94,88,108,112,114,137,10,22,-1,-1,145,-1,30,24,-1,-1,-1,-1,131,64,65,9,2,-1,149,-1,-1,-1,134,139,86,-1,-1,-1,-1,-1,8,117,144,-1,129,44,-1,90,-1,175,16,133,-1,32,-1,15,-1,132,-1,48,101,171,161,-1,176,-1,-1,-1,120,177,-1,142,-1,93,162,59,58,83,169,179,-1,-1,43,106,-1,-1,-1,14,-1,-1,98,-1,138,146,158,111,92,140,-1,53,56,-1,91,1,-1,79,-1,-1,42,-1,127,-1,-1,174,-1,72,21,184,157,-1,27,-1,-1,128,124,-1,-1,77,18,178,147,84,78,-1,-1,95,-1,-1,99,89,39,152,-1,-1,12,-1,-1,-1,-1,-1,38,63,163,7,20,-1,-1,-1,-1,-1,19,-1,-1,181,34,100,-1,-1,-1,-1,-1,-1,-1,159,-1,60,-1,-1,-1,-1,54,119,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,121,33,26,130,66,-1,-1,-1,-1,-1,-1,-1,96,70,-1,-1,-1,-1,-1,-1,143,-1,-1,-1,-1,-1,151,25,-1,-1,170,-1,-1,148,-1,13,-1,-1,-1,-1,-1,-1,-1,-1,-1,168,87,17,-1,-1,45,165,109,116,-1,113,160,115,50,-1,-1,75,183,-1,-1,-1,-1,-1,-1,-1,-1,-1,46,118,-1,-1,-1,-1,-1,-1,-1,-1,29,-1,-1,-1,125,122,-1,47,-1,37,81,126,-1,-1,-1,172,-1,-1,-1,-1,-1,-1,-1,-1,5,57,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1});
       // BinaryTreePrinter.printNode(binarySearchTree.root);
        assertThat(new PostOrderTraversal().postOrder(binarySearchTree),contains(59, 58, 22, 6, 43, 145, 51, 107, 30, 182, 14, 24, 41, 3, 28, 71, 165, 109, 140, 131, 102, 135, 23, 62, 52, 127, 149, 154, 167, 31, 37, 81, 184, 126, 157, 134, 35, 172, 27, 139, 86, 155, 40, 153, 150, 173, 74, 104, 136, 97, 63, 163, 175, 7, 20, 16, 82, 68, 73, 133, 11, 19, 32, 166, 61, 181, 34, 15, 67, 132, 105, 156, 164, 4, 60, 171, 161, 94, 76, 119, 176, 88, 108, 55, 80, 120, 112, 177, 114, 103, 121, 142, 137, 130, 66, 93, 162, 10, 49, 123, 69, 141, 85));
    }

    protected abstract PostOrderTraversal getPostOrderTraversal();
}
