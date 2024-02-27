package linkedList;

public class DeleteHeadOfLInkList {


    public static void main(String[] args) {

    }

    public static Node deleteNode(Node head) {
        if (head == null) {
            return head;
        }
        Node temp = head;
        head = head.next;
        return head;
    }
}
