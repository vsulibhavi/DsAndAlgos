package arrays.sorting;

public class InsertionSort {


    public static void main(String[] args){


        int[] arr = {3,4,32,1,322,7,91};

        insertionSort(arr);

        for(int a : arr){

            System.out.print(a + " ");
        }
    }

    private static void insertionSort(int[] arr) {


        for (int i = 1; i < arr.length; i++) {

            int j = i;
            int item = arr[j];
            while (j > 0 && arr[j - 1] > item) {
                arr[j] = arr[j - 1];
                j--;

            }
            arr[j] = item;

        }

    }
}
