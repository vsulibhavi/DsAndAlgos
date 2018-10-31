package binaryTree;

public class HieghtOfTree {


   public static int hieghtOfTree(Node root){

       if(root == null) return 0;
       return 1 + Math.max(hieghtOfTree(root.left),hieghtOfTree(root.right));

    }
}
