package binaryTree;

public class BSTToDLL {

 private static Node dllRoot = null;
 private static Node tail = null;
 private static Node  lastVisited = null;

  public static void inOrderTraversal(Node curr){

    if(curr!=null) {
      inOrderTraversal(curr.left);


      if (lastVisited != null) {
        if(dllRoot == null)
          dllRoot = lastVisited;
        lastVisited.next = curr;
        curr.prev = lastVisited;

      }
      System.out.println(curr.data);
      lastVisited = curr;
      tail = curr;
      inOrderTraversal(curr.right);
    }
  }



  public static void main(String[] args) {


      Node n = ReadBinaryTreeFromConsole.readTree("10 8 6 9 3 7");
      System.out.println("print the level order");
              ReadBinaryTreeFromConsole.printLevelOrderInNewLine(n);
    System.out.println("print the inorder order");
    inOrderTraversal(n);


    System.out.println("dll");
    while(dllRoot!=null){
      System.out.println(dllRoot.data);
      dllRoot= dllRoot.next;
    }

    while(dllRoot!=null){
      System.out.println(dllRoot.data);
      dllRoot= dllRoot.next;
    }

    System.out.println("descending order");

    while (tail!=null){
      System.out.println(tail.data);
      tail = tail.prev;
    }


  }

  private static Node firstVisitedNode(Node n) {

    if(n==null)
      return null;
    if(n.left == null)
      return n;

    return  firstVisitedNode(n.left);
  }

}
