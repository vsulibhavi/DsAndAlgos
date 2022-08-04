package Strings;

import java.util.LinkedList;

public class ReverseString {


  public static void main(String[] args) {

    String s1 = "vishal";
    System.out.println(reverse(s1));
    System.out.println(reverseInteger(421));
  }

  private static String reverse(String s1) {

    StringBuilder reverseStringBuilder = new StringBuilder();
    LinkedList<Character> characterStack = new LinkedList<>();

    for (int i = s1.length() - 1; i >= 0; i--) {

      reverseStringBuilder.insert(s1.length() - i - 1, s1.charAt(i));

    }
    return reverseStringBuilder.toString();
  }

  public static Integer reverseInteger(Integer number) {

    String numberString = number.toString();
    Integer reverseInteger = 0;
    for (int i = 0; i < numberString.length(); i++) {

      reverseInteger =
          reverseInteger + ((Double) Math.pow(10, i)).intValue() * (numberString.charAt(i) - '0');
    }
    return reverseInteger;


  }
}
