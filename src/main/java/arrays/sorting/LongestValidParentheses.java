package arrays.sorting;

import java.util.Stack;

public class LongestValidParentheses {


    public static void main(String[] args) {


        String exp = "(((";
        Stack<Integer> indexStack = new Stack<>();
        indexStack.push(-1);
        int longestValidParenthisisSoFar = 0;

        for (int i = 0; i < exp.length(); i++) {

            if (exp.charAt(i) == '(') {
                indexStack.push(i);
            } else {
                indexStack.pop();
                longestValidParenthisisSoFar = Math.max(i - indexStack.peek(), longestValidParenthisisSoFar);

            }

        }

        System.out.println(longestValidParenthisisSoFar);


    }
}
