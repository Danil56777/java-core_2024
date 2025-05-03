package lr12;

import java.util.concurrent.*;

public class Example6 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int sum = calculateSum(array);
        System.out.println("Сумма элементов массива: " + sum);
    }

    public static int calculateSum(int[] array) {
        int numThreads = Runtime.getRuntime().availableProcessors();
        ExecutorService executor = Executors.newFixedThreadPool(numThreads);

        int chunkSize = array.length / numThreads;
        Future<Integer>[] futures = new Future[numThreads];

        for (int i = 0; i < numThreads; i++) {
            final int start = i * chunkSize;
            final int end = (i == numThreads - 1) ? array.length : start + chunkSize;

            futures[i] = executor.submit(() -> {
                int localSum = 0;
                for (int j = start; j < end; j++) {
                    localSum += array[j];
                }
                return localSum;
            });
        }

        int totalSum = 0;
        try {
            for (Future<Integer> future : futures) {
                totalSum += future.get();
            }
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
        }

        return totalSum;
    }
}