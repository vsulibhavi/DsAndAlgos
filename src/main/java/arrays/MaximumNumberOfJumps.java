package arrays;

import java.util.Arrays;

public class MaximumNumberOfJumps {


  static int maxJumps(int[] arr,int pos,int length){

    if(pos>length-1)
      return Integer.MAX_VALUE;

    if(pos == length -1)
      return 0;


    int steps = arr[pos];
    int[] jumps = new int[steps + 1];

    if(steps == 0)
      return Integer.MAX_VALUE;

    for(int i=1;i<=steps;i++){

      System.out.println("jump"+"[" + pos + "," + ((pos+i) >=length?-1:pos + i) + "]" );
      jumps[i] = maxJumps(arr,pos+i,length);


    }
    int min = Integer.MAX_VALUE;
    int stepTaken=0;
    for(int i=1;i<=steps;i++)
      {
          if(jumps[i] < min){
            min = jumps[i];
            stepTaken = i;
          }

      }
    return min + 1;




  }

  public static void main(String[] args) {

     int arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};

    System.out.println(maxJumps(arr,0,arr.length));

  }
}
