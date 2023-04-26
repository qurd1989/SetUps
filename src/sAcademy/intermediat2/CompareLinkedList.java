package intermediat2;

public class CompareLinkedList {

//    Given heads of two linked lists A and B, check if they are identical i.e.
//    each of their corresponding nodes should contain the same data.
//    The two given linked lists may or may not be of the same length.
    class ListNode {
        public int val;
     public ListNode next;
     ListNode(int x) { val = x; next = null; }
 }

    public static void main(String[] args) {


    }

    public int solve(ListNode A, ListNode B) {


        ListNode curerent1 = A, current2 = B;

        while (curerent1 != null && curerent1 != null) {

            if (curerent1==current2) {
                return 1;
            }

            curerent1 = curerent1.next;
            current2 = current2.next;
        }

        return 0;
}


}
