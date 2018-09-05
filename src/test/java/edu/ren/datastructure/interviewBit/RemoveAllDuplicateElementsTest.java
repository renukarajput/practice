package edu.ren.datastructure.interviewBit;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by rrn3194 on 8/24/18.
 */
public class RemoveAllDuplicateElementsTest {

    @Test
    public void removeAllDuplicates() {
        ListNode listNode = ListNodeProxy.fromArray(new int[]{1, 2, 3, 3, 5});
        new RemoveAllDuplicateElements().removeAllDuplicates(listNode);
        assertThat(ListNodeProxy.stringFromListNode(listNode), is("1->2->5"));
    }

    @Test
    public void removeAllDuplicates1() {
        ListNode listNode = ListNodeProxy.fromArray(new int[]{1, 1, 2, 3});
        ListNode output = new RemoveAllDuplicateElements().removeAllDuplicates(listNode);
        assertThat(ListNodeProxy.stringFromListNode(output), is("2->3"));
    }

    @Test
    public void removeAllDuplicates2() {
        ListNode listNode = ListNodeProxy.fromArray(new int[]{1, 2, 2, 2, 2, 2, 2, 2, 3});
        new RemoveAllDuplicateElements().removeAllDuplicates(listNode);
        assertThat(ListNodeProxy.stringFromListNode(listNode), is("1->3"));
    }

    @Test
    public void removeAllDuplicates3() {
        ListNode listNode = ListNodeProxy.fromArray(new int[]{1, 2, 3, 3, 4, 4, 5});
        new RemoveAllDuplicateElements().removeAllDuplicates(listNode);
        assertThat(ListNodeProxy.stringFromListNode(listNode), is("1->2->5"));
    }

    @Test
    public void removeAllDuplicates4() {
        ListNode listNode = ListNodeProxy.fromArray(new int[]{1, 2, 3, 3, 4, 4, 5, 5});
        new RemoveAllDuplicateElements().removeAllDuplicates(listNode);
        assertThat(ListNodeProxy.stringFromListNode(listNode), is("1->2"));
    }
}
