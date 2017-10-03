package edu.ren.datastructure.list;


public class RotatableLinkList<T> extends LinkedList<T> {
    LinkedList<T> linkedList;
    private int size;

    public RotatableLinkList(LinkedList<T> linkedList){
        this.linkedList = linkedList;
        this.size = linkedList.size();
    }

    public void rotateList(int positions,DIRECTION direction){
        direction.rotate(this,linkedList.head,linkedList.getNode(size-1),positions);
    }

    public void rotateBlocks(int blocksize, DIRECTION direction, int times) {

        Node<T> start = head;
        Node<T> prev = null;
        Node<T> current = head;
        while (head != null) {
            for (int blockIndex = 0; blockIndex < blocksize; blockIndex++) {
                current = current.next;
            }
            Node<T> headOfBlock = direction.rotate(linkedList, start, current, times);
            if (prev != null) {
                prev.next = headOfBlock;
            }
            start = headOfBlock;
        }

    }

    public enum DIRECTION{
        //1-2-3-4-5-6
        //5-6-1-2-3-4 2 times rotated (start as 1 and end as 6)
        CLOCKWISE {
            @Override
           <T> Node<T> rotate(LinkedList<T> linkedList, Node<T> start, Node<T> end, int times) {
                Node<T> currentNode=start;
                Node<T> previousNode=null;
                int position=0;
                int newHeadPosition=linkedList.size()-times;
                while (position!=newHeadPosition){
                    previousNode=currentNode;
                    currentNode=currentNode.next;
                }
                end.next=start;
                previousNode.next=null;
                linkedList.head=currentNode;
                return currentNode;
            }
        },
        ANTI_CLOCKWISE {
            @Override
           <T> Node<T> rotate(LinkedList<T> linkedList, Node<T> start, Node<T> end, int times) {

                return null;
            }
        };

        abstract<T> Node<T> rotate(LinkedList<T> linkedList, Node<T> start, Node<T> end, int times);
    }


}
