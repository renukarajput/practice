package edu.ren.datastructure.list.queue;

import edu.ren.datastructure.queue.QueueStack;
import org.junit.Test;

import java.util.NoSuchElementException;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by rakesh on 25/09/17.
 */
public class QueueStackTest {

    @Test
    public void testPopAfterPush() throws Exception {
        QueueStack<Integer> queueStack = new QueueStack<Integer>();
        queueStack.push(10);
        queueStack.push(20);
        queueStack.push(30);
        queueStack.push(40);
        queueStack.push(50);
        assertThat(queueStack.pop(),is(50));
        assertThat(queueStack.pop(),is(40));
        assertThat(queueStack.pop(),is(30));
        assertThat(queueStack.pop(),is(20));
        assertThat(queueStack.pop(),is(10));
    }
    @Test
    public void testPopOfEmpty() throws Exception {
        QueueStack<Integer> queueStack = new QueueStack<Integer>();
        queueStack.push(10);
        assertThat(queueStack.pop(),is(10));
        try {
            queueStack.pop();
            fail("exception did not occur on pop of empty stack ");
        }catch (Exception e){
            assertThat(e,instanceOf(NoSuchElementException.class));
        }
    }

    @Test
    public void testPushAfterPop() throws Exception {
        QueueStack<Integer> queueStack = new QueueStack<Integer>();
        queueStack.push(10);
        queueStack.push(20);
        queueStack.push(30);
        assertThat(queueStack.pop(),is(30));
        queueStack.push(40);
        queueStack.push(50);
        queueStack.push(60);
        assertThat(queueStack.pop(),is(60));
        assertThat(queueStack.pop(),is(50));
        assertThat(queueStack.pop(),is(40));
        assertThat(queueStack.pop(),is(20));
        assertThat(queueStack.pop(),is(10));
    }
}