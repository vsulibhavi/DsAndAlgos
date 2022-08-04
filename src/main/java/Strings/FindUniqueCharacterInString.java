package Strings;

import java.util.HashMap;

public class FindUniqueCharacterInString {

  public static void main(String[] args) {

    String s = "loveleetcode";
   int[] alphabets = new int[26];
    char firstNonUniqueIndex = 0;
    for(int i=0;i<s.length();i++){
      alphabets[s.charAt(i) - 'a']++;
    }

    for(int i=0;i<s.length();i++) {

      if(alphabets[s.charAt(i) - 'a'] == 1 ){
        System.out.println(i);
        break;
      }


    }



  }
}
