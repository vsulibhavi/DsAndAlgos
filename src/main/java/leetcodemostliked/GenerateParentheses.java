package leetcodemostliked;

import java.util.HashMap;
import java.util.Map.Entry;

public class GenerateParentheses {

  public static void generate(int n,int open,int close,String paras){

    if(open == n && close == n )
    {
      System.out.println(paras);
      return;
    }

    if(open<n){
      generate(n,open+1,close,paras + "(");
    }
    if(close<open) {
      generate(n,open,close+1,paras + ")");
    }

  }

  public static void main(String[] args) {
    generate(3,0,0,"");
  }
}
