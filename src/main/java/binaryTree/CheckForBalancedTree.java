package binaryTree;

import java.util.Map;

public class CheckForBalancedTree {

    //n^2 implementation
    public static boolean balance(Node root){


        if(root ==null || (root.left == null && root.right == null))
            return true;

        return (balance(root.left) && balance(root.right) &&
                Math.abs(HieghtOfTree.hieghtOfTree(root.left) - HieghtOfTree.hieghtOfTree(root.right)) < 2);

    }

    static class Height{

        int height;
    }

    public static boolean balance(Node root , Height h){


        if(root ==null)
        {
            h.height = 0;
            return true;
        }

       Height lh = new Height();
        Height rh = new Height();

       boolean lb =  balance(root.left,lh);
       boolean rb = balance(root.right,rh);

       h.height = 1 + Math.max(lh.height,rh.height);

       return lb && rb && Math.abs(lh.height - rh.height) < 2;

    }
}

