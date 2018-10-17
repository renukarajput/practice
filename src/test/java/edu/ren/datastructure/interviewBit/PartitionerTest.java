package edu.ren.datastructure.interviewBit;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class PartitionerTest {

    @Test
    public void partition1() {
            ListNode listNode = ListNodeProxy.fromArray(new int[]{1,4,3,2,5,2});
            new Partitioner().partition(listNode,3);
            assertThat(listNode.toString(),is("1->2->2->4->3->5"));
    }

    @Test
    public void partition2() {
        ListNode listNode = ListNodeProxy.fromArray(new int[]{10,15,30,20,50,18});
        new Partitioner().partition(listNode,20);
        assertThat(listNode.toString(),is("10->15->18->30->20->50"));
    }

    @Test
    public void partitionOfAlreadyPartitionedList() {
        ListNode listNode = ListNodeProxy.fromArray(new int[]{1,2,2,4,3,5});
        new Partitioner().partition(listNode,3);
        assertThat(listNode.toString(),is("1->2->2->4->3->5"));
    }

    @Test
    public void partitionWithPartitionValueAtStart() {
        ListNode listNode = ListNodeProxy.fromArray(new int[]{1,2,3,4,5,6});
        new Partitioner().partition(listNode,1);
        assertThat(listNode.toString(),is("1->2->3->4->5->6"));
    }

    @Test
    public void partitionWithPartitionValueAtEnd() {
        ListNode listNode = ListNodeProxy.fromArray(new int[]{1,2,3,4,5,6});
        new Partitioner().partition(listNode,6);
        assertThat(listNode.toString(),is("1->2->3->4->5->6"));
    }

    @Test
    public void partitionWithGreaterMissingPartitionValue() {
        ListNode listNode = ListNodeProxy.fromArray(new int[]{1,2,3,4,5,6});
        new Partitioner().partition(listNode,100);
        assertThat(listNode.toString(),is("1->2->3->4->5->6"));
    }

    @Test
    public void partitionWithSmallerMissingPartitionValue() {
        ListNode listNode = ListNodeProxy.fromArray(new int[]{10,20,30,40,50,60});
        new Partitioner().partition(listNode,1);
        assertThat(listNode.toString(),is("10->20->30->40->50->60"));

    }

    @Test
    public void partitionWithSmallePartitionValue() {
        ListNode listNode = ListNodeProxy.fromArray(new int[]{100,200,300,40,50,30,60});
        ListNode partition = new Partitioner().partition(listNode, 40);
        assertThat(partition.toString(),is("30->100->200->300->40->50->60"));

    }
    @Test
    public void partitionWith(){
//        int[] arr= {192 , 856 , 647 , 251 , 498 , 749 , 252 , 577 , 322 , 794 , 490 , 278 , 754 , 505 , 688 , 418 , 486 , 3 , 700 , 680 , 707 , 892 , 37 , 666 , 9 , 858 , 802 , 82 , 441 , 500 , 64 , 373 , 174 , 779 , 346 , 803 , 760 , 48 , 783 , 654 , 731 , 391 , 733 , 480 , 5 , 144 , 919 , 291 , 180 , 50 , 326 , 90 , 437 , 502 , 527 , 648 , 361 , 828 , 729 , 546 , 934 , 69 , 209 , 187 , 365 , 329 , 276 , 86 , 348 , 986 , 344 , 183 , 495 };
        int[] arr=  { 6 , 538 , 298 , 267 , 706 , 685 , 46 , 148 , 185 , 695 , 908 , 509 , 173 , 159 , 329 , 829 , 334 , 24 , 50 , 771 , 113 , 970 , 423 , 294 , 890 , 736 , 667 , 201 , 245 , 374 , 345 , 596 , 365 , 386 , 83 , 928 , 987 , 354 , 773 , 744 , 477 , 841 , 694 , 852 , 939 , 136 , 240 , 628 , 815 , 897 , 325 , 737 , 33 , 211 , 794 , 273 , 244 , 963 , 772 , 607 , 638 , 268 , 57 , 297 , 688 , 617 , 3 , 838 , 255 , 261 , 962 , 461 , 476 };
        ListNode listNode = ListNodeProxy.fromArray(arr);
        //ListNode partition = new Partitioner().partition(listNode, 40);
        ListNode partition = new Partitioner().partition(listNode, 61);
        System.out.println(partition);


    }
}