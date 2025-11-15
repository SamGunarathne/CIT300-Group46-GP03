package utils;
import java.util.Random;

public class ArrayGenerator {

    // Generates a random int array of given size
    public static int[] generateArray(int size) {
        Random random = new Random();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(10000); // random numbers 0–9999
        }
        return arr;
    }

    // Creates a deep copy so each algorithm gets the same input
    public static int[] copyArray(int[] arr) {
        int[] newArr = new int[arr.length];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        return newArr;
    }
}
