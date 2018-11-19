package arrays;

public class binarySearchinRotatedArray {


    public static void main(String[] args){

      int  arr[] = {4,5, 6, 7, 8, 9, 10, 1,2,3};

     int pivot =  findPivot(arr,0,arr.length -1 );
     System.out.println("The pivot element is " + arr[pivot]);
      int ele = 1;
        int position= Integer.MIN_VALUE;
      if((ele >= arr[0]))
          position =   binarySearch(arr,0,pivot,ele);
      else
          position =    binarySearch(arr,pivot+1,arr.length -1 ,ele);

        System.out.println("The element fouond at " + position);

    }

    private static int findPivot(int[] arr,int low,int high) {

        if(high < low)
            return  -1 ;

        int mid = (low + high)/2;
        if(arr[mid]> arr[mid + 1])
            return mid;
        if(arr[mid] < arr[mid -1 ])
            return mid-1;
        if(arr[mid] < arr[0] )
         return    findPivot(arr,low,mid -1);
        else
         return    findPivot(arr,mid +1 ,high);

    }

    private static int binarySearch(int[] arr, int low, int high,int ele) {


        if(high < low)
            return -1;
        int mid = (low + high)/2;

        if(arr[mid] == ele)
            return mid;
        else if(ele < arr[mid])
           return binarySearch(arr,low,mid-1,ele);
        else
           return binarySearch(arr,mid +1,high,ele);

    }
}
