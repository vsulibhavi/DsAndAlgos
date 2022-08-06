package leetcodemostliked;

public class ContainerWithMostWater {

  // brute force approach o(n^2)
  public static int containerAreaWithMostWater(int height[]){

    int maxArea=0;
    for(int i=0;i<height.length-1;i++){

      for(int j=i+1;j<height.length;j++){

        maxArea = Math.max(maxArea,Math.min(height[i],height[j]) * Math.abs(i-j));
      }
    }
      return maxArea;
  }

  // two pointer approach O(n)
  public static int containerAreaWithMostWaterTwopointer(int height[]) {

    int first = 0;
    int last = height.length-1;
    int maxArea=0;


    while(first<last){

      maxArea = Math.max(maxArea,Math.min(height[first],height[last]) * Math.abs(first-last));
      if(height[first] < height[last])
        first++;
      else
        last--;

    }
    return maxArea;

  }
  public static void main(String[] args) {

    int[] height = new int[]{1,8,6,2,5,4,8,3,7};

    System.out.println(containerAreaWithMostWaterTwopointer(height));


  }
}
