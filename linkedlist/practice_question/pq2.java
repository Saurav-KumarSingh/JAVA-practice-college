//finding Nth node from end of LinkedList
package linkedlist.practice_question;

import java.util.Scanner;

class Node {
    int info;
    Node next;

    Node(int info) {
        this.info = info;
        this.next = null;
    }
}

class SingleLinkedListatEnd {
    Node head = null;
    Node tail = null;

    // Insert at the end of the list
    public void insertAtEnd(int value) {
        Node new_Node = new Node(value);
        if (head == null) { // First node
            head = new_Node;
            tail = new_Node;
        } else { // Append new node
            tail.next = new_Node;
            tail = new_Node;
        }
    }

    // Display the list
    public void showList() {
        Node temp = head;
        if (temp == null) {
            System.out.println("SLL is Empty...");
            return;
        }
        while (temp != null) {
            System.out.print(temp.info + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL"); // End of list
    }

    public void findNthFromEnd(int n) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        // Node temp = head;
        // int size = 0;

        // // Calculate the size of the list
        // while (temp != null) {
        //     temp = temp.next;
        //     size++;
        // }

        // // Validate N
        // if (n > size || n <= 0) {
        //     System.out.println("Invalid Nth Node position...");
        //     return;
        // }

        // temp = head;
        // // Find the (size-n)th node from start
        // int nthFromEnd = size - n+1;
        // for (int i = 0; i < nthFromEnd-1; i++) {  
        //     temp = temp.next;
        // }


        //using 2 pointers approach or only 1 traversal needed

        Node slow=head;
        Node fast=head;
        for (int i = 0; i < n; i++) {
            if (fast==null) System.out.println("Invalid Nth Node position...");
            fast=fast.next;
        }

        while (fast!=null) { 
            fast=fast.next;
            slow=slow.next;
        }
        System.out.println(n + "th node from end: "+slow.info);
    }
}

public class pq2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        SingleLinkedListatEnd ob = new SingleLinkedListatEnd();
        System.out.println("This is For Performing Operations on LinkedList:");

        while (true) {
            System.out.println("\n-------------------Menu---------------------------");
            System.out.println("1. Insert");
            System.out.println("2. Print");
            System.out.println("3. Find Nth Node from End");
            System.out.println("4. Exit");
            System.out.println("\n--------------------------------------------------");
            System.out.print("Enter Choice: ");
            int cho = in.nextInt();
            switch (cho) {
                case 1:
                    System.out.print("Enter Info: ");
                    int value = in.nextInt();
                    ob.insertAtEnd(value);
                    break;
                case 2:
                    System.out.println("List: ");
                    ob.showList();
                    break;
                case 3:
                    System.out.print("Enter N: ");
                    int n = in.nextInt();
                    ob.findNthFromEnd(n);
                    break;
                case 4:
                    System.out.println("Exit...");
                    in.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Operation...");
                    break;
            }
        }
    }
}
