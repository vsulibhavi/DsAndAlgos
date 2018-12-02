package heap;

import java.util.Arrays;

public class Heap {


    public static void maxHeap(int[] ar,int i,int n){

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
            maxHeap(ar,largest,n);
        }

        else
            return;


    }

    public static int extractMax(int[] arr,int n) {

        if(n==0)
            throw new IllegalArgumentException("the array cant be of lenth 0 for extract max");

         int max = arr[0];
         int temp = arr[0];
         arr[0]= arr[n-1];
         arr[n-1] = Integer.MIN_VALUE;
         maxHeap(arr,0,n-1);
         return max;

    }

    public static void main(String[] args){

        heapify();
    }

    public static void heapify(){


        int arr[] = {6,8,10,12,15,16,32,1,8,9,6,12,7,2};

        for(int i = arr.length/2;i>=0;i--) {
            maxHeap(arr,i,arr.length );
        }
        Arrays.stream(arr).forEach(ele -> System.out.print(ele + " "));
        System.out.println("");
        int n = arr.length;
        extractMax(arr,n--);
        System.out.println("");
        Arrays.stream(arr).filter(ele -> ele> Integer.MIN_VALUE).forEach(ele -> System.out.print(ele + " "));
        extractMax(arr,n--);
        System.out.println("");
        Arrays.stream(arr).filter(ele -> ele> Integer.MIN_VALUE).forEach(ele -> System.out.print(ele + " "));

    }
}
