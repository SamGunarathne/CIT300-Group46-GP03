package app;

import algorithms.*;
import utils.ArrayGenerator;
import java.util.Arrays;

public class Main {

    static int[] sizes = {100, 500, 1000};

    public static void main(String[] args) {
        System.out.println("===== Algorithm Performance Analyzer =====\n");

        testLinearSearch();
        testBinarySearch();
        testBubbleSort();
        testQuickSort();
    }

    // -------------------------------
    // MEMBER 1 – Linear Search
    // -------------------------------
    public static void testLinearSearch() {
        System.out.println("Algorithm: Linear Search");
        System.out.println("Input Size | Time (ns)");
        System.out.println("------------------------");

        for (int size : sizes) {
            int[] arr = ArrayGenerator.generateArray(size);
            int target = arr[size - 1]; // worst-case search

            long start = System.nanoTime();
            LinearSearch.search(arr, target);
            long end = System.nanoTime();

            System.out.println(size + "\t\t| " + (end - start));
        }
        System.out.println();
    }

    // -------------------------------
    // MEMBER 2 – Binary Search
    // -------------------------------
    public static void testBinarySearch() {
        System.out.println("Algorithm: Binary Search");
        System.out.println("Input Size | Time (ns)");
        System.out.println("------------------------");

        for (int size : sizes) {
            int[] arr = ArrayGenerator.generateArray(size);
            Arrays.sort(arr); // must be sorted
            int target = arr[size - 1];

            long start = System.nanoTime();
            BinarySearch.search(arr, target);
            long end = System.nanoTime();

            System.out.println(size + "\t\t| " + (end - start));
        }
        System.out.println();
    }

    // -------------------------------
    // MEMBER 3 – Bubble Sort
    // -------------------------------
    public static void testBubbleSort() {
        System.out.println("Algorithm: Bubble Sort");
        System.out.println("Input Size | Time (ns)");
        System.out.println("------------------------");

        for (int size : sizes) {
            int[] arr = ArrayGenerator.generateArray(size);

            long start = System.nanoTime();
            BubbleSort.sort(arr);
            long end = System.nanoTime();

            System.out.println(size + "\t\t| " + (end - start));
        }
        System.out.println();
    }

    // -------------------------------
    // MEMBER 4 – Quick Sort
    // -------------------------------
    public static void testQuickSort() {
        System.out.println("Algorithm: Quick Sort");
        System.out.println("Input Size | Time (ns)");
        System.out.println("------------------------");

        for (int size : sizes) {
            int[] arr = ArrayGenerator.generateArray(size);

            long start = System.nanoTime();
            QuickSort.sort(arr, 0, arr.length - 1);
            long end = System.nanoTime();

            System.out.println(size + "\t\t| " + (end - start));
        }
        System.out.println();
    }
}

