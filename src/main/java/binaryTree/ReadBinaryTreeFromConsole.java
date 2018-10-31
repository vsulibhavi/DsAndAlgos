package binaryTree;

import java.util.Scanner;

public class ReadBinaryTreeFromConsole {


    public static Node readTree(String s){

        Node root = null;
        String[] stringNumbers = s.split("\\s+");

        for(String stringNumber : stringNumbers){

            int num = Integer.parseInt(stringNumber);
            Node n = insertNode(root,num);
            if(root == null) root = n;
        }

        return root;
    }

    public static Node insertNode(Node root, int num) {

        if(root == null)
            return new Node(num);

        while (root !=null) {
            if (num < root.data)
            {
                if(root.left !=null)
                root = root.left;
                else
                {
                    root.left = new Node(num);
                    break;
                }

            }

            else if (num > root.data)
            {
                if(root.right !=null)
                    root = root.right;
                else
                {
                    root.right = new Node(num);
                    break;
                };
            }
            else if(num == root.data) break;
        }

        return root;

    }

    public static Node deleteNode(Node root , int num){

        if(root == null) return null;


        Node currNode = root;
        Node prev = null;
        while(currNode != null){

            if(currNode.data == num ) {

                Node newNode;
                if(currNode.left == null && currNode.right == null)
                    newNode = null;
                else
                 newNode = replaceNode(currNode);
                if(prev == null)
                    return newNode;
                if(prev.left!=null && prev.left.data == num)
                    prev.left = newNode;
                else if( prev.right!=null && prev.right.data == num)
                    prev.right = newNode;

                break;
            }

            prev = currNode;

            if(num < currNode.data) currNode= currNode.left;
            if(num > currNode.data) currNode = currNode.right;

        }
        return root;

    }

    private static Node replaceNode(Node node) {

        Node original = node;
        if(node.right !=null)
        {
            Node prev = node;
            node = node.right;
            if(node.right == null && node.left == null)
            {
                return node;
            }
            while (node.left !=null){
                prev = node;
                node = node.left;


            }
            prev.left = null;
            node.right = original.right;
            node.left = original.left;
            return node;
        }
        else {

            Node prev = node;
            node = node.left;
            if(node.left == null && node.right == null){

                return node;
            }
            while (node.right !=null){
                prev = node;
                node = node.right;
            }
            if(node.left !=null) {
                prev.right = node.left;
            }
            else {
                prev.right = null;
            }
            node.right = original.right;
            node.left = original.left;
            return node;
        }
    }


    public static void main(String[] args){
       Node root =  readTree("10 8 15 7 9 12 20");
        inorder(root);

    }

    public static void inorder(Node root) {


        if(root == null) return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

}
