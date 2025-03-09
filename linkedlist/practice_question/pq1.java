// Delete Node in a Linked List
package linkedlist.practice_question;

public class pq1 {
    public static void main(String[] args) {
        // Creating a sample linked list: 45 -> 55 -> 19 -> 90
        ListNode head = new ListNode(45);
        head.next = new ListNode(55);
        head.next.next = new ListNode(19);
        head.next.next.next = new ListNode(90);

        // Printing the original linked list
        System.out.print("Original List: ");
        printList(head);

        // Deleting node with value 5 (head.next)
        Solution solution = new Solution();
        solution.deleteNode(head.next);

        // Printing the modified linked list
        System.out.print("\nModified List: ");
        printList(head);
    }

    // Method to print the linked list
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}

// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) { 
        val = x; 
    }
}

// Solution class to delete the node in a linked list
class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
