package heap;

import java.util.Arrays;
import java.util.List;

public class Heap {


    public static void maxHeapDown(int[] ar, int i, int n){

        int largest = i;
        int leftChild = 2*i;
        int rightChild = (2*i)+1;

        if(leftChild < n && ar[largest] < ar[leftChild]) {
            largest = leftChild;

        }
        if(rightChild < n && ar[largest] < ar[rightChild]){
            largest = rightChild;

        }

        if(i!=largest)
        {
            int temp = ar[i];
            ar[i] = ar[largest];
            ar[largest] = temp;
            maxHeapDown(ar,largest,n);
        }

        else
            return;


    }

    public static void  maxHeapifyUp(int[] ar,int i,int heapSize){

       int parent = (int) Math.floor(i/2);
       if(ar[i] > ar[parent] && i>0){

           int temp = ar[i];
           ar[i] = ar[parent];
           ar[parent] = temp;
           maxHeapifyUp(ar,parent,heapSize);
       }

       return;




    }

    public static int extractMax(int[] arr,int n) {

        if(n==0)
            throw new IllegalArgumentException("the array cant be of lenth 0 for extract max");

         int max = arr[0];
         int temp = arr[0];
         arr[0]= arr[n-1];
         arr[n-1] = Integer.MIN_VALUE;
         maxHeapDown(arr,0,n-1);
         return max;

    }

    public static void main(String[] args){

        heapify();
    }

    public static void heapify(){


        int arr[] = {6,8,10,12,15,16,32,1,8,9,6,12,7,2,Integer.MIN_VALUE};


        for(int i = arr.length/2;i>=0;i--) {
            maxHeapDown(arr,i,arr.length-1 );
        }


        Arrays.stream(arr).forEach(ele -> System.out.print(ele + " "));
        arr[arr.length-1] = 100;
        maxHeapifyUp(arr,arr.length-1,arr.length);
        System.out.println("");
        Arrays.stream(arr).forEach(ele -> System.out.print(ele + " "));
        System.out.println("");
        heapSort(arr,arr.length);
        Arrays.stream(arr).filter(ele -> ele> Integer.MIN_VALUE).forEach(ele -> System.out.print(ele + " "));

    }

   /* https://en.wikipedia.org/wiki/Heapsort */
    private static void heapSort(int[] arr, int length) {

       if(length ==0) return;
     int max =  extractMax(arr,length);
     arr[length-1] = max;
     heapSort(arr,length -1);
    }
}
