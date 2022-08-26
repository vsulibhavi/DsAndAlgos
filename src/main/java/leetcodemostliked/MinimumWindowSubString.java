package leetcodemostliked;

import java.util.HashMap;
import java.util.Map;

class MinimumWindowSubString {

  //O(m^2)
  public static String minWindow(String s, String t) {

    Integer fromIndex=null;
    Integer endIndex = null;

    for(int j=0;j<s.length();j++){

      var chars = x(t);

      for(int i=j;i<s.length();i++){
        if(chars.containsKey(s.charAt(i)))
        {
          if(chars.get(s.charAt(i)) > 1)
            chars.put(s.charAt(i),chars.get(s.charAt(i))-1);
          else
            chars.remove(s.charAt(i));
          if(chars.isEmpty()){


            if(fromIndex ==null || (i-j) < (endIndex - fromIndex)){
              fromIndex = j;
              endIndex = i;
            }else
            {
              break;
            }

          }
        }

      }

    }

    if(fromIndex!=null && fromIndex>Integer.MIN_VALUE)
      return s.substring(fromIndex,endIndex+1);

    return "";

  }

  public static Map<Character,Integer> x(String t){
    Map<Character,Integer> chars = new HashMap<>();

    for(int i=0;i<t.length();i++){

      chars.put(t.charAt(i),chars.getOrDefault(t.charAt(i),0)+1);

    }
    return chars;
  }

  //optimal using sliding window
  //

  public static String minWindowSlidingWindow(String s,String t){

     var tMap = x(t);
     int formed = 0;
    Integer fromIndex=null;
    Integer endIndex = null;
    int l=0;
    int r=0;
    int required = tMap.size();

   return "";





  }

  public static void main(String[] args) {

    System.out.println(minWindow("cabwefgewcwaefgcf",
        "cae"));

  }

}
