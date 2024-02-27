package linkedList;

public class SearchOfLinkedList {
    public static void main(String[] args) {

    }
    public static Node check(int arr[]){

        Node head = new Node(arr[0]);
        Node mover = (head);
        for (int i = 0; i<arr.length; i++){
            Node temp = new Node(arr[i]);
            mover.next=temp;
            mover=temp;
        }
        return head;

    }

}