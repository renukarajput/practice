package edu.ren.geeks.array;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.collection.IsIterableContainingInOrder.contains;
import static org.junit.Assert.*;

public class CellCompeteTest {
    CellCompete cellCompete = new CellCompete();

    @Test
    public void cellCompete() {
        int[] states = {1, 0, 0, 0, 0, 1, 0, 0};
        final List<Integer> newStates = cellCompete.cellCompete(states, 1);
        assertThat(newStates, contains(0, 1, 0, 0, 1, 0, 1, 0));
    }

    @Test
    public void cellCompete_1() {
        int[] states = {1, 1, 1, 0, 1, 1, 1, 1};
        final List<Integer> newStates = cellCompete.cellCompete(states, 2);
        System.out.println(newStates);
        assertThat(newStates, contains(0, 0, 0, 0, 0, 1, 1, 0));
    }
}