package intermediat2;

public class InsertInLinkedList {

    public int val;
     public InsertInLinkedList next;
     InsertInLinkedList(int x) {
         val = x;
         next = null;
     }
    public static void main(String[] args) {

    }

    public InsertInLinkedList solve(InsertInLinkedList A, int B, int C) {


         InsertInLinkedList n = new InsertInLinkedList(C);

         if (B == 0) {
             n.next = A;
             return n;

         }
         InsertInLinkedList current = A;
         for (int i = 0; current != null && i < C-1; i++) {
             current = current.next;

         }
         if (current == null || current.next == null) {
             current.next= n;

         }
         else {
             n.next = current.next;
             current.next =n;
         }
         return A;

    }
}
