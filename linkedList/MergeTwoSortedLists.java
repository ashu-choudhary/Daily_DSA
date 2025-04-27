package linkedList;

//https://leetcode.com/problems/merge-two-sorted-lists/description/

/*

You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.



Example 1:


Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
Example 2:

Input: list1 = [], list2 = []
Output: []
Example 3:

Input: list1 = [], list2 = [0]
Output: [0]


Constraints:

The number of nodes in both lists is in the range [0, 50].
-100 <= Node.val <= 100
Both list1 and list2 are sorted in non-decreasing order.


*/


import java.util.Scanner;

public class MergeTwoSortedLists {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of nodes in 1st list: ");
        int n1 = sc.nextInt();

        System.out.println("Enter no of nodes in 2nd list: ");
        int n2 = sc.nextInt();


        System.out.println("Enter node no 1 in 1st list:");
        ListNode head1 = new ListNode(sc.nextInt());
        ListNode tail1 = head1;

        for(int i = 2; i <= n1; i++){
            System.out.println("Enter node no " + i + " in 1st list:");
            tail1.next = new ListNode(sc.nextInt());
            tail1 = tail1.next;
        }



        System.out.println("Enter node no 1 in 2nd list:");
        ListNode head2 = new ListNode(sc.nextInt());
        ListNode tail2 = head2;

        for(int i = 2; i <= n2; i++){
            System.out.println("Enter node no " + i + " in 2nd list:");
            tail2.next = new ListNode(sc.nextInt());
            tail2 = tail2.next;
        }

        System.out.println("Before merge list 1: ");
        printlist(head1);
        System.out.println("Before merge list 2: ");
        printlist(head2);



        head1 = mergeTwoLists(head1,head2);

        System.out.println("After merged list: ");
        printlist(head1);
    }

    static public void printlist(ListNode list) {
        ListNode curr = list;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {this.val = val;}
        ListNode(int val, ListNode next) {this.val = val;this.next = next;}
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummynode = new ListNode(-1);
        ListNode temp = dummynode;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                temp.next = list1;
                list1 = list1.next;
            } else {
                temp.next = list2;
                list2 = list2.next;
            }

            temp = temp.next;

        }

        if (list1 != null) {
            temp.next = list1;
        } else {
            temp.next = list2;
        }

        return dummynode.next;
    }

}
