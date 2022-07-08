package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class AiEqI {

  //using hashset
  public static void rearrange(int arr[]) {

    HashSet<Integer> integers = new HashSet();

    Arrays.stream(arr).forEach(integers::add);

    for (int i = 0; i < arr.length; i++) {

      if (integers.contains(i)) {
        arr[i] = i;
      } else {
        arr[i] = -1;
      }

    }
  }

    public static void rearrange_using_swap(int[] arr,int n){

      for(int i=0;i<n;i++){

        if(arr[i]!=-1 && arr[i] != i){

          int temp1 =  arr[i];
          int temp2 = arr[arr[i]];
          arr[i] =  temp2;
          arr[temp1] = temp1;
        }
      }

    }


  public static void main(String[] args) {

    int[] arr = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
    rearrange_using_swap(arr,arr.length);
    Arrays.stream(arr).forEach(i -> System.out.print(" " + i));

  }

}
