package linkedList;

public class LengthOfLinkedList {

    public static void main(String[] args) {

    }


    public static int length(Node head){

        if (head == null){
            return 0;
        }

        Node temp = head;
        int count = 0;
        while (temp != null){
            temp = temp.next;
            count++;
        }
        return count;
    }
}
