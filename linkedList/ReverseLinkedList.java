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


import java.util.Scanner;

public class ReverseLinkedList {
    public static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of nodes: ");
        int n = sc.nextInt();

        if(n == 0){
            System.out.println("No of nodes is zero");
            return;
        }

        System.out.println("Enter node no 1:");
        LinkedList head = new LinkedList(sc.nextInt());
        LinkedList tail = head;

        for(int i = 2; i <= n; i++){
            System.out.println("Enter node no " + i + ":");
            tail.next = new LinkedList(sc.nextInt());
            tail = tail.next;
        }

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
