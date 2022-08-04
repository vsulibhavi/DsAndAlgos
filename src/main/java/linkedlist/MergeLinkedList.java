package linkedlist;

public class MergeLinkedList {


  public static void main(String[] args) {

    Node l1 = buildLinkedList(2, 8, 15);
    Node l2 = buildLinkedList(1, 3, 5);

    Node merged = merge(l1,l2);

    while (merged!=null) {

    System.out.println(merged.num);
    merged = merged.next;
    }



  }

  private static Node merge(Node l1, Node l2) {

    Node root = null ,curr = null;




    while (l1!=null && l2 != null) {

      Node temp = null;
      if (l1.num <= l2.num) {
        temp = l1;
        l1 = l1.next;
      } else {
        temp = l2;
        l2 = l2.next;
      }

      if (curr == null) {
        curr = temp;
        root = temp;
      } else {
        curr.next = temp;
        curr = temp;
      }

    }

    while (l1 !=null){
      curr.next = l1;
      curr = l1;
      l1 = l1.next;
    }

    while (l2 !=null){
      curr.next = l2;
      curr = l2;
      l2 = l2.next;
    }
    return root;
  }

  private static Node buildLinkedList(int... arr) {

    Node root = null;

    if (arr.length >= 1) {
      root = new Node();
      root.num = arr[0];
    }
    Node curr = root;
    for (int i = 1; i < arr.length; i++) {

      Node temp = new Node();
      temp.num = arr[i];
      curr.next = temp;
      curr = temp;
    }
    return root;
  }

}

class Node {

  int num;
  Node next;

}
