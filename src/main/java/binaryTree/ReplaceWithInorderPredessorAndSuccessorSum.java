package binaryTree;

import java.util.ArrayList;
import java.util.PrimitiveIterator;

public class ReplaceWithInorderPredessorAndSuccessorSum {

    Node predessor,current;
    static ArrayList<Integer> inorderNodes =new  ArrayList<>();

    public static void getTree(Node root){

        inorderNodes.add(0);
        pushInorderToArray(root,inorderNodes);
        inorderNodes.add(0);
        changeNodesToAddSum(root,inorderNodes,new Counter());

    }

    private static void changeNodesToAddSum(Node root, ArrayList<Integer> inorderNodes,Counter counter) {

        if(root == null)
            return;
        changeNodesToAddSum(root.left,inorderNodes,counter);
        counter.increment();
        root.data = inorderNodes.get(counter.c-1) + inorderNodes.get(counter.c+1);
        changeNodesToAddSum(root.right,inorderNodes,counter);

    }

    private static void pushInorderToArray(Node root, ArrayList<Integer> inorderNodes) {

        if(root == null)
            return;
        pushInorderToArray(root.left,inorderNodes);
        inorderNodes.add(root.data);
        pushInorderToArray(root.right,inorderNodes);
    }

    public static class Counter {

        private int c; //local counter variable

        public Counter() {  //sets counter to 0
            this.c = 0;

        }
        /*
        public Counter(Counter counter){  //second constructor that allows us to set the count

        }
        */
        public void increment(){
            this.c++;
        }

        public void decrement(){
            this.c--;
        }

        public int getC() {
            return c;
        }
    }
}
