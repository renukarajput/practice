package edu.ren.multiThreading;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ThreadDemo {
    static StringBuilder stringBuilder = new StringBuilder();

    class NameAppenderRunnable implements Runnable {
        String name;

        public NameAppenderRunnable(String name) {
            this.name = name;
        }


        @Override
        public void run() {
            stringBuilder.append(name+"-");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        List<Runnable> nameRunnables = new ThreadDemo().getNameRunnables();
        for (Runnable r : nameRunnables) {
            new Thread(r).start();
        }
        Thread.sleep(2000);
        System.out.println(stringBuilder.toString());
    }

    private List<Runnable> getNameRunnables() {
        String[] names = {"renuka", "rakesh", "neha", "smita", "rahul","abhishek","sweta"};

        List<Runnable> list = new ArrayList<>();

        for (String name : names) {
            list.add(new NameAppenderRunnable(name));

        }
        return list;
    }
}

