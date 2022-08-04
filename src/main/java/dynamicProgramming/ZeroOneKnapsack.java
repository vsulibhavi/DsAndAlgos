package dynamicProgramming;


// the intuition of DP

/*
 An optimization problem is where given some constraint and items we try to optimize for some
results .
optmization problem can be broken down to smaller problem and an optimal solution can be identified for the sub problem
the subproblems can occur again and again better to cache the results to reduce the timecomplexity

in the case of knapsack the timecomplexity is reduced from 2^n to O(number of items * total capacity of the knapsack)


 */

public class ZeroOneKnapsack {

    private static int v[] = {0,10, 40, 30, 50};
    private static int w[] = {0,5, 4, 6, 3};

    private static int[][] topdownCache = new int[v.length + 1][11];

    private static int[][] bottomUp = new int[v.length + 1][11];

    public static void main(String[] args){


        int maxWieght = 10;


      System.out.println(  maxValue(maxWieght,v.length));
        System.out.println(  maxValueDpBottomUp(maxWieght,4));
    }

    private static int maxValueDpBottomUp(int maxWeight,int totalItems ) {


        for(int i=0;i<maxWeight;i++) {
            bottomUp[0][i] = 0;

        }
        for(int i=0;i<totalItems;i++) {
            bottomUp[i][0] = 0;

        }

        for(int i=1;i<=totalItems;i++){
            for(int j=1;j<=maxWeight;j++){

                if(w[i] > j) {
                    bottomUp[i][j] = bottomUp[i-1][j];
                }
                else {
                    bottomUp[i][j] = Math.max(v[i] + bottomUp[i-1][j-w[i]], bottomUp[i-1][j]);
                }
            }
        }

        return bottomUp[totalItems][maxWeight];


    }

    //the is a recursion tree with max branching as 2 , the complexity is o(2^n)
    private static int maxValue(int maxWeight,int totalItems ){

        int result;
        if(topdownCache[totalItems][maxWeight] != 0 ) return  topdownCache[totalItems][maxWeight];
        if(totalItems==0 || totalItems ==0 ) return 0;
        if(maxWeight - w[totalItems-1] < 0) {
            result = maxValue(maxWeight, totalItems - 1);
        }
        else{
            result = Math.max(v[totalItems-1] + maxValue(maxWeight - w[totalItems-1],totalItems -1),
                maxValue( maxWeight,totalItems -1));
        }
        topdownCache[totalItems][maxWeight] = result;
        return result;

    }

}
