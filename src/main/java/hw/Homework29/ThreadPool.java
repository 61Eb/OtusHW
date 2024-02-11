package hw.Homework29;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
    public static void main(String[] args) {
        // Create a thread pool with a fixed number of threads
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Submit tasks to the thread pool
        executor.submit(new Task("A", 5));
        executor.submit(new Task("B", 5));
        executor.submit(new Task("C", 5));

        // Shutdown the thread pool after all tasks are completed
        executor.shutdown();
    }
}