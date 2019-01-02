package edu.ren.algo.oracle;

public class PowerOfTwo {

    public boolean isPowerOfTwo(int number) {
        if (number == 0) return false;
        while (number != 1) {
            if (number % 2 != 0)
                return false;
            number = number / 2;
        }
        return true;
    }
}
