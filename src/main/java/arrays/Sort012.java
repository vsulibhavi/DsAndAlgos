package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Sort012 {


public static void sort(int[] a){

    int partition = -1;
    int[] dis = {2,1};

    for(int un = 0;un<dis.length;un++){

        partition = -1;
        for(int i=0;i<a.length;i++){

            if(a[i] < dis[un]){

                partition++;
                int temp = a[i];
                a[i] = a[partition];
                a[partition] = temp;
            }
        }
    }



}

public static void main(String[] args){

    int arr[] = {3,1, 2, 0, 1, 0, 2,3};
    int arr_size = arr.length;
    sort(arr);
    Arrays.stream(arr).forEach(n -> System.out.println(n));

}

}
