package arrays;

import java.util.Arrays;
import java.util.stream.Collectors;

public class MissingNumberInArray {


  public static void main(String[] args) {
    int N = 10;
    int A[] = {6,1,2,8,3,4,7,10,5};

    System.out.println(findTheMissingNumber(A,N));

  }

  private static Integer findTheMissingNumber(int[] a, int n) {

     return (n * (n+1)/2) - Arrays.stream(a).sum();


  }

}


/*
6,1,2,8,3,4,7,10,5





 */