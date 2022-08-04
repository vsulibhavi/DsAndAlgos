package dynamicProgramming;

public class RodCutting {

  //in a unbounded choice the element can be considered again and again .

  // this is similiar to unbounded knapsack problem

  private static int[] price = new int[]{0,3, 5, 8, 9, 10, 100, 17, 20};
//{3, 5, 8, 9, 10, 17, 17, 20}
  public static int rodCutting(int index, int rodLen) {

    if(index<=0 || rodLen<=0)
      return 0;

    if((rodLen - index) < 0 ) return  rodCutting(index - 1, rodLen);

    return Math.max(price[index] + rodCutting(index, rodLen - index),
        rodCutting(index - 1, rodLen));


  }

  public static void main(String[] args) {

    System.out.println(rodCutting(8,8));
  }
}
