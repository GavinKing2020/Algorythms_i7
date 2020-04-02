package yusenzhang;

import java.util.*;

public class Solution {
    public static void main(String[] args) {

//        int[] nums1 =  {1,2,3,4,5,6};
//        int[] nums2 =  {1,7,3,6,8};
//        int[] result = intersect(nums1, nums2);
//        System.out.println(Arrays.toString(result));
//
//        int[] result2 = intersect2(nums1, nums2);
//        System.out.println(Arrays.toString(result));

        lowestCommonAncestor();


    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        Queue<Integer> queue = new LinkedList<Integer>();
            for(int num : nums1)
                    map.put(num, map.getOrDefault(num,0) + 1);
            for(int num : nums2) {
                if(map.containsKey(num) && map.get(num) > 0) {
                    queue.offer(num);
                    map.put(num,map.get(num) - 1);
                }
            }
            int i = 0;
            int[] result = new int [queue.size()];
            while(!queue.isEmpty())
                result[i++] = queue.poll();
            return result;
    }


    /*
    *   [1, 2, 3, 4, 5]
    *    #
    *
    *   [2, 3, 4, 5, 6]
    *    #
    *
    *
    * */

    public static int[] intersect2 (int[] a, int[] b){

        if (a == null || b == null) {
            return null;
        }

        if (a.length == 0 || b.length == 0) {
            return new int[0];
        }

        Arrays.sort(a);
        Arrays.sort(b);

        Set<Integer> result = new HashSet<Integer>();
        int i = 0;
        int j = 0;
        while (i < a.length && j < b.length) {
            if (a[i] == b[j]) {
                result.add(a[i]);
                i++;
                j++;
            }
            else if (a[i] < b[j]) {
                i++;
            }
            else {
                j++;
            }
        }
        return toInt(result);
    }

    public static int[] toInt(Set<Integer> set) {
        int[] a = new int[set.size()];
        int i = 0;
        for (Integer val : set) a[i++] = val;
        return a;
    }


    public static void lowestCommonAncestor(){



    }


}
