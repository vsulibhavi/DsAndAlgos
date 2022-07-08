package arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayRotation {

  // time complexity - O(n*d)
  public static void rotate_bruteForce(int arr[],int d,int n){

     for(int i=0;i<d;i++){

      int  rotatedElement = arr[0];
      for(int j=1;j<n;j++){

        arr[j-1] = arr[j];
      }
      arr[n-1] = rotatedElement;
     }
  }

  /*reversal algorithm
   https://www.geeksforgeeks.org/program-for-array-rotation-continued-reversal-algorithm/
Reverse A to get ArB, where Ar is the reverse of A.
Reverse B to get ArBr, where Br is the reverse of B.
Reverse all to get (ArBr) r = BA.

   */

  public static void rotateByReverseApproach(int arr[],int d,int n){

    reverse(arr,0,d);
    System.out.println("");
    Arrays.stream(arr).forEach(System.out::print);
    reverse(arr,d,n);
    System.out.println("");
    Arrays.stream(arr).forEach(System.out::print);
    reverse(arr,0,n);


  }

  private static void reverse(int[] arr, int a, int n) {

    for(int i=a;i< (a + n)/2;i++){

      swap(arr,i,n-1-(i-a));

    }

  }

  private static void swap(int arr[],int i, int i1) {

    int temp = arr[i];
    arr[i] = arr[i1];
    arr[i1] = temp;
  }

  public static void main(String[] args) {

    int[] arr = new int[10];

    IntStream.range(0,7).forEach(i -> arr[i] = i);
    Arrays.stream(arr).forEach(System.out::print);
    rotateByReverseApproach(arr,3,7);
    System.out.println("");
    Arrays.stream(arr).forEach(System.out::print);

  }


}

// 1 2 3 4 5 6 7
//2 1 7 6 5 4 3

//3 4 5 6 7 1 2

// 1 2 3 4 5