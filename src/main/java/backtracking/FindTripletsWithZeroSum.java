package backtracking;

import java.util.Arrays;

public class FindTripletsWithZeroSum {

    public static int count;

    public static void main(String[] args) {


        int arr[] = {-2, -1, 2, -3, 1, 0};
//        int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

        findTriplets(arr, 0, new int[3], 2);
    }

    private static void findTriplets(int[] arr, int start, int[] triplets, int leftSlots) {
        //  System.out.println(count++);

        if (Arrays.stream(triplets).sum() == 0 && leftSlots == -1) {
            Arrays.stream(triplets).forEach(num -> System.out.print(num + " "));
            System.out.println("");
            return;
        }
        if (leftSlots == -1) {
            return;
        }

        if (start >= arr.length) {
            return;
        }

        int[] newTriplets = triplets.clone();
        newTriplets[2 - leftSlots] = arr[start];
        findTriplets(arr, start + 1, newTriplets, leftSlots - 1);
        findTriplets(arr, start + 1, triplets, leftSlots);

    }
}
