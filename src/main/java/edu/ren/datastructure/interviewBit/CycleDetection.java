package edu.ren.datastructure.interviewBit;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by rrn3194 on 8/21/18.
 */
public class CycleDetection {
    // 1 2 3 4 5
    // 5->3
    public ListNode findStartOfLoop(ListNode listNode) {
        return getStartOfLoop(listNode);
        //return getStartOfLoopWithVisitedSet(listNode);
    }

    private ListNode getStartOfLoop(ListNode listNode) {
        ListNode fastPointer, slowPointer, startOfCycle = null;
        fastPointer = slowPointer = listNode;

        while (fastPointer != null && fastPointer.next != null) {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
            if (fastPointer == slowPointer) {
                startOfCycle = slowPointer;
                break;
            }
        }
        if(startOfCycle!=null){
            fastPointer=listNode;
            while (fastPointer!=slowPointer){
                fastPointer=fastPointer.next;
                slowPointer=slowPointer.next;
            }
            startOfCycle=fastPointer;
        }

        return startOfCycle;
    }

    private ListNode getStartOfLoopWithVisitedSet(ListNode listNode) {
        Set<ListNode> visitedSet = new HashSet<>();
        ListNode curr = listNode;

        while (curr != null) {
            if (!visitedSet.contains(curr.next)) {
                visitedSet.add(curr);
            } else {
                return curr.next;
            }
            curr = curr.next;
        }
        return null;
    }
}
