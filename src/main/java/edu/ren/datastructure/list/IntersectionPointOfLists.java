package edu.ren.datastructure.list;

public class IntersectionPointOfLists {

    public Node getInstersectionPoint(LinkedList one, LinkedList two) {
        return getInstersectionPoint(one.head, two.head);
    }

    private Node getInstersectionPoint(Node one, Node two) {
        Node currentOne = one;
        Node currentTwo = two;
        Node intersectionPoint = null;
        int sizeOne = -1, sizeTwo = -1;
        while (currentOne != null) {
            currentOne = currentOne.next;
            sizeOne++;
        }
        while (currentTwo != null) {
            currentTwo = currentTwo.next;
            sizeTwo++;
        }
        int diff;
//        int diff1 = sizeOne > sizeTwo ? sizeOne - sizeTwo : sizeTwo - sizeOne;
        currentOne = one;
        currentTwo = two;
        if (sizeOne > sizeTwo) {
            diff = sizeOne - sizeTwo;
            while (diff > 0) {
                currentOne = currentOne.next;
                diff--;
            }
        } else {
            diff = sizeTwo - sizeOne;
            while (diff > 0) {
                currentTwo = currentTwo.next;
                diff--;
            }
        }
        while (currentOne != null && currentTwo != null) {
            if (currentOne.next == currentTwo.next) {
                intersectionPoint = currentOne.next;
                break;
            }
            currentOne = currentOne.next;
            currentTwo = currentTwo.next;

        }
        return intersectionPoint;
    }
}
