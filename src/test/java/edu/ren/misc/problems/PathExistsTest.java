package edu.ren.misc.problems;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class PathExistsTest {

    @Test
    public void find_path() {
        List<List<String>> matrix=new ArrayList<>();
        List<String> row=new ArrayList<>();
        row.add("a");
        row.add("b");
        row.add("j");
        row.add("d");
        matrix.add(row);
        row=new ArrayList<>();
        row.add("n");
        row.add("j");
        row.add("k");
        row.add("m");
        matrix.add(row);
        row=new ArrayList<>();
        row.add("e");
        row.add("f");
        row.add("q");
        row.add("z");
        matrix.add(row);
        final String res = PathExists.find_path(matrix, "abjfqz");
        System.out.println(res);

    }

    @Test
    public void find_path_1() {
        List<List<String>> matrix=new ArrayList<>();
        List<String> row=new ArrayList<>();
        row.add("a");
        row.add("b");
        matrix.add(row);
        row=new ArrayList<>();
        row.add("c");
        row.add("d");

        matrix.add(row);
        final String res = PathExists.find_path(matrix, "ad");
        System.out.println(res);

    }
    @Test
    public void find_path_2() {
        List<List<String>> matrix=new ArrayList<>();
        List<String> row=new ArrayList<>();
        row.add("z");
        row.add("x");
        row.add("y");
        matrix.add(row);

        final String res = PathExists.find_path(matrix, "zx");
        System.out.println(res);

    }
}