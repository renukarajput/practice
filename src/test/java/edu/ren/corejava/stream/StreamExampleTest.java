package edu.ren.corejava.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

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
    public void testLazyEvalOfFindFirst() {
        List<Integer> somelist = Arrays.asList(1, 2, 3, 4, 5, 21, 30);
        somelist.stream().filter(i -> check(i, 20)).findFirst();
    }

    @Test
    public void testEvalOfFindAny() {
        List<Integer> somelist = Arrays.asList(1, 2, 3, 4, 5, 21, 30);
        somelist.stream().filter(i -> check(i, 20)).findAny();
    }


    boolean check(int i, int num) {
        System.out.print(i+" ");
        if (i < num)
            return false;
        return true;
    }

    @Test
    public void testMap() {
        List<String> somelist = Arrays.asList("hello World"," This is"," end of start");
        Stream<String> stringStream = somelist.stream().map(x -> x.toLowerCase());
        stringStream.forEach(x-> System.out.println(x));
    }
    @Test
    public void testFlatMap() {
        List<String> somelist = Arrays.asList("hello world"," this is"," end of  start");
        Stream<String> stringStream = somelist.stream().flatMap(x -> Arrays.stream(x.split(" ")));
        stringStream.forEach(x-> System.out.println(x));
    }

}