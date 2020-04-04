package arrays;


//https://www.geeksforgeeks.org/find-subarray-with-given-sum/

public class SubArrayWithGivenSum {


    public static void main(String[] args) {

        int arr[] = {1, 4, 20, 3, 10, 5};
        int sum = 6;
        int start = 0, end = 0;
        int sumSoFar = arr[start];

        while (end < arr.length && sumSoFar != sum) {

            if (start == end && sumSoFar > sum) {

                start++;
                end++;
                sumSoFar = arr[start];
            }

            if (sumSoFar < sum) {
                end++;
                sumSoFar += arr[end];

            } else if (sumSoFar > sum) {

                sumSoFar -= arr[start++];

            }

        }
        if (sumSoFar == sum)
            System.out.println(start + " " + end);

    }
}
