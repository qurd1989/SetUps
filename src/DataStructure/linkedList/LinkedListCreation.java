package linkedList;


class  Node{
    int data;
    Node next;
    Node(int data1, Node next1){
        this.data = data1;
        this.next = next1;
    }
    Node(int data1){
        this.data = data1;
        this.next = null;
    }

}
public class LinkedListCreation {
    public static void main(String[] args) {
     int arr[] = {1,2,3,4,5,12};
     Node y = new Node(arr[0]);
        System.out.println(y.next);

    }
}
