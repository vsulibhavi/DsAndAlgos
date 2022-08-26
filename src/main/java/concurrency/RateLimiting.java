package concurrency;

import java.util.HashMap;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicLong;

public class RateLimiting {


  //sliding window

  //   [ [ ],[ ], [ ]     ....]
  //      15, 16, ..60

  private HashMap<String, Queue<AtomicLong>>  keyToSlidingWindowMap = new HashMap<>();

  public boolean throttle(String key){

   var slidingWindow =  keyToSlidingWindowMap.getOrDefault(key,new ArrayBlockingQueue<AtomicLong>(60));


return false;

  }

}
