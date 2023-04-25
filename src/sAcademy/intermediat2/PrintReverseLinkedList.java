package intermediat2;

 class PrintReverseLinkedList {

    public int val;
    public PrintReverseLinkedList next;
    PrintReverseLinkedList(int x) { val = x; next = null; }
  }

  class Solution {
    public void solve(PrintReverseLinkedList A) {

        if (A == null) {
            return;
        }
        solve(A.next);
        System.out.println(A.val);
    }
}
