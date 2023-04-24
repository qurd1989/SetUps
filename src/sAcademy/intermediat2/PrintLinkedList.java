package intermediat2;

public class PrintLinkedList {

    public  int val;
    public PrintLinkedList next;
    PrintLinkedList(int x ){
        val = x;
        next = null;

    }
    public static void main(String[] args) {


        PrintLinkedList head = new PrintLinkedList(1);
        head.next = new PrintLinkedList(2);
        head.next.next = new PrintLinkedList(34);
        head.next.next.next = new PrintLinkedList(5);
        head.next.next.next.next = new PrintLinkedList(6);
        head.next.next.next.next.next = new PrintLinkedList(7);

        solve(head);

    }
    public static void solve( PrintLinkedList A) {

        while (A != null) {
            System.out.println(A.val + " ");

            A = A.next;

        }

        System.out.println("\n");


    }
}
