package edu.ren.misc.problems;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertThat;

public class ArrayRotationTest {
    @Test
    public void rotateByInput1() {
        int actual[] = {1, 2, 3, 4, 5};
        int expected[] = {5, 1, 2, 3, 4};
        ArrayRotation.leftRotate(actual, 4, actual.length);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void rotateByInput2() {
        int actual[] = {5, 8, 9, 1, 2, 3, 6, 7};
        int expected[] = {3, 6, 7, 5, 8, 9, 1, 2};
        ArrayRotation.leftRotate(actual, 5, actual.length);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void rotateByInput3() {
        int arr[] = {1, 2, 3};
        ArrayRotation.leftRotate(arr, 5, arr.length);
    }

    @Test
    public void rotateByInput4() {
        int actual[] = {1, 2, 3, 4, 6, 8};
        int expected[] = {8, 1, 2, 3, 4, 6};
        ArrayRotation.leftRotate(actual, 5, actual.length);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void rotateByInput5() {
        int input[] = {9, 4, 6, 8, 5, 0, 7};
        int expected[] = {5, 0, 7, 9, 4, 6, 8};
        int[] actual = ArrayRotation.rotate(input, 4);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void rotateByInput6() {
        int input[] = null;
        int[] actual = ArrayRotation.rotate(input, 2);
        assertArrayEquals(null, actual);

    }

    @Test
    public void rotateByInput7() {
        int input[] = {};
        int[] actual = ArrayRotation.rotate(input, -2);
        assertArrayEquals(input, actual);
    }

    @Test
    public void rotateByInput8() {
        int arr[] = {1, 2, 3, 4, 5};
        int expected[] = {5, 1, 2, 3, 4};
        int[] output = ArrayRotation.rotate(arr, 4);
        assertArrayEquals(expected, output);
    }

    @Test
    public void rotateByInput08() {
        int arr[] = {1, 2, 3, 4, 5};
        int expected[] = {3, 4, 5, 1, 2};
        int[] output = ArrayRotation.rotate(arr, 2);
        assertThat(expected, is(output));
    }

    @Test
    public void rotateArrayByK() {
        int actual[] = {1, 2, 3, 4, 5};
        int expected[] = {4, 5, 1, 2, 3};
        ArrayRotation.rotateArrByOne(actual, 2);
        assertThat(expected, is(actual));
    }

    @Test
    public void rotateArrayByK_1() {
        int actual[] = {1, 2, 3, 4, 5};
        int expected[] = {3, 4, 5, 1, 2};
        ArrayRotation.rotateArrByOne(actual, 3);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void rotateUsingReverse_1() {
        int actual[] = {1, 2, 3, 4, 5};
        int expected[] = {4, 5, 1, 2, 3};
        int[] output = ArrayRotation.rotateUsingReverse(actual, 2);
        assertThat(output, is(expected));

    }

    @Test
    public void rotateUsingReverse_01() {
        int actual[] = {3, 8, 9, 7, 6};
        //83 976
        //7 6389
        int expected[] = {9, 7, 6, 3, 8};
        int[] output = ArrayRotation.rotateUsingReverse(actual, 3);
        assertThat(output, is(expected));
    }

    @Test
    public void rotateUsingReverse_001() {
        int actual[] = {1, 2, 3, 4, 5, 6, 7, 8};
        //83 976
        //7 6389
        int expected[] = {9, 7, 6, 3, 8};
        int[] output = ArrayRotation.rotateUsingReverse(actual, 2);
        assertThat(output, is(expected));
    }

    @Test
    public void rotateUsingReverse_2() {
        int actual[] = {1, 2, 3, 4, 5};
        int expected[] = {1, 2, 3, 4, 5};
        ArrayRotation.rotateUsingReverse(actual, 5);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void rotateUsingReverse_3() {
        int actual[] = {1, 2, 3, 4, 5};
        int expected[] = {2, 3, 4, 5, 1};
        ArrayRotation.rotateUsingReverse(actual, 4);
        assertThat(expected, is(actual));
    }
}
