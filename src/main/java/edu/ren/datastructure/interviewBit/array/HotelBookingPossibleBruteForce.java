package edu.ren.datastructure.interviewBit.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class HotelBookingPossibleBruteForce extends HotelBookingPossible {

    boolean isBookingPossible(List<Integer> arrivals, List<Integer> departures, int numRooms) {
        List<Integer> indexOrderList=new ArrayList<>();
        for (int i = 0; i <departures.size() ; i++) {
            indexOrderList.add(i);
        }
        Comparator<Integer> comparator= Comparator.comparingInt(departures::get);
        Collections.sort(indexOrderList,comparator);
        int count , maxCount = 0;
        for (int i = 0; i < departures.size(); i++) {
            count=1;
            Integer index = indexOrderList.get(i);
            int prevDeparture=departures.get(index);
            int prevArrival=departures.get(index);

            for (int j = 0; j < departures.size(); j++) {
                if(j==i){
                    continue;
                }
                int nextIndex=indexOrderList.get(j);
                int arrival=arrivals.get(nextIndex);
                int departure=departures.get(nextIndex);
                if(arrival<prevDeparture && departure>prevArrival){ //overlap
                    count++;
                }

            }

            if(count>maxCount){
                maxCount=count;
            }

        }
        return numRooms >= maxCount;
    }
}