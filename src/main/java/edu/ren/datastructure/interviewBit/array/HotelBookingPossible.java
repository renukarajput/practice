package edu.ren.datastructure.interviewBit.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class HotelBookingPossible {

    boolean isBookingPossible(List<Integer> arrivals, List<Integer> departures, int numRooms) {

        Collections.sort(arrivals);
        Collections.sort(departures);
        int count = 0, maxCount = 0, departureIndex = 0;
        for (int i = 0; i < arrivals.size(); i++) {
            int arrivalDay = arrivals.get(i);
            count++;

            while (departureIndex < departures.size() && departures.get(departureIndex) <= arrivalDay) {
                departureIndex++;
                count--;
            }
            if(count>maxCount){
                maxCount=count;
            }


        }
        return numRooms>=maxCount;
    }

}
