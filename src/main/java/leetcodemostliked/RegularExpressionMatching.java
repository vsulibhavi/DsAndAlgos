package leetcodemostliked;

public class RegularExpressionMatching {

  /*
  Given an input string s and a pattern p, implement regular expression matching with support for '.' and '*' where:

'.' Matches any single character.
'*' Matches zero or more of the preceding element.
The matching should cover the entire input string (not partial).
   */

  public static void main(String[] args) {

    String s = "missssssissippi";
    String p = "mis*.s*ip*.";

   System.out.println( isPatternMatch(s, p));


  }

  private static boolean isPatternMatch(String s, String p) {

    Character prevChar = null;
    char currentChar;
    boolean isMatch;
    int stringIndex = 0;
    int patternIndex = 0;
    while (stringIndex < s.length() && patternIndex < p.length()) {

      if (s.charAt(stringIndex) == p.charAt(patternIndex)) {
        prevChar = p.charAt(patternIndex);
        stringIndex++;
        patternIndex++;
      } else if (p.charAt(patternIndex) == '.') {
        prevChar = '.';
        stringIndex++;
        patternIndex++;
      } else if (p.charAt(patternIndex) == '*' && (prevChar == '.'
          || s.charAt(stringIndex) == prevChar)) {

        stringIndex++;

      }
      else if(p.charAt(1+patternIndex) == s.charAt(stringIndex) || p.charAt(1+patternIndex) ==  '.'){
        prevChar = p.charAt(patternIndex);
        stringIndex++;
        patternIndex +=2;
      }
      else {
        return false;
      }

    }
    if(stringIndex== s.length())
    return true;
    else
      return false;
  }
}
