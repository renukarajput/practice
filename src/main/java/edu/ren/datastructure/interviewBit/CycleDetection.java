package edu.ren.datastructure.interviewBit;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by rrn3194 on 8/21/18.
 */

// https://www.interviewbit.com/problems/list-cycle/
public class CycleDetection {

    public ListNode findStartOfLoop(ListNode listNode) {
        return getStartOfLoop(listNode);
    }

    public int[] numCyclesBeforeCycleDetection(ListNode listNode) {
        ListNode fastPointer, slowPointer, startOfCycle = getStartOfLoop(listNode);
        fastPointer = slowPointer = listNode;
        int fastCount = -1, slowCount = -1;
        while (fastPointer != null && fastPointer.next != null) {
            if (fastPointer == startOfCycle || fastPointer.next == startOfCycle) {
                fastCount++;
            }
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
            if (fastPointer == slowPointer) {
                break;
            }
            if (slowPointer == startOfCycle) {
                slowCount++;
            }
        }
        return new int[]{slowCount, fastCount};
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
        if (startOfCycle != null) {
            fastPointer = listNode;
            while (fastPointer != slowPointer) {
                fastPointer = fastPointer.next;
                slowPointer = slowPointer.next;
            }
            startOfCycle = fastPointer;
        }

        return startOfCycle;
    }

    public ListNode getStartOfLoopWithVisitedSet(ListNode listNode) {
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
