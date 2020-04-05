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

    private @Nonnull final static Map<String, ISort> sorters = Map.of(BubbleSort.class.getSimpleName(),    BubbleSort.SORTER,
                                                                      ShellSort.class.getSimpleName(),     ShellSort.SORTER,
                                                                      SelectionSort.class.getSimpleName(), SelectionSort.SORTER,
                                                                      InsertionSort.class.getSimpleName(), InsertionSort.SORTER,
                                                                      QuickSort.class.getSimpleName(),     QuickSort.SORTER,
                                                                      MergeSort.class.getSimpleName(),     MergeSort.SORTER);

    @Param({"BubbleSort", "ShellSort", "SelectionSort", "InsertionSort", "QuickSort", "MergeSort"})
    private String name;

    @Param({"1", "2"})
    private int id;

    private ISort sorter;
    private int[] arr;

    @Setup
    public void setup() {
        sorter = sorters.get(name);

        if(id == 1) {
            arr = new int[]{30, 29, 28, 27, 26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        } else if(id == 2) {
            arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
        }
    }

    @Benchmark
    public void sort() {
        sorter.sort(arr);
    }

}
