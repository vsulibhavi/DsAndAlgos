package leetcodemostliked;

public class RegularExpressionMatching {

  /*
  Given an input string s and a pattern p, implement regular expression matching with support for '.' and '*' where:

'.' Matches any single character.
'*' Matches zero or more of the preceding element.
The matching should cover the entire input string (not partial).
   */

  public static void main(String[] args) {

    String s = "aab";
    String p = "c*a*b";



   System.out.println( isPatternMatch(s, p,0,0));


  }
// the timecomplexity of recursion is O(2^n) can be further optimized by dp
  private static boolean isPatternMatch(String s, String p, int i,int j) {

    if(i>=s.length() && j>=p.length())
      return true;
    if(i>=s.length() || j>=p.length())
      return false;

    boolean match = (s.charAt(i) == p.charAt(j) ) || s.charAt(i) == '.';

    if(j+1 < p.length() && p.charAt(j+1) == '*') {
     return isPatternMatch(s,p,i,j+2) || (match && isPatternMatch(s,p,i+1,j));

    }

    if(match)
      return isPatternMatch(s,p,i+1,j+1);

    return false;



  }
}
