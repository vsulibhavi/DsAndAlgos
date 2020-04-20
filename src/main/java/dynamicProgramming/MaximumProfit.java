package dynamicProgramming;

import java.util.Arrays;

public class MaximumProfit {


    public static void main(String[] args) {

        int[] price = new int[]{10, 22, 5, 75, 65, 80};
        int k = 2;

        System.out.println(maximumProfitSubProbRec(price, price.length - 1, k));
        System.out.println(maxProfitDP(price, price.length, k));

        int[] price2 = new int[]{12, 14, 17, 10, 14, 13, 12, 15};
        int k2 = 3;

        System.out.println(maximumProfitSubProbRec(price2, price2.length - 1, k2));
        System.out.println(maxProfitDP(price2, price2.length, k2));
    }

    //subproblmes - maxProf(a[n],k) =  Math.max( ( a[n-1] - a[n-2-i]) + maxProf(a[n-2-i],k-1),
    // maxProf(a[n-2-i],k)

    private static int maximumProfitSubProbRec(int[] price, int n, int k) {


        if (k == 0 || n < 1) return 0;

        int a[] = new int[n];
        for (int i = 0; i < n; i++) {

            a[i] = Math.max((price[n] - price[n - i - 1]) + maximumProfitSubProbRec(price, n - 2 - i, k - 1),
                    maximumProfitSubProbRec(price, n - 1 - i, k));
        }
        return Arrays.stream(a).max().getAsInt();
    }


    private static int maxProfitDP(int[] price, int n, int k) {

        int maxProfit[][] = new int[n][k + 1];

        for (int j = 0; j <= k; j++) {

            maxProfit[0][j] = 0;
        }

        for (int i = 0; i < n; i++) {

            maxProfit[i][0] = 0;
        }

        for (int i = 1; i < n; i++) {

            int a[] = new int[i + 1];
            for (int j = 1; j <= k; j++) {

                for (int l = 0; l < i; l++) {
                    int earlierNValue = i - 2 - l < 0 ? 0 : i - 2 - l;
                    a[l] = Math.max(price[i] - price[i - 1 - l] + maxProfit[earlierNValue][j - 1],
                            maxProfit[i - 1 - l][j]);
                }
                maxProfit[i][j] = Arrays.stream(a).max().getAsInt();
            }

        }
        return maxProfit[n - 1][k];
    }

}
