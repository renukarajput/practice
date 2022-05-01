package edu.ren.multiThreading;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPoolDemo {
    static StringBuilder stringBuilder = new StringBuilder();

    class NameAppenderRunnable implements Callable<String> {
        String name;

        public NameAppenderRunnable(String name) {
            this.name = name;
        }


        @Override
        public String call() throws Exception {
            stringBuilder.append(name);
            int r=new Random(0).nextInt()%500;
            Thread.sleep(r);
            stringBuilder.append("-");
            return name;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        List<Callable<String>> nameRunnables = new ThreadPoolDemo().getNameRunnables();
        List<Future<String>> futures = executorService.invokeAll(nameRunnables);;
        System.out.println(stringBuilder.toString());
    }

    private List<Callable<String>> getNameRunnables() {
        String[] names = {"renuka", "rakesh", "neha", "smita", "rahul"};

        List<Callable<String>> list = new ArrayList<>();

        for (String name : names) {
            list.add(new NameAppenderRunnable(name));

        }
        return list;
    }
}

