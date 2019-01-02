package edu.ren.datastructure.interviewBit.array;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class HotelBookingPossibleTest {

    protected HotelBookingPossible getHotelBookingPossible() {
        return new HotelBookingPossible();
    }

    @Test
    public void isBookingPossible_less_rooms() {
        List<Integer> arrivals = Arrays.asList(new Integer[]{1, 12, 8,3});
        List<Integer> departures = Arrays.asList(new Integer[]{9, 16, 11,18});
        assertThat(getHotelBookingPossible().isBookingPossible(arrivals, departures, 2), is(false));
    }

    @Test
    public void isBookingPossible_sufficient_rooms() {
        List<Integer> arrivals = Arrays.asList(new Integer[]{1, 12, 8,3});
        List<Integer> departures = Arrays.asList(new Integer[]{9, 16, 11,18});
        assertThat(getHotelBookingPossible().isBookingPossible(arrivals, departures, 3), is(true));
    }

    @Test
    public void isBookingPossible_1_less_rooms() {
        List<Integer> arrivals = Arrays.asList(new Integer[]{1,   7, 3,  14,25,6, 5, 4,3,2});
        List<Integer> departures = Arrays.asList(new Integer[]{9, 11, 12,20,28,29,30,31,31,31});
        assertThat(getHotelBookingPossible().isBookingPossible(arrivals, departures, 6), is(false));
    }

    @Test
    public void isBookingPossible_1_sufficient_rooms() {
        List<Integer> arrivals = Arrays.asList(new Integer[]{1,   7, 3,  14,25,6, 5, 4,3,2});
        List<Integer> departures = Arrays.asList(new Integer[]{9, 11, 12,20,28,29,30,31,31,31});
        assertThat(getHotelBookingPossible().isBookingPossible(arrivals, departures, 8), is(true));
    }
    @Test
    public void isBookingPossible() {
        List<Integer> arrivals = Arrays.asList(new Integer[]{1, 3, 5});
        List<Integer> departures = Arrays.asList(new Integer[]{2, 6, 8});
        assertThat(getHotelBookingPossible().isBookingPossible(arrivals, departures, 1), is(false));
    }


    @Test
    public void isBookingPossible_1() {
        List<Integer> arrivals = Arrays.asList(new Integer[]{16, 3, 19});
        List<Integer> departures = Arrays.asList(new Integer[]{18, 20, 20});
        assertThat(getHotelBookingPossible().isBookingPossible(arrivals, departures, 2), is(true));
    }

    @Test
    public void isBookingPossible_2() {
        List<Integer> arrivals = Arrays.asList(new Integer[]{16, 14, 11,4,5,24});
        List<Integer> departures = Arrays.asList(new Integer[]{18, 20, 22,23,24,25});
        assertThat(getHotelBookingPossible().isBookingPossible(arrivals, departures, 4), is(false));
    }
    @Test
    public void isBookingPossible_withoutRoom() {
        List<Integer> arrivals = Arrays.asList(new Integer[]{1, 3, 9});
        List<Integer> departures = Arrays.asList(new Integer[]{2, 6, 8});
        assertThat(getHotelBookingPossible().isBookingPossible(arrivals, departures, 0), is(false));
    }


    @Test
    public void isBookingPossible_withLessRoom() {
        List<Integer> arrivals = Arrays.asList(new Integer[]{1, 2, 3, 5, 11});
        List<Integer> departures = Arrays.asList(new Integer[]{3, 5, 7, 8, 14});
        assertThat(getHotelBookingPossible().isBookingPossible(arrivals, departures, 1), is(false));
    }

    @Test
    public void isBookingPossible_withSufficientRoom() {
        List<Integer> arrivals = Arrays.asList(new Integer[]{1, 2, 3, 5, 11});
        List<Integer> departures = Arrays.asList(new Integer[]{3, 5, 7, 8, 14});
        assertThat(getHotelBookingPossible().isBookingPossible(arrivals, departures, 2), is(true));
    }

    @Test
    public void isBookingPossible_withConsecutiveChecking() {
        List<Integer> arrivals = Arrays.asList(new Integer[]{1, 3, 5, 7, 10});
        List<Integer> departures = Arrays.asList(new Integer[]{3, 5, 7, 9, 11});
        assertThat(getHotelBookingPossible().isBookingPossible(arrivals, departures, 1), is(true));
    }

    @Test
    public void isBookingPossible_with() {
        List<Integer> arrivals = Arrays.asList(new Integer[]{9, 47, 17, 39, 35, 35, 20, 18, 15, 34, 11, 2, 45, 46, 15, 33, 47, 47, 10, 11, 27});
        List<Integer> departures = Arrays.asList(new Integer[]{32, 82, 39, 86, 81, 58, 64, 53, 40, 76, 40, 46, 63, 88, 56, 52, 50, 72, 22, 19, 38});
        assertThat(getHotelBookingPossible().isBookingPossible(arrivals, departures, 16), is(true));
    }

    @Test
    public void isBookingPossible_with2() {
        List<Integer> arrivals = Arrays.asList(new Integer[]{2, 11, 26});
        List<Integer> departures = Arrays.asList(new Integer[]{46, 19, 64});
        assertThat(getHotelBookingPossible().isBookingPossible(arrivals, departures, 2), is(true));

    }

    @Test
    public void isBookingPossible_with3() {
        List<Integer> arrivals = Arrays.asList(new Integer[]{2, 11, 26});
        List<Integer> departures = Arrays.asList(new Integer[]{46, 19, 64});
        assertThat(getHotelBookingPossible().isBookingPossible(arrivals, departures, 2), is(true));

    }

    @Test
    public void isBookingPossible_with4() {
        List<Integer> arrivals = Arrays.asList(new Integer[]{1, 6, 4});
        List<Integer> departures = Arrays.asList(new Integer[]{5, 7, 10});
        assertThat(getHotelBookingPossible().isBookingPossible(arrivals, departures, 2), is(true));
    }

    @Test
    public void isBookingPossible_with5() {
        List<Integer> arrivals = Arrays.asList(new Integer[]{1, 6, 4,8});
        List<Integer> departures = Arrays.asList(new Integer[]{5, 7, 10,12});
        assertThat(getHotelBookingPossible().isBookingPossible(arrivals, departures, 2), is(true));
    }

    @Test
    public void isBookingPossible_with6() {
        List<Integer> arrivals = Arrays.asList(new Integer[]{1, 9, 2,3,4});
        List<Integer> departures = Arrays.asList(new Integer[]{8, 10, 20,18,24});
        assertThat(getHotelBookingPossible().isBookingPossible(arrivals, departures, 3), is(false));
    }

    @Test
    public void isBookingPossible_with6true() {
        List<Integer> arrivals = Arrays.asList(new Integer[]{1, 9, 2,3,4});
        List<Integer> departures = Arrays.asList(new Integer[]{8, 10, 20,18,24});
        assertThat(getHotelBookingPossible().isBookingPossible(arrivals, departures, 4), is(true));
    }

}