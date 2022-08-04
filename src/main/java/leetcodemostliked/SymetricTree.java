package leetcodemostliked;

import binaryTree.Node;
import binaryTree.ReadBinaryTreeFromConsole;

public class SymetricTree {


  public static boolean isSymmetric(Node node) {

    return helper(node, node);
  }

  private static boolean helper(Node node1, Node node2) {

    if (node1 == null && node2 == null) {
      return true;
    }
    if (node1 == null || node2 == null) {
      return false;
    }

    return node1.data == node2.data && helper(node1.left, node2.right) && helper(node1.right,
        node2.left);

  }

  public static void main(String[] args) {

    Node root = ReadBinaryTreeFromConsole.readLevelOrder(new int[]{1, 2, 2, 3, 4, 4, 3}, 0, 6);
   System.out.println( isSymmetric(root));


  }

}
