package leetcodemostliked;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class MinSumInGrid {

  public static int minPathSum(int[][] grid) {



    return solveDP(grid,grid.length-1,grid[0].length-1);

  }

  public static int solveDP(int[][] grid,int m,int n){

    int[][] soln = new int[m+1][n+1];

    soln[0][0] = grid[0][0];

    for(int i=1;i<=m;i++){
      soln[i][0] = grid[i][0] + soln[i-1][0];
    }
    for(int i=1;i<=n;i++) {
      soln[0][i] = grid[0][i] + soln[0][i - 1];
    }


      for(int i=1;i<=m;i++){
        for(int j=1;j<=n;j++){

        soln[i][j] = Math.min(grid[i][j]+soln[i-1][j],grid[i][j]+ soln[i][j-1]);

      }

    }
      return soln[m][n];
  }

  public static int solve(int[][] grid,int m,int n){

    if(m==0 && n==0)
      return grid[0][0];

    if(n==0)
      return grid[m][n] + solve(grid,m-1,n);
    if(m==0)
      return grid[m][n] + solve(grid,m,n-1);


    return Math.min(grid[m][n]+ solve(grid,m-1,n),grid[m][n]+ solve(grid,m,n-1));

  }

  public static void main(String[] args) {

    int[][] grid = {{1,3,1},{1,5,1},{4,2,1}};
   System.out.println( minPathSum(grid));


  }
}
