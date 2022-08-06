package leetcodemostliked;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TripletsWithZeroSum {


  public static List<List<Integer>> threeSum(int[] nums) {

    Arrays.sort(nums);
    List<List<Integer>> triplets = new ArrayList<>();
    for(int i=0;i<nums.length;i++){

      int l = i+1;
      int r = nums.length-1;
      while(l<r){

        int tripletsum = nums[i] + nums[l] + nums[r];
        if(tripletsum == 0){
          triplets.add(Arrays.asList(nums[i],nums[l],nums[r]));
          break;
        }
        else if(tripletsum<0){
          l++;
        }else
          r--;

      }

    }
    return triplets;
  }

  public static void main(String[] args) {

    threeSum(new int[]{-1,0,1,2,-1,-4}).stream().forEach(triplets -> System.out.println(triplets));

  }
}
