package homework.main.test;

import homework.main.java.ArrayRotation;
import org.junit.Test;

public class ArrayRotationTest {
    @Test
    public void rotateByInput1() {
        int arr[] = {1,2,3,4,5};
        ArrayRotation.leftRotate(arr, 4, arr.length);
        for (int a: arr)
            System.out.print(a+" ");
    }

    @Test
    public void rotateByInput2() {
        int arr[] = {5,8,9,1,2,3,6,7};
        ArrayRotation.leftRotate(arr, 5, arr.length);
        for (int a: arr)
            System.out.print(a+" ");
    }

    @Test
    public void testModulo(){
        System.out.println(5%3);
        System.out.println(-5%3);
        System.out.println(3%5);
    }

    @Test
    public void rotateByInput3() {
        int arr[] = {1,2,3};
        ArrayRotation.leftRotate(arr, 5, arr.length);
    }

    @Test
    public void rotateByInput4() {
        int arr[] = {1,2,3,4,6,8};
        ArrayRotation.leftRotate(arr, 5, arr.length);
        for (int a: arr)
            System.out.print(a+" ");
    }

    @Test
    public void rotateByInput5() {
        int input[] = {9, 4, 6, 8, 5, 0, 7};
        ArrayRotation.rotate(input, 4);
    }

    @Test
    public void rotateByInput6() {
        int input[] = null;
        ArrayRotation.rotate(input, 2);
    }

    @Test
    public void rotateByInput7() {
        int input[] = {};
        ArrayRotation.rotate(input, -2);
    }

    @Test
    public void rotateByInput8() {
        int arr[] = {1, 2, 3, 4, 5};
        int[] output = ArrayRotation.rotate(arr, 4);
        for (int a:output) {
            System.out.print(a+" ");
        }
    }
}
