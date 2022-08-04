package leetcodemostliked;

public class FirstAndLastPositionofElementInSortedArray {

  private static int firstOccurence(int[] nums,int low ,int high, int target)
  {

    if(low>high) return -1;

    int mid = (low + high)/2;

    if(nums[mid] == target && nums[mid-1] < target)
      return mid;
    else if(target <= nums[mid]){
     return firstOccurence(nums, low, mid - 1, target);
    }
      else
     return firstOccurence(nums,mid+1,high,target);
    }

  private static int lastOccurence(int[] nums,int low ,int high, int target)
  {

    if(low>high) return -1;

    int mid = (low + high)/2;

    if(nums[mid] == target && nums[mid+1] > target)
      return mid;
    else if(target >= nums[mid]){
      return lastOccurence(nums, mid + 1, high, target);
    }
    else
      return lastOccurence(nums,mid+1,high,target);
  }


  public static void main(String[] args) {

   int[] nums = {5,7,7,8,8,10}; int target = 8;

    System.out.println(firstOccurence(nums,0, nums.length-1,8));
    System.out.println(lastOccurence(nums,0, nums.length-1,8));
  }


}
