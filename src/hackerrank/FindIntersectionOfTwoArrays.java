package hackerrank;

import java.util.Arrays;
import java.util.HashSet;

public class FindIntersectionOfTwoArrays {
    public static void main(String[] args) {
        Integer arr1[] = {2, 6, 7, 8, 9};
        Integer arr2[] = {6, 9, 10};

        /**
         Take two indexes,
         and initialize with zero.
         */
//        int i = 0;
//        int j = 0;
//
//        while(i < arr1.length && j < arr2.length) {
//            if(arr1[i] == arr2[j]) {
//                System.out.println(arr1[i]);
//                i++;
//                j++;
//            } else if(arr1[i] > arr2[j]) {
//                j++;
//            } else {
//                i++;
//            }
//        }

//        //Declare hashset
//        HashSet<Integer> set1 = new HashSet();
//
//        //Traverse an array, put each element in a set
//        for(int val: arr1){
//            set1.add(val);
//        }
//
//        /**
//         Traverse second array values,
//         Search the value in a set (set1),
//         If element is found then print it.
//         */
//        for(int val: arr2){
//            if(set1.contains(val)){
//                System.out.println(val);
//            }
//        }

        HashSet set1 = new HashSet<>(Arrays.asList(arr1));
        HashSet set2 = new HashSet<>(Arrays.asList(arr2));

        set1.retainAll(set2);
        System.out.println(set1);

    }
}
