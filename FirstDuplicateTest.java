package array;

import org.junit.Test;

import static org.junit.Assert.*;

public class FirstDuplicateTest {
    FirstDuplicate firstDuplicate = new FirstDuplicate();

    @Test
    public void input_0() {
        int[] arr = {4, 3, 5, 3, 4, 6, 7, 6};
        assertEquals(3, firstDuplicate.getTheElement(arr));
    }

    @Test
    public void input_1() {
        int[] arr = {1, 2, 3, 2, 1, 3};
        assertEquals(2, firstDuplicate.getTheElement(arr));
    }

    @Test
    public void input_2() {
        int[] arr = {4, 3, 4, 5, 3, 4, 6, 7, 6};
        assertEquals(4, firstDuplicate.getTheElement(arr));
    }

    @Test
    public void input_3() {
        int[] arr = {5, 3, 4, 6, 7, 5, 3};
        assertEquals(5, firstDuplicate.getTheElement(arr));
    }

    @Test
    public void input_4() {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(0, firstDuplicate.getTheElement(arr));
    }
}