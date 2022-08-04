package binaryTree;

public class MerkleTree {


  public static Integer sumTree(Node node){

    if(node == null)
      return 0;
    if(node.right==null && node.left == null)
      return node.data;
    Integer leftSubTreeSum = sumTree(node.left);
    Integer rightSubTreeSum = sumTree(node.right);

    node.data = leftSubTreeSum + rightSubTreeSum;
    return node.data;


  }

  public static void main(String[] args) {

    System.out.println(sumTree(ReadBinaryTreeFromConsole.readTree("4 2 30 3 18 348 82")).toString());
  }
}
