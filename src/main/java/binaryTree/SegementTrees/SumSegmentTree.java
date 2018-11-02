package binaryTree.SegementTrees;

import binaryTree.Node;

public class SumSegmentTree {



    public static int[] contructTreeUtil(int[] array, int n){


        int hiegthOfTree = (int) Math.ceil(Math.log(n)/Math.log(2)) + 1;

        int[] st  =  new int[(int) Math.pow(2,hiegthOfTree)];
        contructTree(st,array,0,n-1,0);
        return st;
    }

    public static int contructTree(int[] st,int[] array,int ss,int se,int si){

        if(ss == se)
        {
            st[si]  = array[ss];
            return st[si];
        }
        int mid = (ss + se)/2;
        st[si] = contructTree(st,array,ss,mid,si*2+1) + contructTree(st,array,mid+1,se,si*2+2);
        return st[si];
    }

    public static int sumInRange(int[] st,int[] arr,int qs,int qe,int ss,int se,int si){


        if(ss >= qs && se <= qe){
            return st[si];
        }
        if(se < qs || ss > qe) return 0;

        int mid = (ss + se)/2;

        return sumInRange(st,arr,qs,qe,ss,mid,si*2+1) + sumInRange(st,arr,qs,qe,mid+1,se,si*2+2);

    }


   public static void main(String[] args){

        int[] arr = new int[]{3,4,5,2,15,13,56,32,33};
       int[] st =  contructTreeUtil(arr,arr.length);
        System.out.println(sumInRange(st,arr,3,6,0,8,0));



   }
}
