package edu.ren.datastructure.list;


public class RotatableLinkList<T> extends LinkedList<T> {
    // LinkedList<T> linkedList;
    private int size;

    public RotatableLinkList(LinkedList<T> linkedList) {
        this.head = linkedList.head;
        this.size = linkedList.size();
    }

    public void rotateList(int positions, DIRECTION direction) {
        Node<T> newHead = rotate(head, getNode(size - 1), positions, direction);
        head=newHead;
    }

    public void rotateBlocks(int blocksize, DIRECTION direction, int times) {
        Node<T> startOfBlock = head;
        Node<T> prevBlockEnd = null;
        Node<T> currentBlockEnd = null;
        Node<T> current = head;
        times = times % blocksize;
        boolean isFirst=true;
        final int prevBlockEndPosition = blocksize - 1 - times;
        while (current != null) {
            for (int blockIndex = 0; blockIndex < blocksize - 1 && current.next != null; blockIndex++) {

                if (blockIndex == prevBlockEndPosition) {
                    currentBlockEnd = current;
                }
                current = current.next;
            }
            Node<T> startOfNextBlock = current.next;
            final Node<T> newHead = rotate(startOfBlock, current, times, direction);
            if(isFirst) {
                head = newHead;
                isFirst=false;
            }
            startOfBlock = startOfNextBlock;
            if(prevBlockEnd!=null) {
                prevBlockEnd.next = newHead;
            }
            prevBlockEnd=currentBlockEnd;
            current = startOfBlock;


        }

    }

    //1-2-3
    private Node<T> rotate(Node<T> start, Node<T> end, int times, DIRECTION direction) {
        Node<T> currentNode = start;
        Node<T> previousNode = start;
        int position = 0;
        int newHeadPosition = direction.getNewHeadPosition(getNumberOfElements(start, end), times);
        while (position != newHeadPosition) {
            previousNode = currentNode;
            currentNode = currentNode.next;
            position++;
        }
        previousNode.next = null;
        end.next = start;

        return currentNode;
    }

    private int getNumberOfElements(Node<T> start, Node<T> end) {
        int numberOfElements = 1;
        while (start != end) {
            start = start.next;
            numberOfElements++;
        }
        return numberOfElements;
    }

    public enum DIRECTION {
        //1-2-3-4-5-6
        //5-6-1-2-3-4     two times rotated (start as 1 and end as 6)
        CLOCKWISE {
            @Override
            int getNewHeadPosition(int size, int times) {
                return size - times;
            }
        },
        ANTI_CLOCKWISE {
            //1-2-3-4-5-6
            //3-4-5-6-1-2 times rotated (start as 1 and end as 6)
            @Override
            int getNewHeadPosition(int size, int times) {
                return times;
            }
        };

        abstract int getNewHeadPosition(int size, int times);
    }


}
