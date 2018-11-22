package graph;
import com.sun.deploy.util.ArrayUtil;
import org.omg.PortableInterceptor.INACTIVE;

import java.lang.Integer.*;
import java.util.Comparator;
import java.util.PriorityQueue;


public class Dijkastra {






    public static void main(String[] args){


        int graph[][] = new int[][]{{0, 4, 0, 0, 0, 0, 0, 8, 0},
                {4, 0, 8, 0, 0, 0, 0, 11, 0},
                {0, 8, 0, 7, 0, 4, 0, 0, 2},
                {0, 0, 7, 0, 9, 14, 0, 0, 0},
                {0, 0, 0, 9, 0, 10, 0, 0, 0},
                {0, 0, 4, 14, 10, 0, 2, 0, 0},
                {0, 0, 0, 0, 0, 2, 0, 1, 6},
                {8, 11, 0, 0, 0, 0, 1, 0, 7},
                {0, 0, 2, 0, 0, 0, 6, 7, 0}
        };

        int graph2[][] = new int[][]{
                {0,1,4,Integer.MAX_VALUE},
                {Integer.MAX_VALUE,0,2,1},
                {Integer.MAX_VALUE,Integer.MAX_VALUE,0,2},
                {Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,0}

        };

      int d[] =   shortestPathFromSource(graph2,4,4,0);

      for(int i : d){
          System.out.print(i + " ");
      }

    }

    private static int[] shortestPathFromSource(int[][] graph,int row,int col, int source) {

        int d[] = new int[row];
        boolean visited[] = new boolean[row];

        for (int i = 0;i<row;i++)
        {
            d[i] = Integer.MAX_VALUE;
        }
        d[source] = 0;
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.comparing(key -> d[key]));

        priorityQueue.add(source);


        while (!priorityQueue.isEmpty()){

          int processNode =   priorityQueue.poll();
          if(visited[processNode] == true) continue;
          visited[processNode] = true;

            for(int j=0;j<row;j++){

                if(graph[processNode][j] == Integer.MAX_VALUE || visited[j] == true ) continue;

                if(graph[processNode][j] + d[processNode] < d[j]){
                    d[j] = graph[processNode][j] + d[processNode];
                    priorityQueue.offer(j);

                }

            }
        }

        return d;
    }

}
