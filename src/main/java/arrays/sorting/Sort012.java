package arrays.sorting;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Sort012 {


public static void sort(int[] a) {

    int partition = -1;
    int[] dis = {2, 1};

    for (int un = 0; un < dis.length; un++) {

        partition = -1;
        for (int i = 0; i < a.length; i++) {

            if (a[i] < dis[un]) {

                partition++;
                int temp = a[i];
                a[i] = a[partition];
                a[partition] = temp;
            }
        }
    }
}
  void sortByCounting(int[] arr,int len){

    int zerosCount=0;
    int onesCount=0;
    int twoscount=0;


    for(int i=0;i<len;i++){
        if(arr[i] == 0)
            zerosCount++;
        else if(arr[i] == 1)
            onesCount++;
        else
            twoscount++;

    }

      IntStream.range(0,zerosCount).forEach(i -> arr[i] = 0);
      IntStream.range(zerosCount,onesCount).forEach(i -> arr[i] = 1);
      IntStream.range(onesCount,twoscount).forEach(i -> arr[i] = 2);


}

public static void main(String[] args){

    int arr[] = {1, 2, 0, 1, 0, 2,0};
    int arr_size = arr.length;
    sort(arr);
    Arrays.stream(arr).forEach(n -> System.out.println(n));

    // another simple approach is to count 0's 1's and 2's and then place it in the array
}

}
