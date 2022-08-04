package leetcodemostliked;

import java.util.Stack;

public class LengthOfLongestValidParenthisis {


  //stack approach time - O(n) space - O(n)
  public static int lvp_stack(String s){

    int maxLength = 0;
    Stack<Integer> stack = new Stack<>();
    stack.push(-1);
    for(int i=0;i<s.length();i++){

      if(s.charAt(i) == '('){
          stack.push(i);
          continue;
      }

        stack.pop();
      if(!stack.empty()){
        maxLength = Math.max(maxLength,i - stack.peek());
      }
      else
        stack.push(i);

    }

   return maxLength;

  }

  private static int  lvp_doubleScan(String s){

    int leftCounter = 0;
    int rightCounter = 0;
    int maxLength = 0;

    for(int i=0;i<s.length();i++){

      if(s.charAt(i) == '(')
        leftCounter++;
      else
        rightCounter++;

      if(rightCounter== leftCounter){
        maxLength = Math.max(maxLength,2* rightCounter);
      }

      if(rightCounter>leftCounter){
        rightCounter = leftCounter =0;
      }


    }
    leftCounter=rightCounter=0;
    for(int i=s.length() -1 ;i>=0;i--){

      if(s.charAt(i) == ')')
        rightCounter++;
      else
        leftCounter++;

      if(leftCounter==rightCounter)
        maxLength = Math.max(maxLength,rightCounter * 2);

      if(leftCounter> rightCounter)
      {
        leftCounter = rightCounter=0;
      }

    }
    return maxLength;
  }

  public static void main(String[] args) {

    String s = ")()())";
    System.out.println(lvp_stack(s));
    System.out.println(lvp_doubleScan(s));
  }

}
