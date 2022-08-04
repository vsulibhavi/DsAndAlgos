package leetcodemostliked;

public class LongestCommonSubSequence {

  static String s1 = "AGGTAB"; static String s2 = "GXTXAYB";



  public static int lcss(int i,int j){

    if(i<0 || j<0)
      return 0;

    if(s1.charAt(i) == s2.charAt(j)){
        return 1+ lcss(--i,--j);
    }
    return Math.max(lcss(i-1,j),lcss(i,j-1));
  }

  public static int lcss_dp(int l1,int l2){

    int[][] ijmat = new int[l1+1][l2+1];

    for(int i=0;i<l1;i++){

      if (s1.charAt(i) == s2.charAt(i))
      ijmat[i][0] = 1;
      ijmat[0][i] = 1;
    }


    for(int i=1;i<=l1;i++){
      for(int j=1; j<=l2;j++) {

        if (s1.charAt(i) == s2.charAt(j)){
          ijmat[i][j] = 1 + ijmat[i-1][j-1];

      }
        else {
          ijmat[i][j] = Math.max(ijmat[i-1][j],ijmat[i][j-1]);
        }

      }
    }

    return ijmat[l1][l2];



  }

  public static void main(String[] args) {

    System.out.println("recurrsion" + lcss(s1.length()-1,s2.length()-1));
    System.out.println("dp" + lcss_dp(s1.length()-1,s2.length()-1));


  }



}
