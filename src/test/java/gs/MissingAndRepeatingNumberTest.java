package gs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MissingAndRepeatingNumberTest {

    MissingAndRepeatingNumber obj = new MissingAndRepeatingNumber();

    @Test
    public void input() {
        int[] arr = {2, 1, 3, 3, 5};
        assertArrayEquals(obj.find(arr), new int[]{4, 3});
        assertArrayEquals(obj.findOptimized(arr), new int[]{4, 3});
        assertArrayEquals(obj.findInPlace(arr), new int[]{4, 3});
    }

    @Test
    public void input1() {
        int[] arr = {1, 2, 3, 4, 5};
        assertArrayEquals(obj.find(arr), new int[]{-1, -1});
        assertArrayEquals(obj.findOptimized(arr), new int[]{-1, -1});
        assertArrayEquals(obj.findInPlace(arr), new int[]{-1, -1});
    }
}