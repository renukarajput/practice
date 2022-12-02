package edu.leetcode.backtracking;

import org.junit.Test;

import java.util.List;

public class LetterCombinationTest {
    LetterCombination obj = new LetterCombination();
    @Test
    public void input_1() throws InterruptedException {
//        while (true) {
            List<String> list = obj.letterCombinations("23");
            try
            {

            } catch (Error e) {

            }
            System.out.println(list + "-> " + list.size());
            //Thread.sleep(2000);
//        }
    }
}