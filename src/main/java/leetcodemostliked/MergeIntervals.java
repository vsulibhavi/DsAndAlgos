package leetcodemostliked;

import java.util.Arrays;
import java.util.LinkedList;

public class MergeIntervals {


  public static void main(String[] args) {

    int[][] intervals = new int[][]{{1,3},{8,10},{15,18},{2,6}};
    
    System.out.println(mergeIntervals(intervals));


  }

  private static int[][] mergeIntervals(int[][] intervals) {

    int[][] newInterval = new int[intervals.length][2];

    Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

    LinkedList<int[]> merged = new LinkedList<>();

    for (int[] pair : intervals) {

      if (merged.isEmpty() || merged.getLast()[1] < pair[0])
        merged.add(pair);
      else
        merged.getLast()[1] = Math.max(merged.getLast()[1], pair[1]);

    }

    return merged.toArray(new int[merged.size()][]);

    /*int newIntervalIndex = 0;
    int i=0;
    while(i<intervals.length-1){

      if(intervals[i][1] > intervals[i+1][0]){

        int[] pair = new int[2];
        pair[0] = intervals[i][0];
        pair[1] = Math.max(intervals[i][1],intervals[i+1][1]);
        newInterval[i] = pair;
        newIntervalIndex++;

      }else {
        newInterval[newIntervalIndex++] = intervals[i];
        newInterval[newIntervalIndex++] = intervals[i+1];
      }
      i= i+2;
    }
      return newInterval;
  }*/
  }
}
