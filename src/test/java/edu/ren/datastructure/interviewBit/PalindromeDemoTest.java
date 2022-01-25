package edu.ren.datastructure.interviewBit;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by rrn3194 on 8/7/18.
 */

public class PalindromeDemoTest {

    @Test
        public void input1() {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(2);
        listNode.next.next.next.next = new ListNode(1);
        assertThat(new PalindromeDemo().isListPalindrome(listNode),is(1));
    }

    @Test
        public void input6() {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        assertThat(new PalindromeDemo().isListPalindrome(listNode),is(0));
    }

    @Test
        public void input7() {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(1);
        assertThat(new PalindromeDemo().isListPalindrome(listNode),is(1));
    }

    @Test
        public void input2() {
        ListNode listNode = new ListNode(1);
        assertThat(new PalindromeDemo().isListPalindrome(listNode), is(1));
    }

    @Test
        public void input3() {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(2);
        listNode.next.next.next = new ListNode(1);
        assertThat(new PalindromeDemo().isListPalindrome(listNode), is(1));
    }

    @Test
        public void input4() {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        assertThat(new PalindromeDemo().isListPalindrome(listNode), is(0));
    }

    @Test
        public void input5() {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(1);
        assertThat(new PalindromeDemo().isListPalindrome(listNode), is(1));
    }

}