package ua.edu.kibit;

import java.util.concurrent.Callable;

public class CalculatePlotTask implements Runnable {
    private final double[] arr;

    private final int start;

    private final int end;

    private Calculable function;

    public CalculatePlotTask(double[] arr, int start, int end, Calculable function) {
        this.arr = arr;
        this.start = start;
        this.end = end;
        this.function = function;
    }

    @Override
    public void run() {
        for (int i = start; i < end; i++) {
            arr[i] = function.calculate(arr[i]);
        }
    }
}
