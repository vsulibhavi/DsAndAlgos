package binaryTree;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReadBinaryTreeFromConsoleTest {

    @Test
    public void deleteNode() {

        ReadBinaryTreeFromConsole.inorder(ReadBinaryTreeFromConsole.deleteNode(ReadBinaryTreeFromConsole.readTree("10 8 15 7 9 12 20"),8));
        System.out.println("");
        ReadBinaryTreeFromConsole.inorder(ReadBinaryTreeFromConsole.deleteNode(ReadBinaryTreeFromConsole.readTree("10 5 15 3 7 13 18 2 4 6 12"),5));
    }
}