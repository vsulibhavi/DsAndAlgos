package leetcodemostliked;

/*
https://leetcode.com/problems/unique-paths/solution/

 */

public class UniquePaths {

  public static int numPathsRecursive(int targetRow, int targetColumn) {

    if (targetRow == 0 || targetColumn == 0) {
      return 1;
    }

    return numPathsRecursive(targetRow - 1, targetColumn) + numPathsRecursive( targetRow,
        targetColumn - 1);
  }

  public static int numPathsDP(int m, int n) {

   int mat[][] = new int[m+1][n+1];

   for(int i=0;i<=n;i++)
   {
     mat[0][i] = 1;
   }
    for(int i=0;i<=m;i++)
    {
      mat[i][0] = 1;
    }

    for(int i=1;i<=m;i++){
      for(int j=1;j<=n;j++){
        mat[i][j] = mat[i-1][j] + mat[i][j-1];
      }
    }

    return mat[m][n];
  }


  public static void main(String[] args) {

    System.out.println(numPathsDP(1,1));

  }
}
