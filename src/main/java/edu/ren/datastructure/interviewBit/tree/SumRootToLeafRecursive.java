package edu.ren.datastructure.interviewBit.tree;

import java.math.BigInteger;
import java.util.Deque;
import java.util.List;

public class SumRootToLeafRecursive extends SumRootToLeaf {

    @Override
    public int getSum(BinarySearchTree tree) {
        List<Deque<Integer>> allPaths = new AllPathsOfBinaryTree().getAllPaths(tree);
        BigInteger sum=new BigInteger("0");
        for(Deque<Integer> path:allPaths){
            BigInteger numberForPath = getNumberForPath(path);
            sum=sum.add(numberForPath);
        }
        BigInteger[] result = sum.divideAndRemainder(new BigInteger("1003"));
        return result[1].intValue();
    }

    private BigInteger getNumberForPath(Deque<Integer> path) {
        StringBuilder stringBuilder=new StringBuilder();
        for(int i:path){
            stringBuilder.append(i);
        }
        return new BigInteger(stringBuilder.toString());
    }
}
