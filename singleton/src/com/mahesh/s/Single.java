package com.mahesh.s;

public class Single {

    // The field for storing the singleton instance should be declared static
    // volatile as it will be accessed by multiple threads.
    private volatile static Single instance;

    // The Singleton's constructor should always be private to prevent direct construction call with the new keyword.
    private Single() {
    }

    // The static method that control access to the singleton instance.
    public static Single getInstance() {
        String threadName = Thread.currentThread().getName();
        if (instance == null) {
            System.out.println(threadName + ": Instance is null before synchronized");
            synchronized (Single.class) {
                // Ensure that the instance hasn't yet been initialized by another thread while
                // this one has been waiting for the lock's release.
                if (instance == null) {
                    System.out.println(threadName + ": Instance is null after synchronized");
                    instance = new Single();
                }
            }
        }
        return instance;
    }

    public void testMe() {
        System.out.println(
                Thread.currentThread().getName() + ": You are testing Singleton Class: " + instance.hashCode());
    }
}
