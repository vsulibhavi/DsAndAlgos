package concurrency;

import java.util.Arrays;

public class HelloRunnable implements Runnable {

  public void run() {
    try {
      Thread.sleep(1000000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("Hello from a thread!");
  }

  public static void main(String args[]) {
    (new Thread(new HelloRunnable())).start();

    int arr[] = new int[]{10, 2, 3, 4, 523, 23};


    for(int i=0;i<arr.length;i++){
      for(int j=i;j<arr.length;j++){

        if(arr[i]> arr[j]){

          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }

    Arrays.stream(arr).forEach(System.out::println);

    System.out.println((int)'Æ');

  }

}
