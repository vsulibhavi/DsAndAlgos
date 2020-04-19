package backtracking;

import java.util.Arrays;

public class FindTripletsWithZeroSum {

    public static int count;

    public static void main(String[] args) {


        //    int arr[] = {-2, -1, 2, -3, 1, 0};
        int arr[] = new int[100];

        for (int i = 1; i < 100; i++) {
            arr[i] = i;
        }



        findTriplets(arr, 0, new int[3], 2);
    }

    private static void findTriplets(int[] arr, int start, int[] triplets, int leftSlots) {
        System.out.println(count++);

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

//todo sinci both the recursion are different subproblems master theorem cannot be applied , Akra Bazzi  ?