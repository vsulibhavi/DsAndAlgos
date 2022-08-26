package leetcodemostliked;

public class SearchInsertPosition {


  public static int search_or_insert_position(int arr[],int low,int high, int key){


    if(low>high) return high+1;

    int mid = (low + high)/2;

    if(arr[mid] == key ||  ((mid==0 || key> arr[mid-1]) && ( key < arr[mid] ))  ){
      return mid;

    }
    else if(key > arr[mid])
     return search_or_insert_position(arr,mid+1,high,key);
    else
     return search_or_insert_position(arr,low,mid-1,key);


  }


  public static void main(String[] args) {

   int[] nums = {1};
   int target = 2;
    System.out.println(search_or_insert_position(nums,0,nums.length-1,target));

  }
}
