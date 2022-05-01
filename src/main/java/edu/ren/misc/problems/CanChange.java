package edu.ren.misc.problems;

import java.util.List;

public class CanChange {
static int can_give_change(List<Integer> rupee_notes) {
    long shopAmount=0;
    for (int i = 0; i <rupee_notes.size() ; i++) {
        final int change = rupee_notes.get(i) - 5;
        if(shopAmount<change){
            return i+1;
        }
        shopAmount+=5;
    }
    return 0;
}
}
