package binaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class LevelOrderTraversal {


    public static void recursiveLevelOrderTraversal(Node root){

       int height =  HieghtOfTree.hieghtOfTree(root);

       for(int level=1;level<=height;level++){

           printLevelOrder(root,level);
       }


    }

    private static void printLevelOrder(Node root, int level) {

        if(root ==null)
            return;
        if(level ==1)
            System.out.println(root.data);
        else {

            printLevelOrder(root.left,level -1 );
            printLevelOrder(root.right,level -1 );

        }
    }

    public static void BFSLevelOrderTraversal(Node root){

        Queue<Node> queue = new LinkedList<>();
        if(root == null)
            return;

        queue.offer(root);

        while (!queue.isEmpty()){

            Node ele = queue.poll();
            System.out.println(ele.data);
            if(ele.left !=null)
            queue.offer(ele.left);
            if(ele.right != null)
            queue.offer(ele.right);


        }

    }
}
