package dynamicProgramming;

import java.util.Scanner;

public class GoldMineProblem {


    public static void main(String[] args){


        int row, col, i, j;
        int arr[][] = new int[10][10];
        Scanner scan = new Scanner(System.in);

        // enter row and column for array.
        System.out.print("Enter row for the array (max 10) : ");
        row = scan.nextInt();
        System.out.print("Enter column for the array (max 10) : ");
        col = scan.nextInt();

        // enter array elements.
        System.out.println("Enter " +(row*col)+ " Array Elements : ");
        for(i=0; i<row; i++)
        {
            for(j=0; j<col; j++)
            {
                arr[i][j] = scan.nextInt();
            }
        }

        System.out.println("largest mine = "+goldMine(arr,row,col));



    }

    private static int goldMine(int[][] arr, int row, int col) {

        for(int colit=1;colit<col;colit++){

            for(int rowit = 0;rowit<row;rowit++){

                arr[rowit][colit] += Math.max(Math.max(getValue(arr,rowit+1,colit-1,row,col),getValue(arr,rowit,colit-1,row,col)),
                        getValue(arr,rowit-1,colit-1,row,col));

            }

        }

        int largest = 0;
        for(int rowit = 0;rowit<row;rowit++){

            if(arr[rowit][col-1] > largest)
                largest = arr[rowit][col-1];
        }
        return largest;


    }

    private static int getValue(int[][] arr, int rowit, int colit,int row,int col) {

        if(rowit <0 || colit < 0 || rowit >= row || colit >=col)
            return Integer.MIN_VALUE;
        return arr[rowit][colit];
    }
}
