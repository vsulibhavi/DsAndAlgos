package arrays;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SumOfCombinations {

  private static ExecutorService es = Executors.newFixedThreadPool(16);
  public static void printCombinations(int arr[],int low,int length) throws InterruptedException {

    if( length - low ==0 )
      return;
    if(length - low  == 1) {
      Thread.sleep(100);
      System.out.println(arr[low] + " " + arr[length]);
      return;
    }

    int mid = (low + length) / 2;
    es.submit(() -> {
      try {
        printCombinations(arr,low, mid);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    });
    es.submit(() -> {
      try {
        printCombinations(arr,mid + 1 , length);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    });

      for (int i = low; i <= mid; i++) {

        for (int j = mid + 1; j <= length; j++) {
          try {
            Thread.sleep(100);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
          System.out.println(arr[i] + " " + arr[j]);
        }
      }
  }

  public static void main(String[] args) throws InterruptedException {

    int arr[] = { 23, 3, 2 , 12 ,43 ,5, 34, 13};
    long starttime = System.currentTimeMillis();
    printCombinations(arr,0,arr.length-1);
    System.out.println(System.currentTimeMillis() - starttime);
  }
}
