package edu.ren.corejava;

import static java.lang.Thread.sleep;

public class Shutdownhook {
    public static void main(String[] args) throws InterruptedException {
        //Runtime.getRuntime().addShutdownHook(Thread.currentThread());
        Runtime.getRuntime().addShutdownHook(new Thread(()->{
            System.out.println("ran hook");
        }));
        while (true){
            sleep(500);
        }
    }

}
