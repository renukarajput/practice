package edu.ren.datastructure.interviewBit.array;

public class HotelBookingPossibleBruteForceTest extends HotelBookingPossibleTest {

    @Override
    protected HotelBookingPossible getHotelBookingPossible() {
        return new HotelBookingPossibleBruteForce();
    }
}