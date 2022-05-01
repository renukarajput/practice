package edu.ren.datastructure.interviewBit.backtracking;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.collection.IsIterableContainingInOrder.contains;
import static org.junit.Assert.*;

public class CombinationSumTest {
    CombinationSum combinationSum = new CombinationSum();

    @Test
    public void get() {
        List<? extends Set<String>> list=new ArrayList<>();
        final Set<String> set = list.get(0);
        list.add(null);

        List<? super Set<String>> list1=new ArrayList<>();
        list1.add(new HashSet<>());
        list1.add(new TreeSet<>());
        //list.add(new Object());

        final Object object = list1.get(0);
        Integer[] candidates = {2, 3, 6, 7};
        final List<List<Integer>> result = combinationSum.get(candidates, 7);
        //result.forEach(x-> System.out.println(x));

        assertThat(result.get(0), contains(2, 2, 3));
        assertThat(result.get(1), contains(7));
    }

    @Test
    public void get_1() {
        Integer[] candidates = {1,2,3,4,5,6,7};
        final List<List<Integer>> result = combinationSum.get(candidates, 4);
      //  result.forEach(x-> System.out.println(x));
        assertThat(result.get(0), contains(1,1,1,1));
       assertThat(result.get(1), contains(1,1,2));
       assertThat(result.get(2), contains(1,3));
       assertThat(result.get(3), contains(2,2));
       assertThat(result.get(4), contains(4));
    }


}