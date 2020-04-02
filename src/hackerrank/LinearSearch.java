package hackerrank;

import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 3, 2, 6, 7, 8, 9, 34, 23, 12, 4, 5, 6, 3};
        System.out.println(Arrays.toString(LinearSearch(arr,6)));

    }

    public static int[] LinearSearch (int[] arr, int search){
        int[] arr2 = new int[5];
        for (int i=0; i<arr.length; i++) {
            if(arr[i]==search){
                System.out.println(i);
            }
        }
        return arr2;
    }

}
