package com.dvsdimas.app.sort;

import org.openjdk.jmh.annotations.*;
import javax.annotation.Nonnull;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@Fork(value = 1)
@Warmup(iterations = 2, time = 2)
@Measurement(iterations = 10, time = 3)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@State(Scope.Benchmark)
public class SortingBenchmark {

    private static final int LEN = 1000;

    private static @Nonnull final String SORTED = "SORTED";
    private static @Nonnull final String REVERS_SORTED = "REVERS_SORTED";

    private @Nonnull final static Map<String, ISort> sorters = Map.of(BubbleSort.class.getSimpleName(),    BubbleSort.SORTER,
                                                                      ShellSort.class.getSimpleName(),     ShellSort.SORTER,
                                                                      SelectionSort.class.getSimpleName(), SelectionSort.SORTER,
                                                                      InsertionSort.class.getSimpleName(), InsertionSort.SORTER,
                                                                      QuickSort.class.getSimpleName(),     QuickSort.SORTER,
                                                                      MergeSort.class.getSimpleName(),     MergeSort.SORTER);

    @Param({"BubbleSort", "ShellSort", "SelectionSort", "InsertionSort", "QuickSort", "MergeSort"})
    private String name;

    @Param({SORTED, REVERS_SORTED})
    private String type;

    private ISort sorter;
    private int[] arr;

    @Setup
    public void setup() {

        sorter = sorters.get(name);

        arr = new int[]{LEN};

        if(SORTED.equals(name)) {

            for(int i = 0; i < LEN; i++) arr[i] = i;

        } else if(REVERS_SORTED.equals(name)) {

            for(int i = LEN - 1; i >= 0; i--) arr[i] = i;

        } else throw new IllegalArgumentException();
    }

    @Benchmark
    public void sort() {
        sorter.sort(arr);
    }

}
