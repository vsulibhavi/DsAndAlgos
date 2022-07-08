package Strings;

import java.util.Arrays;
import java.util.Collections;

public class StringInSamePermutation {


  public static void main(String[] args) {

    String s1 = "masdboy";
    String s2 = "damboys";
    System.out.println(same_permutation(s1,s2));
  }

  private static boolean same_permutation(String s1, String s2) {

    StringBuilder stringBuilder = new StringBuilder(s2);
    for(int i=0;i<s1.length();i++){

      int indexOfChar = stringBuilder.indexOf( ((Character)s1.charAt(i)).toString());
      if(indexOfChar ==-1 || stringBuilder.length()==0)
       return false;

      stringBuilder.deleteCharAt(indexOfChar);

    }

    return stringBuilder.length() == 0;
  }

  private static boolean same_permutation_sorting(String s1, String s2) {

    Arrays.sort((s1.toCharArray()));

    return false;
  }

}
