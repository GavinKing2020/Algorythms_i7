package hackerrank;

import java.util.Arrays;

public class BubbleSortSimplyDemo {


    public static int[] bubbleSort (int[] array) {
        boolean isSorted = false;
//        int lastUnsorted = array.length - 1;
        while(!isSorted) {
            isSorted = true;
            for(int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                    isSorted = false;
                }
            }
//            lastUnsorted--;
        }
        return array;
    }

    public static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    public static void main(String[] args) {

        int[] array = {3,6,1,2,5,6,7,8,-5,-2};

        long[] times = new long[100];
        for (int i = 0; i < 100; i++) {
            long start = System.nanoTime();
            System.out.println(Arrays.toString(bubbleSort(array)));
            times[i] = System.nanoTime() - start;
            System.out.println(times[i]);
        }
        long sum = 0;
        for (int i = 1; i < 100; i++) {
            sum += times[i];
        }
        long average = sum/20;
        System.out.println("============");
        System.out.println(average);
    }
}

