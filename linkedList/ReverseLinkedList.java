package linkedList;

//https://leetcode.com/problems/reverse-linked-list/description/

/*

206. Reverse Linked List
Solved
Easy
Topics
Companies
Given the head of a singly linked list, reverse the list, and return the reversed list.



Example 1:


Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]
Example 2:


Input: head = [1,2]
Output: [2,1]
Example 3:

Input: head = []
Output: []

*/


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
