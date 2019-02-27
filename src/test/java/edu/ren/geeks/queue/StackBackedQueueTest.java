package edu.ren.geeks.queue;

import org.junit.Test;

public class StackBackedQueueTest {

    StackBackedQueue<Integer> queue = new StackBackedQueue<>();
    @Test
    public void input_1(){
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.print(queue.remove() + " ");
        System.out.print(queue.remove() + " ");
        System.out.print(queue.remove() + " ");
        queue.add(40);
        System.out.print(queue.remove() + " ");
    }

    @Test
    public void input_2(){
        A a = new B();
        System.out.println(((B) a).msg);
    }
}

class A {
    String msg = "hello A";
}
class B extends A {
    String msg = "hello B";
}