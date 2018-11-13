package edu.ren.datastructure.interviewBit.backtracking;

import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.collection.IsIterableContainingInOrder.contains;
import static org.junit.Assert.*;

public class PalindromePartitionTest {
PalindromePartition palindromePartition=new PalindromePartition();
    @Test
    public void partition() {
        ArrayList<ArrayList<String>> subsets = palindromePartition.partition("aab");
        subsets.forEach(s-> System.out.println(s));
        assertThat(subsets.get(0),contains("a","a","b"));
        assertThat(subsets.get(1),contains("aa","b"));
    }

    @Test
    public void partition_1() {
        ArrayList<ArrayList<String>> subsets = palindromePartition.partition("aaabaaa");
        subsets.forEach(s-> System.out.println(s));
    }

    @Test
    public void partition_2() {
        ArrayList<ArrayList<String>> subsets = palindromePartition.partition("cccaacbcaabb");
        subsets.forEach(s-> System.out.println(s));
    }

    @Test
    public void partition_3() {
        ArrayList<ArrayList<String>> subsets = palindromePartition.partition("efe");
        subsets.forEach(s-> System.out.println(s));
    }


}