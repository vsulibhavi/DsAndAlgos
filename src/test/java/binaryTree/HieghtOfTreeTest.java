package binaryTree;

import org.junit.Test;

import static org.junit.Assert.*;

public class HieghtOfTreeTest {

    @Test
    public void hieghtOfTree() {


      Node root =   ReadBinaryTreeFromConsole.readTree("10 8 15 7 9 12 20 6");
       System.out.println( HieghtOfTree.hieghtOfTree(root));
    }
}