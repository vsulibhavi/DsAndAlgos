package binaryTree;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceWithInorderPredessorAndSuccessorTest {

    @Test
    public void getTree() {

        Node root = ReadBinaryTreeFromConsole.readTree("10 8 15 7 9 12 20");
        ReadBinaryTreeFromConsole.printLevelOrderInNewLine(root);
        System.out.println("");
        ReplaceWithInorderPredessorAndSuccessorSum.getTree(root);
        ReadBinaryTreeFromConsole.printLevelOrderInNewLine(root);
    }
}