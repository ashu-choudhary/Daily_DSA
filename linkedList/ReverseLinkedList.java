package linkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {

        LinkedList head = new LinkedList(1);
        head.next = new LinkedList(2);
        head.next.next = new LinkedList(3);
        head.next.next.next = new LinkedList(4);
        head.next.next.next.next = new LinkedList(5);

        System.out.println("Before reverse list: ");
        printlist(head);

        head = reverse(head);

        System.out.println("After reverse list: ");
        printlist(head);

    }

    public static class LinkedList {
        int val;
        LinkedList next;
        LinkedList() {}
        LinkedList(int val) {this.val = val;}
        LinkedList(int val, LinkedList next) {this.val = val;this.next = next;}
    }

    static public void printlist(LinkedList list) {
        LinkedList curr = list;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    static LinkedList reverse(LinkedList head) {
        LinkedList prev = null;
        LinkedList curr = head;

        while (curr != null) {
            LinkedList next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;

    }
}
