package kiteshoolalgorithms.sort;

public class SelectionSorting {
    public static void main(String[] args) {

        // Sort
        // Selection - because we "select" min element first !

        int[] arr = {12, 2, 4, 5, 0, 1};

        for (int i=0; i<arr.length; i++) {
            int min = i;
            for (int j=i+1; j<arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            // swap
            int tmp = arr[i];
            arr[i] = arr[min];
            arr[min] = tmp;
        }
        for (int number : arr){
            System.out.println(number);
        }
    }
}
