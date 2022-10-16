/*
Problem Statement
Given a linked list consisting of N nodes, your task is to check if the given list is palindrome or not.

A palindrome is a string/number that mirrors itself, for example, 21312 reverse is also 21312.
*/

/*
class Node {
    Node next;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
    }
}
*/
public static boolean IsPalindrome(Node head) {

    Node head2 = reverseLinkedList(head);
    while(head != null && head2 != null){
        if(head.val != head2.val){
            return false;
        }
        head = head.next;
        head2 = head2.next;
    }
    return true;
}

public static Node reverseLinkedList(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }