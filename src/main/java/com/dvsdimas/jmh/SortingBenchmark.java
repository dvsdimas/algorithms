package com.dvsdimas.jmh;

import com.dvsdimas.sort.*;
import com.dvsdimas.utils.ArrayUtils;
import org.openjdk.jmh.annotations.*;
import javax.annotation.Nonnull;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;

@Fork(value = 1)
@Warmup(iterations = 2, time = 2)
@Measurement(iterations = 8, time = 3)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MICROSECONDS)
@State(Scope.Benchmark)
public class SortingBenchmark {

    private static final int LEN = 100_000;
    private static final long SEED = 1;

    private static @Nonnull final String SORTED = "SORTED";
    private static @Nonnull final String REVERS_SORTED = "REVERS_SORTED";
    private static @Nonnull final String UNSORTED = "UNSORTED";

    private @Nonnull final static Map<String, ISort> sorters = Map.of(BubbleSort.class.getSimpleName(),    BubbleSort.SORTER,
                                                                      ShellSort.class.getSimpleName(),     ShellSort.SORTER,
                                                                      SelectionSort.class.getSimpleName(), SelectionSort.SORTER,
                                                                      InsertionSort.class.getSimpleName(), InsertionSort.SORTER,
                                                                      QuickSort.class.getSimpleName(),     QuickSort.SORTER,
                                                                      MergeSort.class.getSimpleName(),     MergeSort.SORTER);

    @Param({
            "BubbleSort",
            "ShellSort",
            "SelectionSort",
            "InsertionSort",
            "QuickSort",
            "MergeSort"
    })
    private String name;

    @Param({
            SORTED ,
            REVERS_SORTED,
            UNSORTED
    })
    private String type;

    private ISort sorter;
    private int[] arr;

    @Setup(value = Level.Invocation)
    public void setup() {

        sorter = sorters.get(name);

        arr = new int[LEN];

        if(SORTED.equals(type)) {

            for(int i = 0; i < LEN; i++) arr[i] = i;

        } else if(REVERS_SORTED.equals(type)) {

            for(int i = 0; i < LEN; i++) arr[i] = LEN - i;

        } else if(UNSORTED.equals(type)) {

            @Nonnull final Random random = new Random(SEED);

            for(int i = 0; i < LEN; i++) arr[i] = random.nextInt(Integer.MAX_VALUE);

        } else throw new IllegalArgumentException(type);
    }

    @Benchmark
    public void sort() {
        sorter.sort(arr);
    }

    @TearDown(value = Level.Invocation)
    public void shutdown(){
        if(!ArrayUtils.isSorted(arr)) throw new IllegalStateException("Unsorted array");
    }

}
