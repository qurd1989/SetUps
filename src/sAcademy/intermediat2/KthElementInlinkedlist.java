package intermediat2;


import org.w3c.dom.ls.LSInput;

//You are given the head of a linked list A and an integer B. You need to find the B-th element of the linked list.
//
//        Note : Follow 0-based indexing for the node numbering.
class ListNode {
    public int val;
    public ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class KthElementInlinkedlist {
    public static void main(String[] args) {

    }

    public int solve(ListNode A, int B) {


         ListNode currentLsit = A;
          int length = 0;
          while (currentLsit != null) {

              if (length == B) {
                  return currentLsit.val;
              }
              currentLsit = currentLsit.next;
              length++;
          }
          return length;
    }


    public  int solve1(ListNode A, int B) {

        int length = 0;

        for (ListNode currentLsit = A; currentLsit != null; currentLsit = currentLsit.next) {

            length++;
            if (length  == B) {
                return currentLsit.val;


            }
        }
        return length;

    }
}
