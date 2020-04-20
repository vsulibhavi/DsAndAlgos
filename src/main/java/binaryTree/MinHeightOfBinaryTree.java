package binaryTree;

public class MinHeightOfBinaryTree {


    public static void main(String[] args) {

        Node n = ReadBinaryTreeFromConsole.readTree("10 8 6 9 3 7");

        System.out.println(minHeight(n));


    }

    private static int minHeight(Node root) {


        if (root.left == null && root.right == null) return 1;

        return 1 + Math.min(root.left == null ? Integer.MAX_VALUE : minHeight(root.left), root.right == null ? Integer.MAX_VALUE : minHeight(root
                .right));

    }
}
