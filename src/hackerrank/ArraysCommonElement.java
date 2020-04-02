package hackerrank;

import java.util.Arrays;

public class ArraysCommonElement {

    public static void main(String[] args) {

        // init arrays
        int[] arr1 = new int[] {1,2,3,4,5,6};
        int[] arr2 = new int[] {1,2,3};

        // init result array
        int arrayLength = 0;
        if (arr1.length < arr2.length) {
            arrayLength = arr1.length;
        } else {
            arrayLength = arr2.length;
        }
        int[] result = new int[arrayLength];

        // check duplicates
        for (int i=0; i<arr1.length; i++) {
            for (int j=0; j<arr2.length; j++){
                if(arr1[i]==arr2[j]){
                    result[i] = arr1[i];
                }
            }
        }
        System.out.println(Arrays.toString(result));

    }


}
