package dynamicProgramming;

public class ZeroOneKnapsack {


    public static void main(String[] args){

        int v[] = {10, 40, 30, 50};
        int w[] = {5, 4, 6, 3};
        int maxWieght = 10;


      System.out.println(  maxValue(v,w,maxWieght,v.length));
      maxValueDp(v,w,maxWieght,v.length);

    }

    private static void maxValueDp(int[] v, int[] w, int maxWieght, int length) {





    }

    private static int maxValue(int[] v, int[] w, int maxWieght, int length){


        if(length==0) return 0;
        if(maxWieght - w[length-1] < 0) return maxValue(v,w,maxWieght,length -1);

        return Math.max(v[length-1] + maxValue(v,w,maxWieght - w[length-1],length -1),
                maxValue( v, w, maxWieght,length -1));

    }

}
