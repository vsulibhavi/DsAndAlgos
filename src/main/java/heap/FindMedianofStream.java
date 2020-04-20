package heap;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class FindMedianofStream {


    public static void main(String[] args) {

        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        PriorityQueue<Integer> maxheap = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer integer, Integer t1) {
                return t1.compareTo(integer);
            }
        });

        int[] stream = new int[]{5, 15, 1, 3, 4, 10, 24, 58, 28, 2};


        for (int i = 0; i < stream.length; i++) {

            minheap.offer(stream[i]);
            if (i % 2 == 1) {
                int ele2 = minheap.poll();
                maxheap.offer(ele2);
            }
        }

        if (stream.length % 2 == 0) {
            System.out.println((maxheap.peek() + minheap.peek()) / 2);
        } else {
            System.out.println(minheap.peek());
        }

        Arrays.sort(stream);

        if (stream.length % 2 == 0) {
            System.out.println((stream[stream.length / 2] + stream[(stream.length - 1) / 2]) / 2);
        } else {

            System.out.println(stream[stream.length / 2]);
        }

        Arrays.stream(stream).forEach(ele -> System.out.print(ele + " "));

    }
}
