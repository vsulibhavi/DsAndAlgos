package binaryTree;

import org.junit.Test;

import static org.junit.Assert.*;

public class LevelOrderTraversalTest {

    @Test
    public void recursiveLevelOrderTraversal() {

        LevelOrderTraversal.recursiveLevelOrderTraversal(ReadBinaryTreeFromConsole.readTree("10 8 15 7 9 12 20"));
    }

    @Test
    public void BFSLevelOrderTraversal() {

        LevelOrderTraversal.BFSLevelOrderTraversal(ReadBinaryTreeFromConsole.readTree("10 8 15 7 9 12 20"));

    }
}