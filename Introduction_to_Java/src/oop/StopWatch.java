package oop;

import java.time.Instant;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
        startTime = Instant.now().toEpochMilli();
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void start() {
        startTime = Instant.now().toEpochMilli();
    }

    public void stop() {
        endTime = Instant.now().toEpochMilli();
    }

    public long getElapsedTime() {
        if (endTime == 0) {
            return Instant.now().toEpochMilli() - startTime;
        } else {
            return endTime - startTime;
        }
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        int[] numbers = new int[100000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100000);
        }
        stopWatch.start();
        selectionSort(numbers);
        stopWatch.stop();
        long elapsedTime = stopWatch.getElapsedTime();
        System.out.println("Elapsed time: " + elapsedTime + " milliseconds.");
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
