package arrays;

public class MaximumSumSubArray {

  //O(n)
  public static void main(String[] args) {

    int[] arr = {-2, -5, 6, -2, -3, 1, 5, -6};
    int maxSum=arr[0];
    int x = arr[0];
    for(int i=1;i<arr.length;i++) {
      if ((arr[i] + x) > arr[i])
        x = arr[i] + x;
      else
        x = arr[i];

      if(x>maxSum){
        maxSum = x;
      }
    }
    System.out.println(maxSum);

  }
}
