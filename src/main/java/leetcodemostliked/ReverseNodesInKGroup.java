package leetcodemostliked;

class Node {

  int num;
  Node next;

}

public class ReverseNodesInKGroup {


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

  public static void main(String[] args) {

    Node head = buildLinkedList(1, 2, 3, 4, 5,6,7,8,9,10);
    Node newHead = reverse(head, 4);

    while (newHead != null) {
      System.out.println(newHead.num);
      newHead = newHead.next;
    }
  }

  private static Node reverse(Node head, int group) {

    int counter = 0;
    Node  prev = null;
    Node curr = head;
    Node newHead = null;
    while (curr != null) {

      Node newTemp = rev(curr, group);
      if (newHead == null) {
        newHead = newTemp;
      }
      else {
        prev.next = newTemp;
      }


      prev = skipG(newTemp, group);

      if(prev ==null)
        break;

      curr  = prev.next;

    }
    return newHead;

  }

  private static Node skipG(Node newTemp, int group) {

    while (group > 1 && newTemp != null) {

      newTemp = newTemp.next;
      group--;
    }
    return newTemp;

  }

  private static Node rev(Node head, int group) {

    Node curr = head;
    Node prev = null;
    while (group > 0 && curr!=null) {

      Node next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
      group--;
    }
    head.next = curr;
    return prev;
  }

}