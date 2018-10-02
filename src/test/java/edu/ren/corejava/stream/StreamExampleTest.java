package edu.ren.corejava.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class StreamExampleTest {
    @Test
    public void test() {
        List<Integer> somelist = Arrays.asList(1, 2, 3, 4, 5, 20, 30);
        somelist.forEach(i -> {
            if (i == 3)
                return;
            else System.out.print(i + " ");
        });
    }

    @Test
    public void test1() {
        List<Integer> somelist = Arrays.asList(1, 2, 3, 4, 5, 21, 30);
        somelist.stream().filter(i -> check(i, 20)).findFirst();
        somelist.stream().filter(i -> check(i, 20)).findAny();
    }

    boolean check(int i, int num) {
        System.out.println(i);
        if (i < num)
            return false;
        return true;
    }

}