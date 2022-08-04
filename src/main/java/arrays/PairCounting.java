package arrays;

import java.util.HashMap;
import java.util.Map;

public class PairCounting {

  /*
  time - O(N)
  Space - O(N)
   */

  public static int countPairs(int arr[],int n,int sum) {

    Map<Integer, Integer> numberCount = new HashMap<>();
    int count = 0;
    for (int i = 0; i < n; i++) {

      if (numberCount.containsKey(sum - arr[i])) {
        count++;
        System.out.println(arr[i] + " " +  (sum - arr[i]));
      }
      if (numberCount.containsKey(arr[i])) {
        numberCount.put(arr[i], numberCount.get(arr[i]) + 1);
      } else
        numberCount.put(arr[i], 1);

    }
    return count;
  }
  public static void main(String[] args) {

     int arr[] = {2,3,4,5,1,2,3,1,5,19,28};
    System.out.println( countPairs(arr,arr.length,5));
  }
}

