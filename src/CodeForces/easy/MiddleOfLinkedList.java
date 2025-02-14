package easy;

import java.util.ArrayList;

public class MiddleOfLinkedList {

    //  Definition for singly-linked list.
      public class ListNode {
          int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    public static void main(String[] args) {

    }
    public ListNode middleNode(ListNode head) {
        ArrayList<ListNode> arrayList = new ArrayList<>();
        int length = 0;
        while (head != null) {
            arrayList.add(head);
            head = head.next;
            length++;

        }
        return arrayList.get(length/2);

}
}
