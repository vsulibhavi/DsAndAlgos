package binaryTree;

public class BinaryTreeBST {

  public static boolean is_bst(Node root){

    if(root != null){

       return ((root.left ==null || root.data > root.left.data) && (root.right ==null || root.data < root.right.data))
           && is_bst(root.left) && is_bst(root.right);

       }
    return true;

    }

  public static void main(String[] args) {

   Node root = ReadBinaryTreeFromConsole.readTree("30 5 35 3 20 32 40");
   System.out.println(is_bst(root));


  }

}
