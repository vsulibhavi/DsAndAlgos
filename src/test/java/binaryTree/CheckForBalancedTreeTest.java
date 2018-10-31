package binaryTree;

import org.junit.Test;

import static org.junit.Assert.*;

public class CheckForBalancedTreeTest {

    @Test
    public void balanceFail() {

        System.out.print(CheckForBalancedTree.balance(ReadBinaryTreeFromConsole.readTree("10 8 15 7 9 12 20"),new CheckForBalancedTree.Height()));
    }

    @Test
    public void balancePass(){

        System.out.print(CheckForBalancedTree.balance(ReadBinaryTreeFromConsole.readTree("10 8  7 9" ),new CheckForBalancedTree.Height()));

    }
}