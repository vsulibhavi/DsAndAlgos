package arrays.sorting;

import java.util.Arrays;

public class QuickSort {


public static void main(String[] args){
    int[] arr = {3,4,32,1,322,7,91,Integer.MAX_VALUE};

    quickSort(arr,0,arr.length-1 );

    Arrays.stream(arr).forEach(System.out::println);
}

    private static void quickSort(int[] arr,int low,int high) {

    if(low<high) {
        int p = partition(arr, low, high);
        quickSort(arr, low, p );
        quickSort(arr, p + 1, high);
    }
    }

    private static int partition(int[] arr, int low, int high) {

    int pivot = low;
    while(low<high){

        do{

            low ++;
        }while (arr[low]<=arr[pivot]);

        do{

            high--;
        }while (arr[high]>arr[pivot] );

        if(low<high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
        }
        }

    int temp = arr[high];
    arr[high] = arr[pivot];
    arr[pivot] = temp;

    return high;
    }
}
