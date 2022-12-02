package gs;

import java.util.PriorityQueue;

public class MinCostToConnectNRopes {

    static int minCost(int arr[]) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (Integer elm: arr) {
            priorityQueue.add(elm);
        }
        int cost = 0;
        while (priorityQueue.size() > 1) {
            Integer first = priorityQueue.poll();
            Integer second = priorityQueue.poll();
            cost += first+second;
            priorityQueue.add(first+second);
        }
        return cost;
    }

    public static void main(String args[]) {
        int[] arr = {4, 3, 2, 6};
        System.out.println("result ****** " + minCost(arr));
    }
}
