package hackerrank;

public class BinarySearch {

    public static boolean binarySearchIterative (int[] array, int x) {

        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + ((right - left) / 2);
            if (array[mid] == x) {
                return true;
            } else if (x < array[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }

    public static boolean binarySearchRecursive (int[] array, int x, int left, int right) {
        if (left > right) {
            return false;
        }

        int mid = left + ((right - left) / 2);
        if (array[mid] == x) {
            return true;
            } else if (x < array[mid]) {
                return binarySearchRecursive(array, x, left, mid - 1);
            } else {
            return binarySearchRecursive(array, x, mid + 1, right);
        }
    }


    public static void main(String[] args) {
        int[] array = {10, 5, 2, 3, 8, 7, 32, 45, 66, 73, 21, 9, 7};
        long start = System.currentTimeMillis();
        System.out.println(binarySearchIterative(array, 6));
        long end = System.currentTimeMillis() - start;
        System.out.println(end);
    }
}
