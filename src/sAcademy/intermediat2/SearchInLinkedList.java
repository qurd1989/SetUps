package intermediat2;

public class SearchInLinkedList {
    public int val;
     public SearchInLinkedList next;
    SearchInLinkedList(int x) { val = x; next = null; }
    public static void main(String[] args) {

    }
    public int solve(SearchInLinkedList A, int B) {

        while (A != null) {
            if (A.val == B) {
                return 1;
            }
            A = A.next;
        }
        return  0;

    }
}
