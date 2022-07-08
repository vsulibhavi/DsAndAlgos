package arrays;

public class MovingAverageArray {


  private double[] window;
  int windowSize;
  int indexOfOldestElement;  //   100 3 5 4 2   add - 100  // add
  Double sum = 0.0;
  //add more variables as needed

  /*
   * Always invoked with windowSize > 0
   */
  public MovingAverageArray(final int windowSize) {

    window = new double[windowSize];


  }

  /*
   * Adds a new number to window and if window is full
   * then replace the oldest added number in the window
   */
  public void addNumberToWindow(final double number) {

    if(windowSize == window.length){

      window[indexOfOldestElement] = number;
      indexOfOldestElement = ++indexOfOldestElement % window.length;
    }
    sum = sum + number;
    window[windowSize]  = number;


  }

  //o(1)
  /*
   * Return the average of the numbers added that are currently present in the window
   */
  public double getAverage() {

      /* Double sum = 0.0;
    for(Double num : window){

      sum = sum + num;

    }*/

    return sum/windowSize;
  }
//O(1)

  public static void main(String[] args) {

    final MovingAverage movingAverage = new MovingAverage(4);
    movingAverage.addNumberToWindow(1.5d);
    movingAverage.addNumberToWindow(2.5d);

    System.out.println(movingAverage.getAverage()); // prints 2.0

    movingAverage.addNumberToWindow(3.0d);
    movingAverage.addNumberToWindow(3.5d);

    System.out.println(movingAverage.getAverage());
    movingAverage.addNumberToWindow(7.0d);
    System.out.println(movingAverage.getAverage());

  }
}
