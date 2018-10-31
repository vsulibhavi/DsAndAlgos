package dynamicProgramming;

public class MinimumEditDistance {

   static String s1 = "vishal is the best person in this world ",s2="vishal is jdk best perdon in this world ";
    static int[][] cache = new int[s1.length()+1][s2.length()+1];

public static void main(String[] args){

    initialize(cache,s1.length(),s2.length());
    long startTime = System.nanoTime();
    System.out.println(cachedMinEditDistance(s1.toCharArray(),s2.toCharArray(),s1.length(),s2.length()) + "total time " + (System.nanoTime() - startTime));
    startTime = System.nanoTime();
    System.out.println(tabularMinEditDistance(s1.toCharArray(),s2.toCharArray(),s1.length(),s2.length())  + "total time " + (System.nanoTime() - startTime));

}

    private static int tabularMinEditDistance(char[] s1, char[] s2, int m, int n) {

         int[][] minDistanceTable = new int[s1.length][s2.length];

         for(int i=0;i<s1.length;i++){
             for (int j=0;j<s2.length;j++){

                 minDistanceTable[i][j] = calculateMinDistance(minDistanceTable,s1,s2,i,j);
             }
         }


    return minDistanceTable[m-1][n-1];
    }

    private static int calculateMinDistance(int[][] minDistanceTable,char[] s1, char[] s2, int i, int j) {

        if(i == 0)
            return j;
        if(j == 0)
            return i;

        if(s1[i] == s2[j]) return minDistanceTable[i-1][j-1];
        return Math.min(Math.min(1+minDistanceTable[i][j-1],1+minDistanceTable[i-1][j]),1+minDistanceTable[i-1][j-1]);

    }

    private static void initialize(int[][] cache,int m , int n) {

        for(int i = 0 ;i<=m;i++){
            for(int j=0;j<=n;j++){
                cache[i][j]=Integer.MIN_VALUE;
            }
        }
    }

    private static int cachedMinEditDistance(char[] s1, char[] s2, int m, int n) {

        if(cache[m][n] == Integer.MIN_VALUE) {
            cache[m][n]  =  minEditDistance(s1, s2, m, n);
            return cache[m][n];
        }
        else
            return cache[m][n];
    }

    private static int minEditDistance(char[] s1, char[] s2,int m,int n) {

        if(m == 0)
            return n;
        if(n == 0)
            return m;

        if(s1[m-1] == s2[n-1])
            return cachedMinEditDistance(s1,s2,m-1,n-1);

       return Math.min(Math.min(1 + cachedMinEditDistance(s1,s2,m,n-1),1 + cachedMinEditDistance(s1,s2,m-1,n)),1+ cachedMinEditDistance(s1,s2,m-1,n-1));


    }





}
