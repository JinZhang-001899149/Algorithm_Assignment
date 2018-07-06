/*
 * Copyright (c) 2018. Phasmid Software
 */

package algorithm_assignment_3;


import java.util.Random;
import java.util.function.Function;

public class Benchmark<T> {

    public Benchmark(Function<T, Void> f) {
        this.f = f;
    }

    public double run(T t, int n) {
        int m = n;

        for(int i = 0; i < 10; i++){
            f.apply(t);
        }

        long totaltime = 0;
        for(int i = 0; i < m; i++){
            long starttime = System.nanoTime();
            f.apply(t);
            long estimatedtime = System.nanoTime() - starttime;
            totaltime = totaltime + estimatedtime;
        }
        double ave = totaltime / m;
        return ave;  // TODO
    }

    private final Function<T, Void> f;

    private static Integer[] arr;//refresh array

    public static void main(String[] args) {
        int m = 10; // This is the number of repetitions: sufficient to give a good mean value of timing

        //ordered
        System.out.println("When the array is ordered:");
        Integer[] array1 = new Integer[10000];
        for (int i = 0; i < 10000; i++) array1[i] = i;
        int n1 = 100;
        for(int j = 0; j < 5; j++){
            n1 = n1 * 2;
            // TODO You need to apply doubling to n
            benchmarkSort(array1, n1, "SelectionSort", new SelectionSort<>(), m);
            benchmarkSort(array1, n1, "InsertionSort", new InsertionSort<>(), m);
        }
        System.out.println(" ");

        //random
        System.out.println("When the array is all random:");
        Integer[] array2 = new Integer[10000];
        for (int i = 0; i < 10000; i++){
            Random r = new Random();
            array2[i] = r.nextInt(10000);
        }
        int n2 = 100;
        for(int j = 0; j < 5; j++){
            n2 = n2 * 2;
            benchmarkSort(array2, n2, "SelectionSort", new SelectionSort<>(), m);
            benchmarkSort(array2, n2, "InsertionSort", new InsertionSort<>(), m);
        }
        System.out.println(" ");

        //reverse
        System.out.println("When the array is reverse:");
        Integer[] array3 = new Integer[10000];
        int p = 9999;
        for (int i = 0; i < 10000; i++){
            array3[i] = p;
            p--;
        }
        int n3 = 100;
        for(int j = 0; j < 5; j++){
            n3 = n3 * 2;
            benchmarkSort(array3, n3, "SelectionSort", new SelectionSort<>(), m);
            benchmarkSort(array3, n3, "InsertionSort", new InsertionSort<>(), m);
        }
    }

    private static void benchmarkSort(Integer[] xs, Integer n, String name, Sort<Integer> sorter, int m) {
        Function<Integer, Void> sortFunction = (x) -> {
            arr = xs;
            sorter.sort(arr, 0, x);
            return null;
        };
        Benchmark<Integer> bm = new Benchmark<>(sortFunction);
        double x = bm.run(n, m);
        System.out.println(name + ": " + x + " millisecs for n=" + n);
    }
}
