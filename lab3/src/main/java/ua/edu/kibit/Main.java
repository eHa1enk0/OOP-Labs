package ua.edu.kibit;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {
        int size = 20_000_000;
        double[] arr = new double[size];
        double step = 20.0 / size;

        int threads = 5;

        for (int i = 0; i < size; i++) {
            arr[i] = -10 +  i * step;
        }

        long milli = System.currentTimeMillis();

        ExecutorService executor = Executors.newFixedThreadPool(threads);
        Future[] futures = new Future[arr.length];

        int chunk = size / threads;
        for (int i = 0; i < arr.length; i = i + chunk) {
            int end = Math.min(i + chunk, arr.length);
            executor.execute(new CalculatePlotTask(arr, i, end, new MyTrigFunc()));
        }

        long milli2 = System.currentTimeMillis();
        System.out.println("Time taken: " + (milli2 - milli) + " ms");
        PlotDisplayer.showChart(arr, step);
    }
}
