package matrix;

public class SearchInSortedMatrix {

  static void sism(int[][] mat,int row,int col,int key){

    int j=col -1;
    int i=0;
    while(j>=0 && i<row) {
      if (key == mat[i][j])
      {
        System.out.println(""+ i +" " + j);
        break;
      }
      else if(key < mat[i][j]){
        j--;
      }
      else
        i++;


    }

  }

  public static void main(String[] args) {

    int[][] mat = {
      {1,3,5,7,9},
      {2,10,12,14,16}
    };

    sism(mat,2,5,14);
  }

}
