package kiteshoolalgorithms.sort;

public class InsertionSorting {
    public static void main(String[] args) {

        int[] array = {14,7,2,5,6,7,8,9,3344};
        array = sort(array);
        for(int number : array) {
            System.out.println(number);
        }
    }

    static int[] sort (int[] array) {
        for (int i=1; i<array.length;i++){
            // a real Insertion Sort
            for (int j=i; j>0 && (array[j]<array[j-1]); j--){
                int temp = array[j];
                array[j] = array[j-1];
                array[j-1] = temp;
            }
        }
        return array;
    }


}