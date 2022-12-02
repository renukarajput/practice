package edu.ren.datastructure.interviewBit.array;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class CountOfArrayTest {

    private ByteArrayOutputStream outputStream;

    @Before
    public void setup() {
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    public void count_1() {
        int[] arr = {2, 3, 3, 2, 5};
        fillCount(arr);
        String expectedOutput = "2-->2\n3-->2\n5-->1\n";
        assertThat(outputStream.toString(), is(expectedOutput));
    }

    @Test
    public void count_2() {
        int[] arr = {2, 2,3, 3, 2, 5};
        fillCount(arr);
        String expectedOutput = "2-->3\n3-->2\n5-->1\n";
        assertThat(outputStream.toString(), is(expectedOutput));
    }

    @Test
    public void count_all_same() {
        int[] arr = {2, 2, 2, 2, 2};
        fillCount(arr);
        String expectedOutput = "2-->5\n";
        assertThat(outputStream.toString(), is(expectedOutput));
    }

    @Test
    public void count_continious_numbers() {
        int[] arr = {1, 2, 3, 4, 5};
        fillCount(arr);
        String expectedOutput = "1-->1\n2-->1\n3-->1\n4-->1\n5-->1\n";
        assertThat(outputStream.toString(), is(expectedOutput));
    }

    @Test
    public void count_continious_numbers2() {
        int[] arr = {1, 1, 2, 2, 3, 3, 4, 5, 5};
        fillCount(arr);
        String expectedOutput = "1-->2\n2-->2\n3-->2\n4-->1\n5-->2\n";
        assertThat(outputStream.toString(), is(expectedOutput));
    }

    protected void fillCount(int[] arr) {
        new CountOfArray().count(arr);
    }


    public void name() {

    }
}
//import java.util.*;

class Challenge {
    public static String firstNonRepeatingLetter(String str) {
        Set<Character> duplicates = new HashSet();
        Set<Character> orderedSet = new LinkedHashSet();
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            if (!duplicates.contains(Character.toLowerCase(current)) &&
                    !duplicates.contains(Character.toUpperCase(current))) {
                if (orderedSet.contains(Character.toLowerCase(current))) {
                    orderedSet.remove(Character.toLowerCase(current));
                    duplicates.add(current);
                } else if (orderedSet.contains(Character.toUpperCase(current))) {
                    orderedSet.remove(Character.toUpperCase(current));
                    duplicates.add(current);
                } else {
                    orderedSet.add(current);
                }
            }
        }
        return orderedSet.isEmpty() ? "" : String.valueOf(orderedSet.iterator().next());
    }
}