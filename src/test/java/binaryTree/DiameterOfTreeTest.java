package binaryTree;

import org.junit.Test;

import static org.junit.Assert.*;

public class DiameterOfTreeTest {

    @Test
    public void getDiameterOfTree() {


       System.out.println( DiameterOfTree.getDiameter(ReadBinaryTreeFromConsole.readTree("10 8 15 7 9 12 20")));
        System.out.println( DiameterOfTree.getDiameter(ReadBinaryTreeFromConsole.readTree("10 5 20 4 2 1 3 6 7 8 9 ")));

    }
}