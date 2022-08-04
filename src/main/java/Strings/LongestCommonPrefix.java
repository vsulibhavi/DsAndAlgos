package Strings;

public class LongestCommonPrefix {

  // using divide and conquer approach .

  public static String lcp(String[] strings,int low,int high){

    if(low==high)
      return strings[low];

    int mid = (high+low)/2;
    String lcp1 =  lcp(strings,low,mid);
    String lcp2 = lcp(strings,mid+1,high);

    StringBuilder lcpBuilder = new StringBuilder();
    for(int i=0;i<lcp1.length() && i < lcp2.length();i++){

      if(lcp1.charAt(i)== lcp2.charAt(i))
        lcpBuilder.append(lcp1.charAt(i));
      else
        break;
    }
    return lcpBuilder.toString();

  }

  public static void main(String[] args) {

    String[] strings = new String[]{"geeksforgeeks","geek","geels","geeluck","ge"};
    System.out.println(lcp(strings,0,strings.length-1));
  }



}
