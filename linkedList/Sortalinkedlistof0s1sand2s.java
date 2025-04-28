package linkedList;

//https://www.geeksforgeeks.org/problems/given-a-linked-list-of-0s-1s-and-2s-sort-it/1

/*


Given the head of a linked list where nodes can contain values 0s, 1s, and 2s only. Your task is to rearrange the list so that all 0s appear at the beginning, followed by all 1s, and all 2s are placed at the end.

Examples:

Input: head = 1 → 2 → 2 → 1 → 2 → 0 → 2 → 2

Output: 0 → 1 → 1 → 2 → 2 → 2 → 2 → 2

Explanation: All the 0s are segregated to the left end of the linked list, 2s to the right end of the list, and 1s in between.
Input: head = 2 → 2 → 0 → 1

Output: 0 → 1 → 2 → 2

Explanation: After arranging all the 0s, 1s and 2s in the given format, the output will be 0 → 1 → 2 → 2.
Constraints:
1 ≤ no. of nodes ≤ 106
0 ≤ node->data ≤ 2

*/


import java.util.Scanner;

public class Sortalinkedlistof0s1sand2s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of nodes: ");
        int n = sc.nextInt();

        if(n == 0){
            System.out.println("No of nodes is zero");
            return;
        }

        System.out.println("Enter node no 1:");
        Node head = new Sortalinkedlistof0s1sand2s.Node(sc.nextInt());
        Sortalinkedlistof0s1sand2s.Node tail = head;

        for(int i = 2; i <= n; i++){
            System.out.println("Enter node no " + i + ":");
            tail.next = new Sortalinkedlistof0s1sand2s.Node(sc.nextInt());
            tail = tail.next;
        }

        System.out.println("Before sap rate list: ");
        printlist(head);

        head = segregate(head);

        System.out.println("After sap rate list: ");
        printlist(head);
    }

    static public void printlist(Sortalinkedlistof0s1sand2s.Node list) {
        Sortalinkedlistof0s1sand2s.Node curr = list;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static class Node {
        int data;
        Sortalinkedlistof0s1sand2s.Node next;
        Node() {}
        Node(int val) {this.data = val;}
        Node(int val, Sortalinkedlistof0s1sand2s.Node next) {this.data = val;this.next = next;}
    }

    static Node segregate(Node head) {
        // code here
        if (head == null || head.next == null) return head;

        Node zeroD = new Node(0);
        Node oneD = new Node(0);
        Node twoD = new Node(0);

        Node zero = zeroD, one = oneD, two = twoD;
        Node curr = head;

        while (curr != null) {
            if (curr.data == 0) {
                zero.next = curr;
                zero = zero.next;
                curr = curr.next;
            } else if (curr.data == 1) {
                one.next = curr;
                one = one.next;
                curr = curr.next;
            } else {
                two.next = curr;
                two = two.next;
                curr = curr.next;
            }
        }
        zero.next = (oneD.next != null) ? (oneD.next) : (twoD.next);
        one.next = twoD.next;
        two.next = null;

        head = zeroD.next;
        return head;
    }
}
