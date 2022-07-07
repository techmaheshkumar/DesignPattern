package com.mahesh.s;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class SingletonDemo {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Runnable longRunningTask = () -> {
            Single instance = Single.getInstance();
            instance.testMe();
        };

        IntStream.range(0, 2).forEach(i -> executor.submit(longRunningTask));

        executor.shutdown();
    }
}
