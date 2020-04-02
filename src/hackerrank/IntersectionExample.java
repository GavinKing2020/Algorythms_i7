package hackerrank;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionExample {

    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2,3,2,3};
        int[] nums2 = new int[]{1,5,6,7,3};

        System.out.println(Arrays.toString(intersection(nums1,nums2)));

    }

    public static int[] intersection (int[] nums1, int[] nums2){

        Set<Integer> set = new HashSet<Integer>();
        for(int i: nums1){
            set.add(i);
        }

        Set<Integer> intersection = new HashSet<Integer>();
        for (int i: nums2){
            if(set.contains(i)){
                intersection.add(i);
            }
        }

        int[] result = new int[intersection.size()];
        int index = 0;
        for(int i: intersection){
            result[index++] = i;
        }

        return result;
    }
}
