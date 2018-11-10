package binaryTree;

public class DiameterOfTree {


    public static int getDiameter(Node root){

        if(root == null) return 0;

        int leftDiameter = getDiameter(root.left);
        int rightDiameter = getDiameter(root.right);

         return Math.max(Math.max(leftDiameter,rightDiameter),HieghtOfTree.hieghtOfTree(root.left) + 1 + HieghtOfTree.hieghtOfTree(root.right));
    }

}
