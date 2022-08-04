package leetcodemostliked;

import binaryTree.Node;
import binaryTree.ReadBinaryTreeFromConsole;

public class ConstructBinaryTreeFromPreorderInorder {

  private static int preOrderIndex = 0;

  public static Node binary_tree(int[] pre, int[] inorder, int low, int high) {

    if (low > high || high >= inorder.length) {
      return null;
    }

    int root = pre[preOrderIndex++];
    int indexPosInInorder = indexOfRoot(inorder, root, low, high);
    Node node = new Node(root);
    node.left = binary_tree(pre, inorder, low, indexPosInInorder - 1);
    node.right = binary_tree(pre, inorder, indexPosInInorder + 1, high);

    return node;
  }

  private static int indexOfRoot(int[] inorder, int root, int low, int high) {

    for (int i = low; i <= high; i++) {
      if (root == inorder[i]) {
        return i;
      }

    }
    return -1;
  }

  public static void main(String[] args) {

    int[] preorder = {3, 9, 20, 15, 7};
    int[] inorder = {9, 3, 15, 20, 7};

    Node root = binary_tree(preorder, inorder, 0, preorder.length-1);

    ReadBinaryTreeFromConsole.inorder(root);
  }
}
