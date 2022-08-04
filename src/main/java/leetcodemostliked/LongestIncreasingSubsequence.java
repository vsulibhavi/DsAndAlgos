package leetcodemostliked;


//solved by DP
public class LongestIncreasingSubsequence {

  public static int lis(int arr[], int len) {

    int lis[] = new int[len + 1];

    for (int i = len; i >= 0; i--) {

      int maxLen = 1;
      for (int j = i + 1; j <= len; j++) {

        if (arr[i] < arr[j]) {
           if( (1 + lis[j]) > maxLen)
             maxLen =  1 + lis[j];
        }
        else{
          if( lis[j] > maxLen)
            maxLen = lis[j];
        }

      }
      lis[i] = maxLen;
    }

    return lis[0];


  }

  public static void main(String[] args) {

    int arr[] = {7,7,7,7,7,7,7};
   System.out.println( lis(arr, arr.length - 1));


  }
}
