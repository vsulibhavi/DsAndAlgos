package arrays;


public class MaxSum {


    public static void main(String[] args) {

        int[] array = new int[]{-2, -1000, -1};


        //   int maxSum = getMaxSumMyAlgo(array);
        int maxSum = getMaxSum(array);
        System.out.println(maxSum);

    }


    //easiest and fastest
    private static int getMaxSum(int[] a) {
        int currentMax = a[0];
        int maxSoFar = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++){
            currentMax = Math.max(a[i], currentMax);
        maxSoFar = Math.max(maxSoFar, currentMax);

    }
    return maxSoFar;

    }

    private static int getMaxSumMyAlgo(int[] array) {
        int maxSum =Integer.MIN_VALUE;
        int low,high;

        for(int i = 0 ;i < array.length;i++){

            for(int j= i;j<array.length;j++){

                if(sum(array,i,j)> maxSum){
                    maxSum = sum(array,i,j);
                    low = i;
                    high = j;
                }

            }
        }
        return maxSum;
    }
    static int maxSubArraySum(int a[])
    {
        int size = a.length;
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;

        for (int i = 0; i < size; i++)
        {
            max_ending_here = max_ending_here + a[i];
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    private static int sum(int[] array, int i, int j) {

        int sum = 0;
        while(i <= j){

            sum += array[i++];

        }
        return sum;
    }
}
