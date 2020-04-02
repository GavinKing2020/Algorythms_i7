package algorythms_sadgewick;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {

    int[] array =  randomizeByRange(5,1,5);
    System.out.println(Arrays.toString(array));

    int maxElementOfArray = maxArray(array);
    System.out.println(maxElementOfArray);

    System.out.println(averageArray(array));

    }

    /**
    *  static class
    *  input:   int size
    *           int from
    *           int to
    *  output   initialized array
    *
    * */
    public static int[] randomizeByRange (int size, int i_from, int i_to){
        int[] a;
        a = new int[size];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) ((Math.random() * (Math.abs(i_from - i_to) + 1)) + Math.min(i_from, i_to));
        }
        return a;
    }

    /**
     *  static class for find a amx value in array
     *  input:   int array
     *  output   max element from array
     *
     * */
    public static int maxArray (int[] array){
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        return max;
    }

    /**
     * class average array
     * input:       int[] array
     * output:      int average value
    * */
    public static int averageArray (int[] array){
        int N = array.length;
        int sum = 0;
        for (int i = 0; i < N; i++)
            sum += array[i];
        int average = sum / N;
        return average;
    }
}