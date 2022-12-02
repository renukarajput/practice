package edu.leetcode.array;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class RemoveElementFromArrayTest {

    RemoveElementFromArray obj = new RemoveElementFromArray();
    @Test
    public void removeElementFromNonSortedArrayTest(){
        assertThat(obj.removeElement(new int[]{3,2,2,3}, 3), is(2));
        assertThat(obj.removeElement(new int[]{0,1,2,2,3,0,4,2}, 2), is(5));
        assertThat(obj.removeElm(new int[]{3,2,2,3}, 3), is(2));
        assertThat(obj.removeElm(new int[]{0,1,2,2,3,0,4,2}, 2), is(5));
    }

    @Test
    public void removeElementFromSortedArrayTest(){
        assertThat(obj.removeDuplicatesFromSortedArray(new int[]{1,1,2}), is(2));
        assertThat(obj.removeDuplicatesFromSortedArray(new int[]{1,1,2,2}), is(2));
        assertThat(obj.removeDuplicatesFromSortedArray(new int[]{0,0,1,1,1,2,2,3,3,4} ), is(5));
        assertThat(obj.removeDuplicatesFromSortedArray(new int[]{2,2,3,3}), is(2));
        assertThat(obj.removeDuplicatesFromSortedArray(new int[]{0,1,2,2,3,3,4,5}), is(6));
        assertThat(obj.removeDuplicatesFromSortedArray(new int[]{0,1,2,3}), is(4));
    }


}
interface i1 {
    void show();
    default void show1() {

    }
}
interface i2 {
    void show();
    default void show1() {

    }

}

class Test1 implements i1, i2{
    @Override
    public void show() {

    }



    @Override
    public void show1() {
        i1.super.show1();
    }
}