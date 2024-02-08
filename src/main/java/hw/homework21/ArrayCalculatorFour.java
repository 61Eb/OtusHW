package hw.homework21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ArrayCalculatorFour {
    public static void main(String[] args) {
        double[] array = new double[100_000_000];

        int numThreads = 4;
        ExecutorService executor = Executors.newFixedThreadPool(numThreads);

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < numThreads; i++) {
            int start = i * (array.length / numThreads);
            int end = (i + 1) * (array.length / numThreads);

            executor.execute(new ArrayCalculationTask(array, start, end));
        }

        executor.shutdown();

        while (!executor.isTerminated()) {
        }

        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        System.out.println("Время исполнения: " + executionTime + " миллисекунд");
    }
}


