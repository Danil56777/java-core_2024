package lr12;

import java.util.concurrent.*;

public class Example5 {
    public static void main(String[] args) {
        int[] array = {3, 7, 12, 5, 9, 1, 18, 4, 6, 11, 2, 15, 8, 10, 13};
        int max = findMaxElement(array);
        System.out.println("Максимальный элемент в массиве: " + max);
    }

    public static int findMaxElement(int[] array) {
        int numThreads = Runtime.getRuntime().availableProcessors();
        ExecutorService executor = Executors.newFixedThreadPool(numThreads);

        int chunkSize = array.length / numThreads;
        Future<Integer>[] futures = new Future[numThreads];

        for (int i = 0; i < numThreads; i++) {
            final int start = i * chunkSize;
            final int end = (i == numThreads - 1) ? array.length : start + chunkSize;

            futures[i] = executor.submit(() -> {
                int localMax = Integer.MIN_VALUE;
                for (int j = start; j < end; j++) {
                    if (array[j] > localMax) {
                        localMax = array[j];
                    }
                }
                return localMax;
            });
        }

        int globalMax = Integer.MIN_VALUE;
        try {
            for (Future<Integer> future : futures) {
                int localMax = future.get();
                if (localMax > globalMax) {
                    globalMax = localMax;
                }
            }
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
        }

        return globalMax;
    }
}
