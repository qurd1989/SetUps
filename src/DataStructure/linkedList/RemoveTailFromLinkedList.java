package linkedList;

public class RemoveTailFromLinkedList {
    public static void main(String[] args) {

    }

    public static Node deleteLast(Node list){

        if (list == null || list.next== null){
            return list;
        }
        Node temp = list;
        while (temp.next.next != null){
            temp = temp.next;
        }
         temp.next =null;

        return list;
    }

}
