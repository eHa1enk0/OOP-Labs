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

        long milli2 = System.currentTimeMillis();
        System.out.println("Time taken: " + (milli - milli2) + " ms");
        PlotDisplayer.showChart(arr, step);
    }
}
